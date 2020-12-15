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
    public String cancelTrainCompositionMessage(int id) {
        Optional<TrainCompositionMessage> trainCompositionMessage = trainCompositionMessageRepository.findById(id);
        if(trainCompositionMessage.isPresent() && trainCompositionMessage.get().startDateValid()) {
            TrainCompositionMessage actualTrainCompositionMessage = trainCompositionMessage.get();
            actualTrainCompositionMessage.setMessageStatus("cancelled");
            String messageResult = sendMessage(actualTrainCompositionMessage);
            if(messageResult == "Success") {
                trainCompositionMessageRepository.save(actualTrainCompositionMessage);
            } else {
                return "Error: " + messageResult;
            }
            return "Success";
        }
        return "Error";
    }

    //sendmessage functie die een bericht verstuurd naar de sppornetbeheerder api (extern die wij niet hebben)
    @Override
    public String sendMessage(TrainCompositionMessage trainCompositionMessage) {
        return "Success";
    }


}
