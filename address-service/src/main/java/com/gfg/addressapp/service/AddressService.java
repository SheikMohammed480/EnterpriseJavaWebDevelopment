package com.gfg.addressapp.service;

import com.gfg.addressapp.entity.Address;
import com.gfg.addressapp.repository.AddressRepo;
import com.gfg.addressapp.response.AddressResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import java.util.Optional;
 
@Service
public class AddressService {
 
    @Autowired
    private AddressRepo addressRepo;
 
    @Autowired
    private ModelMapper mapper;
 
    public AddressResponse findAddressByEmployeeId(int employeeId) {
        Optional<Address> addressByEmployeeId = addressRepo.findAddressByEmployeeId(employeeId);
        AddressResponse addressResponse = mapper.map(addressByEmployeeId, AddressResponse.class);
        return addressResponse;
    }
 
}
