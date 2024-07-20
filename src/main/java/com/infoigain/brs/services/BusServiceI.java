package com.infoigain.brs.services;

import com.infoigain.brs.models.Bus;
import com.infoigain.brs.models.responses.Schedule;

import java.util.List;

public interface BusServiceI {
    public List<Bus>getAllBuses();
    public Bus addBus(Bus theBus);
    public List<Bus>getBusBySourceAndDestination(String departureStation, String arrivalStation);

    List<Schedule> getSchedules();
}
