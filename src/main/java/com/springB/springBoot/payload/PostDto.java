package com.springB.springBoot.payload;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;


@Data
public class PostDto {
    private Long id;

    @Size(min = 2, message = "제목은 2글자 이상이야 합니다.")
    @NotEmpty
    private String title;

    @Size(min = 10, message = "설명은 10글자 이상이야 합니다.")
    @NotEmpty
    private String description;

    @NotEmpty(message = "입력해주세요.")
    private String content;
    private Set<CommentDto> comments;

    private Long categoryId;

}
