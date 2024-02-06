package com.springB.springBoot.payload;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;


@Data
@Schema(
        description = "postDto 모델 정보"
)
public class PostDto {
    private Long id;

    @Schema(
            description = "post 제목"
    )
    @Size(min = 2, message = "제목은 2글자 이상이야 합니다.")
    @NotEmpty
    private String title;

    @Schema(
            description = "post 설명"
    )
    @Size(min = 10, message = "설명은 10글자 이상이야 합니다.")
    @NotEmpty
    private String description;

    @Schema(
            description = "post 내용"
    )
    @NotEmpty(message = "입력해주세요.")
    private String content;
    private Set<CommentDto> comments;

    @Schema(
            description = "post 카테고리"
    )
    private Long categoryId;

}
