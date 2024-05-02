package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Address;

public interface AddressRepository extends JpaRepository<Address,Integer>{

}
