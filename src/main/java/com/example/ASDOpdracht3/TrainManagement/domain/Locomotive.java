package com.example.ASDOpdracht3.TrainManagement.domain;

public class Locomotive {
    private int id;
    private String locomotiveType;
    private int locomotiveNumber;

    public Locomotive(int id, String locomotiveType, int locomotiveNumber) {
        this.id = id;
        this.locomotiveType = locomotiveType;
        this.locomotiveNumber = locomotiveNumber;
    }

    public int getId() {
        return id;
    }

    public String getLocomotiveType() {
        return locomotiveType;
    }

    public void setLocomotiveType(String locomotiveType) {
        this.locomotiveType = locomotiveType;
    }

    public int getLocomotiveNumber() {
        return locomotiveNumber;
    }

    public void setLocomotiveNumber(int locomotiveNumber) {
        this.locomotiveNumber = locomotiveNumber;
    }
}
