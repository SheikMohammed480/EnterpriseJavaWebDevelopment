package com.gfg.employeeapp.service;

import com.gfg.employeeapp.entity.Employee;
import com.gfg.employeeapp.repository.EmployeeRepo;
import com.gfg.employeeapp.response.AddressResponse;
import com.gfg.employeeapp.response.EmployeeResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
 
import java.util.Optional;
 
@Service
public class EmployeeService {
 
    @Autowired
    private EmployeeRepo employeeRepo;
 
    @Autowired
    private ModelMapper mapper;
 
    @Autowired
    private WebClient webClient;
 
    public EmployeeResponse getEmployeeById(int id) {
 
        Optional<Employee> employee = employeeRepo.findById(id);
        EmployeeResponse employeeResponse = mapper.map(employee, EmployeeResponse.class);
 
        // Using WebClient
        AddressResponse addressResponse = webClient.get().uri("/address/" + id).retrieve().bodyToMono(AddressResponse.class).block();
        employeeResponse.setAddressResponse(addressResponse);
 
        return employeeResponse;
    }
 
}