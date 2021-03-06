package com.example.ASDOpdracht3.TrainManagement.application.TrainCompositionMessage;

import com.example.ASDOpdracht3.TrainManagement.domain.TrainCompositionMessage.TrainCompositionMessage;

import java.time.LocalDateTime;
import java.util.Date;

public interface TrainCompositionMessageInterface {
    public String createTrainCompositionMessage(int id, String messageStatus, String sender, String messageType, LocalDateTime messageDateTime, LocalDateTime startDate, String trainCompositionId);
    public String cancelTrainCompositionMessage(int id);
    public String sendMessage(TrainCompositionMessage trainCompositionMessage);
}
