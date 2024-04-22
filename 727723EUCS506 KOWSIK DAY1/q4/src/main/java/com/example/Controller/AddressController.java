package com.example.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Address;

public class AddressController {

@RestController
public class StudentController {
    @GetMapping("/path")
    public Address getMethodName() {
        Address obj = new Address("Main St", 123, null, 0, null, null, null, null);
        return obj;
    }
    
}

}
