package com.hibit2.hibit2.auth.service;

import com.hibit2.hibit2.auth.dto.TokenResponse;
import com.hibit2.hibit2.auth.support.JwtTokenProvider;
import com.hibit2.hibit2.domain.member.domain.Member;
import com.hibit2.hibit2.domain.member.domain.Role;
import com.hibit2.hibit2.domain.member.service.MemberService;
import com.hibit2.hibit2.infrastructure.oauth.endpoint.OAuthEndpoint;
import com.hibit2.hibit2.infrastructure.client.OAuthClient;
import com.hibit2.hibit2.infrastructure.dto.OAuthMember;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
@Service
public class AuthService {


    private final OAuthEndpoint oAuthEndpoint;
    private final OAuthClient oAuthClient;

    private final MemberService memberService;

    private final JwtTokenProvider jwtTokenProvider;


    public AuthService(final OAuthEndpoint oAuthEndpoint, final OAuthClient oAuthClient
    , final MemberService memberService, final JwtTokenProvider jwtTokenProvider) {
        this.oAuthEndpoint = oAuthEndpoint;
        this.oAuthClient = oAuthClient;
        this.memberService = memberService;
        this.jwtTokenProvider = jwtTokenProvider;
    }

    public String generateGoogleLink() {
            return oAuthEndpoint.generate();
    }

    @Transactional
    public TokenResponse generateTokenWithCode(final String code) {
        OAuthMember oAuthMember = oAuthClient.getOAuthMember(code);

        String email = oAuthMember.getEmail();

        if(!memberService.existByEmail(email)) {
            memberService.save(generateMemberBy(oAuthMember));
        }
        Member foundMember = memberService.findByEmail(email);
        String accessToken = jwtTokenProvider.createToken(String.valueOf(foundMember.getId()));

        return new TokenResponse(accessToken);
    }

    private Member generateMemberBy(final OAuthMember oAuthMember) {
        return new Member(oAuthMember.getEmail(),
            oAuthMember.getProfileImageUrl(),
            oAuthMember.getAge(),
            oAuthMember.getGender(),
            Role.USER);
    }
}