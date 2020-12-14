package com.example.ASDOpdracht3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainManagementController {
    @GetMapping("/create-train")
    public String say() {
        return String.format("Create train API");
    }
}
