package com.example.ASDOpdracht3.trainCompositionMessage;


import com.example.ASDOpdracht3.TrainManagement.application.TrainCompositionMessage.TrainCompositionMessageImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class cancelTrainCompositionMessageTest {
    @MockBean
    private TrainCompositionMessageImpl trainCompositionMessageImpl;

    @Test
    public void invalidTrainCompositionMessageIdShouldReturnInvalid() {
        assertThat(trainCompositionMessageImpl.cancelTrainCompositionMessage(-1).equals("Error"));
    }
    @Test
    public void validIdShouldReturnSuccess() {
        assertThat(trainCompositionMessageImpl.cancelTrainCompositionMessage(12).equals("Success"));
    }
}
