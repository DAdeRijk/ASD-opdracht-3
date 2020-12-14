package com.example.ASDOpdracht3.TrainManagement.domain;

import java.util.Date;

public class TrainCompositionMessage {
    private int id;
    private String messageStatus;
    private String sender;
    private String messageType;
    private Date messageDateTime;
    private Date startDate;
    private TrainComposition trainComposition;

    public TrainCompositionMessage(int id, String messageStatus, String sender, String messageType, Date messageDateTime, Date startDate, TrainComposition trainComposition) {
        this.id = id;
        this.messageStatus = messageStatus;
        this.sender = sender;
        this.messageType = messageType;
        this.messageDateTime = messageDateTime;
        this.startDate = startDate;
        this.trainComposition = trainComposition;
    }

    public int getId() {
        return id;
    }

    public String getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public Date getMessageDateTime() {
        return messageDateTime;
    }

    public void setMessageDateTime(Date messageDateTime) {
        this.messageDateTime = messageDateTime;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public TrainComposition getTrainComposition() {
        return trainComposition;
    }

    public void setTrainComposition(TrainComposition trainComposition) {
        this.trainComposition = trainComposition;
    }
}
