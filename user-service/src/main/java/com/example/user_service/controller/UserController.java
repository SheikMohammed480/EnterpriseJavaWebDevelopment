package com.example.user_service.controller;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.user_service.dto.ResponseDto;
import com.example.user_service.entity.User;
import com.example.user_service.service.UserService;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserController {
	@Autowired
    private UserService userService;

    @PostMapping("/insert")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        User savedUser = userService.saveUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto> getUser(@PathVariable("id") Long userId){
        ResponseDto responseDto = userService.getUser(userId);
        return ResponseEntity.ok(responseDto);
    }
}
