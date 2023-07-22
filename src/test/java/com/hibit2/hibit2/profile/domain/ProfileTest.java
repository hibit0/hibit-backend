package com.hibit2.hibit2.profile.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.hibit2.hibit2.member.domain.Member;
import com.hibit2.hibit2.member.domain.SocialType;

class ProfileTest {


    @DisplayName("프로필을 생성한다.")
    @Test
    void 프로필을_생성한다() {
        // given
        int idx = 1;
        Member member = new Member("fancy.junyongmoon@gmail.com", SocialType.GOOGLE);
        String nickname = "fancy";
        int age = 26;
        int gender = 1;
        List<PersonalityType> personalityType = Arrays.asList(PersonalityType.TYPE_1);
        String introduce = "Hi, I'm fancy.";
        String job = "Backend";
        AddressCity addressCity = AddressCity.SEOUL;
        AddressDistinct addressDistinct = AddressDistinct.SEOUL_YONGSAN;
        int ban = 1;

        Profile profile = new Profile(idx, member, nickname, age, gender,
            personalityType, introduce, null, job, addressCity, addressDistinct, ban);

        ProfileImage profileImage = new ProfileImage(profile, "profile.jpg");
        List<ProfileImage> mainImg = new ArrayList<>();
        mainImg.add(profileImage);

        // when & then
        Assertions.assertDoesNotThrow(() -> new Profile(idx, member, nickname, age, gender,
            personalityType, introduce, mainImg, job, addressCity, addressDistinct, ban));
    }

}