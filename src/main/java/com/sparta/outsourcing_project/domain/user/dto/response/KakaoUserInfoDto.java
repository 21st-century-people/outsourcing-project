package com.sparta.outsourcing_project.domain.user.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class KakaoUserInfoDto {
    private Long id;
    private String email;

    public KakaoUserInfoDto(Long id, String email) {
        this.id = id;
        this.email = email;
    }
}
