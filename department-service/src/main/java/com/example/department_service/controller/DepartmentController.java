package com.example.department_service.controller;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.department_service.entity.Department;
import com.example.department_service.service.DepartmentService;

@RestController
@RequestMapping("/api/departments")
@AllArgsConstructor
public class DepartmentController {

	@Autowired
    private DepartmentService departmentService;
	

	@PostMapping("/insert")
	public ResponseEntity<Department> saveDepartment(@RequestBody Department department) {
	    System.out.println("Received Department: " + department);  // Log incoming department
	    Department savedDepartment = departmentService.saveDepartment(department);
	    return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
	}


    @GetMapping("/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable("id") Long departmentId){
        Department department = departmentService.getDepartmentById(departmentId);
        return ResponseEntity.ok(department);
    }
}
