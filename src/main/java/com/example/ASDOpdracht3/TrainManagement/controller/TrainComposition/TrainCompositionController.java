package com.example.ASDOpdracht3.TrainManagement.controller.TrainComposition;

import com.example.ASDOpdracht3.TrainManagement.application.TrainComposition.TrainCompositionImpl;
import com.example.ASDOpdracht3.TrainManagement.application.TrainComposition.TrainCompositionInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrainCompositionController {
    @PostMapping("/create-traincomposition")
    public ResponseEntity<String> createTrainComposition(int companyCode, List<Integer> locomotiveIdList, List<Integer> wagonIdList) {
        TrainCompositionInterface trainComposition = new TrainCompositionImpl();

        boolean result = trainComposition.createTrainComposition(companyCode, locomotiveIdList, wagonIdList);

        if (result) {
            return new ResponseEntity<>("TrainComposition succesvol aangemaakt!", HttpStatus.OK);
        }
        return new ResponseEntity<>("Er is iets fout gegaan!", HttpStatus.BAD_REQUEST);
    }

}
