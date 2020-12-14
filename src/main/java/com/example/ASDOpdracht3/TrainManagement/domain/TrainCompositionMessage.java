package com.example.ASDOpdracht3.TrainManagement.domain;

import java.util.Date;

public class TrainCompositionMessage {
    private int id;
    private String messageStatus;
    private String sender;
    private String messageType;
    private Date messageDateTime;
    private Date startDate;
    private TrainComposition trainComposition;
}
