package com.example.ASDOpdracht3.TrainManagement.domain.TrainCompositionMessage;

import com.example.ASDOpdracht3.TrainManagement.domain.TrainComposition.TrainComposition;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Optional;

public class TrainCompositionMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String messageStatus;
    private String sender;
    private String messageType;
    private LocalDateTime messageDateTime;
    private LocalDateTime startDate;
    private Optional<TrainComposition> trainComposition;

    public TrainCompositionMessage(int id, String messageStatus, String sender, String messageType, LocalDateTime messageDateTime, LocalDateTime startDate, Optional<TrainComposition> trainComposition) {
        this.id = id;
        this.messageStatus = messageStatus;
        this.sender = sender;
        this.messageType = messageType;
        this.messageDateTime = messageDateTime;
        this.startDate = startDate;
        this.trainComposition = trainComposition;
    }

    public boolean startDateValid() {
        return startDate.isAfter(LocalDateTime.now());
    }

    public boolean messageDateTimeValid() {
        return messageDateTime.isBefore(startDate);
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

    public LocalDateTime getMessageDateTime() {
        return messageDateTime;
    }

    public void setMessageDateTime(LocalDateTime messageDateTime) {
        this.messageDateTime = messageDateTime;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public Optional<TrainComposition> getTrainComposition() {
        return trainComposition;
    }

    public void setTrainComposition(Optional<TrainComposition> trainComposition) {
        this.trainComposition = trainComposition;
    }
}
