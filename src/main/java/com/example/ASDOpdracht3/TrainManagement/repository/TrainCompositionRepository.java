package com.example.ASDOpdracht3.TrainManagement.repository;

import com.example.ASDOpdracht3.TrainManagement.domain.TrainComposition.TrainComposition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TrainCompositionRepository extends JpaRepository<TrainComposition, String> {
    Optional<TrainComposition> findById(int id);
    int nextIdentity();
    boolean saveTrainComposition(TrainComposition trainComposition);
}
