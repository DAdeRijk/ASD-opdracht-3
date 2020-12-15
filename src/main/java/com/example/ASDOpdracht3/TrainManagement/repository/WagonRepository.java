package com.example.ASDOpdracht3.TrainManagement.repository;

import com.example.ASDOpdracht3.TrainManagement.domain.Wagon.Wagon;

public interface WagonRepository {
    Wagon findWagonById(int id);
}
