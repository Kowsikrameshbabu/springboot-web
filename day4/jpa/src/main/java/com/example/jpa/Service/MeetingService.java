package com.example.jpa.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.example.jpa.Model.Meeting;
import com.example.jpa.Repository.MeetingRepository;

@Service
public class MeetingService {


    

    @Autowired
    private MeetingRepository meetingRepository;

    public Meeting saveMeeting(Meeting meeting){
        return meetingRepository.save(meeting);
    }

    public Meeting getMeeting(int id)
    {
        return meetingRepository.findById(id).orElse(null);

    }

    public List<Meeting> getMeetings(){
        return meetingRepository.findAll();
    }

    public void deleteMeeting(int id)
    {
        meetingRepository.deleteById(id);
    }

   

    
}
