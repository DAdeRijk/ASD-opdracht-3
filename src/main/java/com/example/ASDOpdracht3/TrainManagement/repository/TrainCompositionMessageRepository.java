package com.example.ASDOpdracht3.TrainManagement.repository;

import com.example.ASDOpdracht3.TrainManagement.domain.TrainCompositionMessage.TrainCompositionMessage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TrainCompositionMessageRepository extends JpaRepository<TrainCompositionMessage, String> {
    Optional<TrainCompositionMessage> findById(int id);
}
