package com.springB.springBoot.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CommentDto {
    private Long id;

    @NotEmpty(message = "입력해주세요.")
    private String name;

    @NotEmpty(message = "입력해주세요.")
    @Email(message = "올바른 이메일을 입력해주세요.")
    private String email;

    @NotEmpty
    @Size(min = 10, message = "10자 이상 입력해주세요.")
    private String body;
}
