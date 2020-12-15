package com.example.ASDOpdracht3.TrainManagement.application.TrainComposition;

import com.example.ASDOpdracht3.TrainManagement.domain.TrainComposition.TrainComposition;

public interface TrainCompositionInterface {
    public String createTrainComposition();
    public TrainComposition findById(String id);
}
