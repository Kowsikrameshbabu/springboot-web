package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Address;
import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        Address address=user.getAddress();
        if(address!=null){
            address.setAddressId(user.getUserId());

        }
        return userRepository.save(user);

     
    }

}
