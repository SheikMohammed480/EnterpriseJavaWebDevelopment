package com.gfg.employeeapp.repository;

import com.gfg.employeeapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
 
}
