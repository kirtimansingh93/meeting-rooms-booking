package com.meetingrooms.booking.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AvailabilityRequest{

  private String roomName;

  public void setRoomName(String roomName){
    this.roomName = roomName;
  }

  public String getRoomName(){
    return roomName;
  }

  @JsonFormat(pattern="yyyy-MM-dd-HH:mm:ss")
  private LocalDateTime from;

  public void setFrom(LocalDateTime from){
    this.from = from;
  }

  public LocalDateTime getFrom(){
    return from;
  }

  @JsonFormat(pattern="yyyy-MM-dd-HH:mm:ss")
  private LocalDateTime to;

  public void setTo(LocalDateTime to){
    this.to = to;
  }

  public LocalDateTime getTo(){
    return to;
  }

}