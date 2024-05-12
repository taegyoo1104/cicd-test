package com.example.cicdtest.controller;

import com.example.cicdtest.dto.AddUserDto;
import com.example.cicdtest.dto.UserResponesDto;
import com.example.cicdtest.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/user")
    public UserResponesDto user(@RequestBody AddUserDto addUserDto) {
        return userService.saveUser(addUserDto);
    }
}
