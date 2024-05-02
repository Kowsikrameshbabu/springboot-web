package com.example.day12q1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.day12q1.model.Address;
@Repository
public interface AddressRepo extends JpaRepository<Address,Integer> {

     @org.springframework.data.jpa.repository.Modifying
    @Transactional
    @org.springframework.data.jpa.repository.Query(value="insert into address(city,street,employee_id) values(?1,?2,?3)",nativeQuery = true)
    void setByemployeeId(String city,String street,int id);
}
