package com.example.ASDOpdracht3.TrainManagement.domain;

import java.util.List;

public class TrainComposition {
    private int id;
    private int companyCode;
    private List<Locomotive> locomotives;
    private List<Wagon> wagons;

    public TrainComposition(int id, int companyCode, List<Locomotive> locomotives, List<Wagon> wagons) {
        this.id = id;
        this.companyCode = companyCode;
        this.locomotives = locomotives;
        this.wagons = wagons;
    }

    public int getId() {
        return id;
    }

    public int getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(int companyCode) {
        this.companyCode = companyCode;
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
}
