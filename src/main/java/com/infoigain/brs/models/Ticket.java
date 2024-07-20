package com.infoigain.brs.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Getter
@Setter
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
    private String passengerName;

    @ManyToOne(fetch = FetchType.LAZY) // lazy loading
    @JoinColumn(name = "bus_id", referencedColumnName = "id", nullable = false)
    private Bus bus;  // Reference to the bus for which this ticket is booked

//    private String departureFrom;
//    private String arrivalTo;  if reference to bus itself is added these two field not required.

    private LocalTime boardingTime;
    private LocalTime arrivalTime;
    private LocalTime bookingTime;
    private LocalDate bookingDate;
    private LocalDate travelDate;
    private double farePrice;
}


