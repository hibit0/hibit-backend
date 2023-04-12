package com.hibit2.hibit2.dto;

import com.hibit2.hibit2.domain.Post;
import com.hibit2.hibit2.domain.Post_status;
import com.hibit2.hibit2.domain.What_do;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@NoArgsConstructor
@Getter
public class PostResponseDto {
    private int idx;
    private String title;
    private String content;
    private Post_status post_status;
    private int number;
    private String openchat;
    private What_do what_do;
    private int view;

    public PostResponseDto(@NotNull Post entity){
        this.idx=entity.getIdx();
        this.title=entity.getTitle();
        this.content=entity.getContent();
        this.post_status=entity.getPost_status();
        this.number=entity.getNumber();
        this.openchat=entity.getOpenchat();
        this.what_do=entity.getWhat_do();
        this.view=entity.getView();
    }

}
