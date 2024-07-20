package com.infoigain.brs.services;

import com.infoigain.brs.models.Bus;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface BusServiceI {
     List<Bus>getAllBuses();
     Bus addBus(Bus theBus);
     List<Bus>getBusBySourceAndDestinationAndDate(String departureStation, String arrivalStation, LocalDate localDate);
     Set<Integer> getAvailableSeats(int busNumber);

    Optional<Bus> getBusById(Long id);

    void saveOrUpdateBus(Bus updatedBus);
}
