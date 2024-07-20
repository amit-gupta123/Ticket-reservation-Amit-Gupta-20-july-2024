package com.infoigain.brs.models.responses;

import java.time.LocalDate;


// Basically this is a Dto class which will show user available schedules of buses.
public class Schedule {
    private int busNumber;
    private String departureStation;
    private String arrivalStation;
    private LocalDate localDate;
}
