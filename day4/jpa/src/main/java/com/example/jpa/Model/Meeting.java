package com.example.jpa.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Meetings")
public class Meeting {

    @Id
    private int meetingNo;
    @Column(name="MeetingName")
    private String meetingName;
    @Column(name="MeetingLink") 
    private String meetingLink;
    @Column(name="Date")
    private String date;
    @Column(name="StartTime")
    private String startTime;
    @Column(name="EndTime")
    private String endTime;


    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        date = date;
    }
    

    public int getMeetingNo() {
        return meetingNo;
    }
    public String getStartTime() {
        return startTime;
    }
    public void setStartTime(String startTime) {
        startTime = startTime;
    }
    public String getEndTime() {
        return endTime;
    }
    public void setEndTime(String endTime) {
        endTime = endTime;
    }
    public void setMeetingNo(int meetingNo) {
        this.meetingNo = meetingNo;
    }
    public String getMeetingName() {
        return meetingName;
    }
    public Meeting() {
    }
    public Meeting(int meetingNo, String meetingName, String meetingLink,String Date,String StartTime,String EndTime) {
        this.meetingNo = meetingNo;
        this.meetingName = meetingName;
        this.meetingLink = meetingLink;
        this.date=Date;
        this.startTime=StartTime;
        this.endTime=EndTime;
    }
    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName;
    }
    public String getMeetingLink() {
        return meetingLink;
    }
    public void setMeetingLink(String meetingLink) {
        this.meetingLink = meetingLink;
    }
}
