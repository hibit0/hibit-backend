package com.hibit2.hibit2.domain;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Matching {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    @Enumerated(EnumType.STRING)
    private MatchStatus status;

    @Column(nullable = true)
    @Schema(description = "글 작성자가 초대장 보낸 순서", example = "2")
    private int round;

    public Matching(Users user, Post post) {
        this.user = user;
        this.post = post;
        this.status = MatchStatus.HOLDING;
        this.round = round;
    }

    public void setUser(Users user) {this.user = user;}
    public void setPost(Post post) {this.post = post;}

    public void setRound(int round) {this.round = round;}

}
