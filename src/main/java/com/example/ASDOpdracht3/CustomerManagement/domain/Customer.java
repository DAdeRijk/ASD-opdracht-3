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

    public Customer(int customerId, String customerName, String iban, Company company, List<User> users, List<Locomotive> locomotives, List<Wagon> wagons, List<TrainCompositionMessage> trainCompositionMessages) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.iban = iban;
        this.company = company;
        this.users = users;
        this.locomotives = locomotives;
        this.wagons = wagons;
        this.trainCompositionMessages = trainCompositionMessages;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Locomotive> getLocomotives() {
        return locomotives;
    }

    public void setLocomotives(List<Locomotive> locomotives) {
        this.locomotives = locomotives;
    }

    public List<Wagon> getWagons() {
        return wagons;
    }

    public void setWagons(List<Wagon> wagons) {
        this.wagons = wagons;
    }

    public List<TrainCompositionMessage> getTrainCompositionMessages() {
        return trainCompositionMessages;
    }

    public void setTrainCompositionMessages(List<TrainCompositionMessage> trainCompositionMessages) {
        this.trainCompositionMessages = trainCompositionMessages;
    }
}
