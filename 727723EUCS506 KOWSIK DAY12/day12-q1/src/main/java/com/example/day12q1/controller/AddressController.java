package com.example.day12q1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day12q1.model.Address;
import com.example.day12q1.service.AddressService;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

     @SuppressWarnings("null")
    @PostMapping("/address/employee/{id}")
    public ResponseEntity<Address> postMethodName(@RequestBody Address address,@PathVariable int id) {
        
        try{
            return new ResponseEntity<>(addressService.setAddressById(id, address),HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
