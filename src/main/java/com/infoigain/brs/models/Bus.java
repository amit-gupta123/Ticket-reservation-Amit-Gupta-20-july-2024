package com.infoigain.brs.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String departureStation;
    @Column(nullable = false)
    private String arrivalStation;
    @Column(nullable = false, unique = true)
    private int busNumber;

    private LocalDate departureDate;



}
