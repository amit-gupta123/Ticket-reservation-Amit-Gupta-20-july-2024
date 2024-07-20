package com.infoigain.brs.services.impl;

import com.infoigain.brs.models.Bus;
import com.infoigain.brs.repo.BusRepository;
import com.infoigain.brs.services.BusServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Service
public class BusServiceImpl implements BusServiceI {

    private BusRepository busRepository;
    @Autowired
    public BusServiceImpl(BusRepository busRepository){
        this.busRepository = busRepository;
    }

    @Override
    public Bus addBus(Bus theBus) {
        return busRepository.save(theBus);
    }

    @Override
    public List<Bus> getAllBuses(){
        return  busRepository.findAll();
    }

    @Override
    public List<Bus> getBusBySourceAndDestinationAndDate(String departureStation, String arrivalStation, LocalDate departureDate) {
       //  System.out.println(this.busRepository.findByDepartureStationAndArrivalStationAndDepartureDate(departureStation,arrivalStation,departureDate));
        return this.busRepository.findByDepartureStationAndArrivalStationAndDepartureDate(departureStation, arrivalStation,departureDate);
    }

    @Override
    public Set<Integer> getAvailableSeats(int busNumber) {
        return null;
    }


}
