package com.example.cicdtest.service;

import com.example.cicdtest.domain.Users;
import com.example.cicdtest.dto.AddUserDto;
import com.example.cicdtest.dto.UserResponesDto;
import com.example.cicdtest.repository.UserRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserResponesDto saveUser(AddUserDto addUserDto) {
        Users users = new Users(addUserDto);
        userRepository.save(users);
        return new UserResponesDto(users);
    }
}
