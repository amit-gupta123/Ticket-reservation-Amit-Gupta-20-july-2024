package com.infoigain.brs.services;

import com.infoigain.brs.models.Bus;
import com.infoigain.brs.models.responses.Schedule;
import com.infoigain.brs.repo.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<Bus> getBusBySourceAndDestination(String departureStation, String arrivalStation) {
        System.out.println(this.busRepository.findByDepartureStationAndArrivalStation(departureStation,arrivalStation));
        return this.busRepository.findByDepartureStationAndArrivalStation(departureStation, arrivalStation);
    }

    @Override
    public List<Schedule> getSchedules() {
        return this.busRepository.getSchedules();
    }

}
