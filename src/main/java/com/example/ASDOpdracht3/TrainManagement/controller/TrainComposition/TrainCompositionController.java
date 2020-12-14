package com.example.ASDOpdracht3.TrainManagement.controller.TrainComposition;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainCompositionController {
    @GetMapping("/create-traincomposition")
    public String createTrainComposition() {
        return String.format("Create train API");
    }

}
