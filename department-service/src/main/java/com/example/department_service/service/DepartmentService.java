package com.example.department_service.service;

import org.springframework.stereotype.Service;

import com.example.department_service.entity.Department;

@Service
public interface DepartmentService {
    Department saveDepartment(Department department);

    Department getDepartmentById(Long departmentId);
}
