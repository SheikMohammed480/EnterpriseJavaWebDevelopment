package com.example.user_service.impl;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.user_service.dto.DepartmentDto;
import com.example.user_service.dto.ResponseDto;
import com.example.user_service.dto.UserDto;
import com.example.user_service.entity.User;
import com.example.user_service.repository.UserRepo;
import com.example.user_service.service.UserService;

@Service
@AllArgsConstructor
public  class UserServiceImpl implements UserService {
	@Autowired
    private UserRepo userRepository;
	@Autowired
    private RestTemplate restTemplate;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public ResponseDto getUser(Long userId) {

        ResponseDto responseDto = new ResponseDto();
        User user = userRepository.findById(userId).get();
        UserDto userDto = mapToUser(user);

        ResponseEntity<DepartmentDto> responseEntity = restTemplate
                .getForEntity("http://localhost:8084/api/departments/" + user.getDepartmentId(),
                DepartmentDto.class);

        DepartmentDto departmentDto = responseEntity.getBody();

        System.out.println(responseEntity.getStatusCode());

        responseDto.setUser(userDto);
        responseDto.setDepartment(departmentDto);

        return responseDto;
    }

    private UserDto mapToUser(User user){
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setEmail(user.getEmail());
        return userDto;
    }
}
