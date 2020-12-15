package com.example.ASDOpdracht3.TrainManagement.repository;

import com.example.ASDOpdracht3.TrainManagement.domain.Locomotive.Locomotive;

public interface LocomotiveRepository {
    Locomotive findLocomotiveById(int id);
}
