package com.example.ASDOpdracht3.CustomerManagement.domain;

import com.example.ASDOpdracht3.TrainManagement.domain.Locomotive;
import com.example.ASDOpdracht3.TrainManagement.domain.TrainCompositionMessage;
import com.example.ASDOpdracht3.TrainManagement.domain.Wagon;

import java.util.List;

public class Customer {
    private int customerId;
    private String customerName;
    private String iban;
    private Company company;
    private List<User> users;
    private List<Locomotive> locomotives;
    private List<Wagon> wagons;
    private List<TrainCompositionMessage> trainCompositionMessages;
}
