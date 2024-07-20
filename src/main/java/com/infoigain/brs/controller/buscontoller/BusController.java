package com.infoigain.brs.controller.buscontoller;

import com.infoigain.brs.models.Bus;
import com.infoigain.brs.models.responses.Schedule;
import com.infoigain.brs.services.BusServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BusController {

    public BusServiceI busServiceImpl = null;
    @Autowired
    public BusController(BusServiceI busServiceI){
        this.busServiceImpl = busServiceI;
    }

    @GetMapping("/test")
    public String allOk(){
        return new String("All Ok");

    }



    @GetMapping("/buses")
    public List<Bus> getAllBus(){
        return this.busServiceImpl.getAllBuses();
    }


    // working fine
    @PostMapping("/bus")
    public void addBus( @RequestBody Bus theBus){
        busServiceImpl.addBus(theBus);
    }

    @GetMapping("/route-buses")
    public List<Bus> getBusOnRoute(
            @RequestParam String departureStation,
            @RequestParam String arrivalStation){
        return this.busServiceImpl.getBusBySourceAndDestination(departureStation,arrivalStation);
    }


    // get schedules for routes and buses available
    public List<Schedule>getSchedules(){
        return this.busServiceImpl.getSchedules();
    }



}
