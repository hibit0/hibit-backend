package com.hibit2.hibit2.profile.domain;


import lombok.Getter;

import javax.persistence.*;

// 2023.07.23 사용안하는 엔티티 클래스
@Entity
@Getter
@Table(name = "profile_images")
public class ProfileImage {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_id")
    private Profile profile;


    @Column(name = "image_url", nullable = false, length = 100)
    private String imageUrl;

    protected ProfileImage() {
    }

    public ProfileImage(final Profile profile, final String imageUrl) {
        this.profile = profile;
        this.imageUrl = imageUrl;
    }
}
