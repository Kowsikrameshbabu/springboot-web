package com.example.day12q1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day12q1.model.Address;
import com.example.day12q1.repository.AddressRepo;
import com.example.day12q1.repository.EmployeeRepo;

@Service
public class AddressService {
     @Autowired
    AddressRepo addressRepo;
    @Autowired
    EmployeeRepo employeeRepo;
    public Address setAddressById(int id,Address address)
    {
        if(employeeRepo.existsById(id))
        {
            addressRepo.setByemployeeId(address.getCity(), address.getStreet(), id);
            return address;
        }
        else
        {
            return null;
        }
    }

}
