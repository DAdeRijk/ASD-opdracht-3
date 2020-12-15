package com.example.ASDOpdracht3.TrainManagement.application.TrainComposition;


import com.example.ASDOpdracht3.TrainManagement.domain.TrainComposition.TrainComposition;
import com.example.ASDOpdracht3.TrainManagement.repository.TrainCompositionMessageRepository;
import com.example.ASDOpdracht3.TrainManagement.repository.TrainCompositionRepository;

import javax.persistence.EntityNotFoundException;

public class TrainCompositionImpl implements TrainCompositionInterface {
    private TrainCompositionRepository trainCompositionRepository;
    private TrainCompositionMessageRepository trainCompositionMessageRepository;

    @Override
    public String createTrainComposition() {
        return null;
    }


    public TrainComposition findById(String id) {
        return trainCompositionRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Given TrainComposition not found"));
    }
}
