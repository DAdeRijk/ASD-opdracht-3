package com.example.ASDOpdracht3.TrainManagement.controller.TrainCompositionMessage;

import com.example.ASDOpdracht3.TrainManagement.application.TrainCompositionMessage.TrainCompositionMessageImpl;
import com.example.ASDOpdracht3.TrainManagement.application.TrainCompositionMessage.TrainCompositionMessageInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@RestController
public class TrainCompositionMessageController {
    TrainCompositionMessageInterface trainCompositionMessageApplication = new TrainCompositionMessageImpl();

    @PutMapping("/create-traincompositionmessage")
    public ResponseEntity<String> createTrainCompositionMessage(int id, String messageStatus, String sender, String messageType, LocalDateTime messageDateTime, LocalDateTime startDate, String trainCompositionId) {
        return new ResponseEntity<>(trainCompositionMessageApplication.createTrainCompositionMessage(id, messageStatus, sender, messageType, messageDateTime, startDate, trainCompositionId), HttpStatus.OK);
    }

    @GetMapping("/cancel-traincompositionmessage")
    public String cancelTrainCompositionMessage(@RequestParam int id) {
        String returnValue = trainCompositionMessageApplication.cancelTrainCompositionMessage(id);
        return returnValue;
    }
}
