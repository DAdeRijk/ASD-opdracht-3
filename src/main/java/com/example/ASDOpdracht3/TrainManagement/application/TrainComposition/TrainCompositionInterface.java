package com.example.ASDOpdracht3.TrainManagement.application.TrainComposition;

import com.example.ASDOpdracht3.TrainManagement.domain.TrainComposition.TrainComposition;

import java.util.List;

public interface TrainCompositionInterface {
    boolean createTrainComposition(int companyCode, List<Integer> locomotiveIdList, List<Integer> wagonIdList);
    TrainComposition findById(int id);
}
