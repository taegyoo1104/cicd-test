package com.example.cicdtest.dto;

import com.example.cicdtest.domain.Users;
import lombok.Getter;

@Getter
public class UserResponesDto {
    private Long id;
    private String name;

    public UserResponesDto(Users users) {
        this.id = users.getId();
        this.name = users.getName();
    }
}
