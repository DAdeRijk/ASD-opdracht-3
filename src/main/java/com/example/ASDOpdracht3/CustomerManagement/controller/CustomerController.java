package com.example.ASDOpdracht3.CustomerManagement.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {
    @GetMapping("/create-customer")
    public ResponseEntity<String> createCustomer() {
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }
}
