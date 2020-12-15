package com.example.ASDOpdracht3.TrainManagement.controller.TrainCompositionMessage;

import com.example.ASDOpdracht3.TrainManagement.application.TrainCompositionMessage.TrainCompositionMessageImpl;
import com.example.ASDOpdracht3.TrainManagement.application.TrainCompositionMessage.TrainCompositionMessageInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class TrainCompositionMessageController {
    @PutMapping("/create-traincompositionmessage")
    public ResponseEntity<String> createTrainCompositionMessage(int id, String messageStatus, String sender, String messageType, LocalDateTime messageDateTime, LocalDateTime startDate, String trainCompositionId) {
        TrainCompositionMessageInterface trainCompositionMessageImpl = new TrainCompositionMessageImpl();
        return new ResponseEntity<>(trainCompositionMessageImpl.createTrainCompositionMessage(id, messageStatus, sender, messageType, messageDateTime, startDate, trainCompositionId), HttpStatus.OK);
    }

    @GetMapping("/delete-traincompositionmessage")
    public String deleteTrainCompositionMessage() {
        return String.format("Create train API");
    }
}
