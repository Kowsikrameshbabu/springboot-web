package com.example.jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jpa.Model.Meeting;

@Repository
public interface MeetingRepository extends JpaRepository<Meeting,Integer>{

}
