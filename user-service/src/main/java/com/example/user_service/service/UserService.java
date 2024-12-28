package com.example.user_service.service;

import org.springframework.stereotype.Service;

import com.example.user_service.dto.ResponseDto;
import com.example.user_service.entity.User;

@Service
public interface UserService {
    User saveUser(User user);

    ResponseDto getUser(Long userId);
}
