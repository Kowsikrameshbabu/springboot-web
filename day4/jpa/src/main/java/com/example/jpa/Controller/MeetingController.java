package com.example.jpa.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.jpa.Model.Meeting;
import com.example.jpa.Service.MeetingService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@RestController
@RequestMapping("/home")
public class MeetingController {

    private MeetingService meetingService;

    public MeetingController(MeetingService meetingService){
        this.meetingService=meetingService;
    }
    @GetMapping("/welcome")
    public String getMethodName() {
        return "hello";
    }
    
    @PostMapping("/post")
    public String postMethodName(@RequestBody Meeting meeting){
        meetingService.saveMeeting(meeting);
        return "saved";
    }

    @GetMapping("/meeting/{id}")
    public Meeting getMethodName(@PathVariable("id") int a){
        return meetingService.getMeeting(a);
    }

    @GetMapping("/meeting")
    public List<Meeting> getAll(){
        return meetingService.getMeetings();
    }

    @PutMapping("/meeting/nos/{id}")
    public String putMethodName(@PathVariable int id,@RequestBody Meeting updateMeeting){
        Meeting existMeeting=meetingService.getMeeting(id);

        if(existMeeting!=null){
             existMeeting.setMeetingName(updateMeeting.getMeetingName());
             existMeeting.setMeetingNo(updateMeeting.getMeetingNo());
             existMeeting.setMeetingLink(updateMeeting.getMeetingLink());
             meetingService.saveMeeting(existMeeting);
        }
        else{
            return "no data found";
        }
        return "updated";
    }

    @DeleteMapping("deleteMeeting/{id}")
    public String deleteMeeting(@PathVariable ("id") int meetingid)
    {
        if(meetingService.getMeeting(meetingid)!=null){
            meetingService.deleteMeeting(meetingid);
            return "meeting deleted successfully";
        }
        return "no meetings found";
    }

}
