package com.example.ASDOpdracht3.TrainManagement.domain.TrainComposition;

import com.example.ASDOpdracht3.TrainManagement.domain.Locomotive.Locomotive;
import com.example.ASDOpdracht3.TrainManagement.domain.Wagon.Wagon;

import java.util.List;

public class TrainComposition {
    private int id;
    private int companyCode;
    private List<Locomotive> locomotives;
    private List<Wagon> wagons;

    public TrainComposition(int id, int companyCode) {
        this.id = id;
        this.companyCode = companyCode;
    }

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

    public void setLocomotive(Locomotive locomotive) {
        this.locomotives.add(locomotive);
    }

    public List<Wagon> getWagons() {
        return wagons;
    }

    public void setWagons(List<Wagon> wagons) {
        this.wagons = wagons;
    }

    public void setWagon(Wagon wagon) {
        this.wagons.add(wagon);
    }
}
