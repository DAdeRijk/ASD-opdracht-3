package com.example.ASDOpdracht3.TrainManagement.application.TrainCompositionMessage;


import com.example.ASDOpdracht3.TrainManagement.domain.TrainComposition.TrainComposition;
import com.example.ASDOpdracht3.TrainManagement.domain.TrainCompositionMessage.TrainCompositionMessage;
import com.example.ASDOpdracht3.TrainManagement.repository.TrainCompositionMessageRepository;
import com.example.ASDOpdracht3.TrainManagement.repository.TrainCompositionRepository;

import javax.persistence.EntityNotFoundException;
import java.time.LocalDateTime;
import java.util.Optional;

public class TrainCompositionMessageImpl implements TrainCompositionMessageInterface {
    private TrainCompositionRepository trainCompositionRepository;
    private TrainCompositionMessageRepository trainCompositionMessageRepository;

    @Override
    public String createTrainCompositionMessage(int id, String messageStatus, String sender, String messageType, LocalDateTime messageDateTime, LocalDateTime startDate, String trainCompositionId) {
        if (trainCompositionRepository.findById(trainCompositionId).isPresent()) {
            TrainCompositionMessage trainCompositionMessage = new TrainCompositionMessage(id, messageStatus, sender, messageType, messageDateTime, startDate, trainCompositionRepository.findById(trainCompositionId));

            if (trainCompositionRepository.findById(trainCompositionId).isPresent() && trainCompositionMessage.messageDateTimeValid() && trainCompositionMessage.startDateValid()) {

                trainCompositionMessageRepository.save(trainCompositionMessage);
                return "TrainCompositionMessage saved";
            } else {
                return "Cannot save TrainCompositionMessage";
            }
        } else {
            return "Given TrainComposition unknown";
        }
    }

    @Override
    public String deleteTrainCompositionMessage() {
        return null;
    }
}
