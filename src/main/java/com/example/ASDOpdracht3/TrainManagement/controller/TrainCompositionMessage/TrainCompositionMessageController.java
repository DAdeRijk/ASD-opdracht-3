package com.example.ASDOpdracht3.TrainManagement.controller.TrainCompositionMessage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainCompositionMessageController {
    @GetMapping("/create-traincompositionmessage")
    public String createTrainCompositionMessage() {
        return String.format("Create train API");
    }

    @GetMapping("/delete-traincompositionmessage")
    public String deleteTrainCompositionMessage() {
        return String.format("Create train API");
    }
}
