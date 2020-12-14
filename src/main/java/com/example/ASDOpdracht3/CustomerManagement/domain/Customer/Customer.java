package com.example.ASDOpdracht3.CustomerManagement.domain.Customer;

import com.example.ASDOpdracht3.CustomerManagement.domain.Company.Company;
import com.example.ASDOpdracht3.CustomerManagement.domain.User.User;
import com.example.ASDOpdracht3.TrainManagement.domain.Locomotive.Locomotive;
import com.example.ASDOpdracht3.TrainManagement.domain.TrainCompositionMessage.TrainCompositionMessage;
import com.example.ASDOpdracht3.TrainManagement.domain.Wagon.Wagon;
import org.apache.commons.validator.routines.checkdigit.IBANCheckDigit;
import java.util.ArrayList;
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

    public Customer(String customerName, String iban, Company company) {
        this.customerId = 0;
        this.customerName = customerName;
        this.iban = iban;
        this.company = company;
        this.users = new ArrayList<User>();
        this.locomotives = new ArrayList<Locomotive>();
        this.wagons = new ArrayList<Wagon>();
        this.trainCompositionMessages = new ArrayList<TrainCompositionMessage>();
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
    public Boolean validateIban(){
        return new IBANCheckDigit().isValid(this.iban);
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
    public void addUser(User u){
        this.users.add(u);
    }
}
