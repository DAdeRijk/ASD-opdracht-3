package com.example.ASDOpdracht3.TrainManagement.controller.TrainCompositionMessage;

import com.example.ASDOpdracht3.TrainManagement.application.TrainCompositionMessage.TrainCompositionMessageImpl;
import com.example.ASDOpdracht3.TrainManagement.application.TrainCompositionMessage.TrainCompositionMessageInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainCompositionMessageController {
    TrainCompositionMessageInterface trainCompositionMessageApplication = new TrainCompositionMessageImpl();

    @GetMapping("/create-traincompositionmessage")
    public String createTrainCompositionMessage() {
        return String.format("Create train API");
    }

    @GetMapping("/cancel-traincompositionmessage")
    public String cancelTrainCompositionMessage(@RequestParam int id) {
        String returnValue = trainCompositionMessageApplication.cancelTrainCompositionMessage(id);
        return returnValue;
    }
}
