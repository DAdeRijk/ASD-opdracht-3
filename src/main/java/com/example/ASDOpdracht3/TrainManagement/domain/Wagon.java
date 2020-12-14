package com.example.ASDOpdracht3.TrainManagement.domain;

public class Wagon {
    private int id;
    private String typeName;
    private String code;
    private int maxSpeed;
    private int wagonWeightEmpty;

    public Wagon(int id,String typeName, String code, int maxSpeed, int wagonWeightEmpty) {
        this.id = id;
        this.typeName = typeName;
        this.code = code;
        this.maxSpeed = maxSpeed;
        this.wagonWeightEmpty = wagonWeightEmpty;
    }

    public int getId() {
        return id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWagonWeightEmpty() {
        return wagonWeightEmpty;
    }

    public void setWagonWeightEmpty(int wagonWeightEmpty) {
        this.wagonWeightEmpty = wagonWeightEmpty;
    }
}
