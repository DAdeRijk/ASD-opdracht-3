package com.example.ASDOpdracht3.TrainManagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainManagementController {
    @GetMapping("/create-traincomposition")
    public String createTrainComposition() {
        return String.format("Create train API");
    }

    @GetMapping("/create-traincompositionmessage")
    public String createTrainCompositionMessage() {
        return String.format("Create train API");
    }

    @GetMapping("/delete-traincompositionmessage")
    public String deleteTrainCompositionMessage() {
        return String.format("Create train API");
    }


}
