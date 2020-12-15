package com.example.ASDOpdracht3.TrainManagement.application.TrainComposition;


import com.example.ASDOpdracht3.TrainManagement.domain.Locomotive.Locomotive;
import com.example.ASDOpdracht3.TrainManagement.domain.TrainComposition.TrainComposition;
import com.example.ASDOpdracht3.TrainManagement.domain.Wagon.Wagon;
import com.example.ASDOpdracht3.TrainManagement.repository.LocomotiveRepository;
import com.example.ASDOpdracht3.TrainManagement.repository.TrainCompositionMessageRepository;
import com.example.ASDOpdracht3.TrainManagement.repository.TrainCompositionRepository;
import com.example.ASDOpdracht3.TrainManagement.repository.WagonRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;

public class TrainCompositionImpl implements TrainCompositionInterface {
    private TrainCompositionRepository trainCompositionRepository;
    private TrainCompositionMessageRepository trainCompositionMessageRepository;
    private LocomotiveRepository locomotiveRepository;
    private WagonRepository wagonRepository;

    @Override
    public boolean createTrainComposition(int companyCode, List<Integer> locomotiveIdList, List<Integer> wagonIdList) {
        int id = trainCompositionRepository.nextIdentity();

        TrainComposition tc = new TrainComposition(id, companyCode);

        for (int locId : locomotiveIdList) {
            Locomotive locomotive = locomotiveRepository.findLocomotiveById(locId);

            tc.setLocomotive(locomotive);
        }

        for (int wagId : wagonIdList) {
            Wagon wagon = wagonRepository.findWagonById(wagId);

            tc.setWagon(wagon);
        }

        return trainCompositionRepository.saveTrainComposition(tc);
    }

    public TrainComposition findById(int id) {
        return trainCompositionRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Given TrainComposition not found"));
    }
}
