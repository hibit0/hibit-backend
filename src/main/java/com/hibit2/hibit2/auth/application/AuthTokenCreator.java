package com.hibit2.hibit2.auth.application;

import com.hibit2.hibit2.auth.domain.AuthToken;
import com.hibit2.hibit2.auth.domain.TokenRepository;
import org.springframework.stereotype.Component;

@Component
public class AuthTokenCreator implements TokenCreator {
    private final TokenProvider tokenProvider;
    private final TokenRepository tokenRepository;

    public AuthTokenCreator(final TokenProvider tokenProvider, final TokenRepository tokenRepository) {
        this.tokenProvider = tokenProvider;
        this.tokenRepository = tokenRepository;
    }

    public AuthToken createAuthToken(final Long memberId) {
        Long id =  memberId;
        String accessToken = tokenProvider.createAccessToken(String.valueOf(memberId));
        String refreshToken = createRefreshToken(memberId);
        return new AuthToken(id, accessToken, refreshToken);
    }

    private String createRefreshToken(final Long memberId) {
        if (tokenRepository.exist(memberId)) {
            return tokenRepository.getToken(memberId);
        }
        String refreshToken = tokenProvider.createRefreshToken(String.valueOf(memberId));
        return tokenRepository.save(memberId, refreshToken);
    }

    public AuthToken renewAuthToken(final String refreshToken) {
        tokenProvider.validateToken(refreshToken);
        Long memberId = Long.valueOf(tokenProvider.getPayload(refreshToken));

        String accessTokenForRenew = tokenProvider.createAccessToken(String.valueOf(memberId));
        String refreshTokenForRenew = tokenRepository.getToken(memberId);

        AuthToken renewalAuthToken = new AuthToken(memberId, accessTokenForRenew, refreshTokenForRenew);
        renewalAuthToken.validateHasSameRefreshToken(refreshToken);
        return renewalAuthToken;
    }

    public Long extractPayLoad(final String accessToken) {
        tokenProvider.validateToken(accessToken);
        return Long.valueOf(tokenProvider.getPayload(accessToken));
    }
}
