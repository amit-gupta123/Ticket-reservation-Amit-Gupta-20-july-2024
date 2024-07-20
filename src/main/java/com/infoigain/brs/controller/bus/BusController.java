package com.infoigain.brs.controller.bus;

import com.infoigain.brs.models.Bus;
import com.infoigain.brs.services.BusServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/bus")
public class BusController {
    public BusServiceI busServiceImpl = null;

    // constructor injection
    @Autowired
    public BusController(BusServiceI busServiceI){
        this.busServiceImpl = busServiceI;
    }

    // kindly ignore this end point, it was just to test application configured or not
    @GetMapping("/test")
    public String allOk(){
        return new String("All Ok");

    }


    // view available bus routes and their schedules
    @GetMapping("/all")
    public List<Bus> getAllBus(){
        return this.busServiceImpl.getAllBuses();
    }


    // add some buses to database
    @PostMapping("/")
    public ResponseEntity<Bus> addBus(@RequestBody Bus theBus){
        Bus bus = busServiceImpl.addBus(theBus);
        return ResponseEntity.ok(bus);
    }


    // get buses based on departure and arrival location and date
    @GetMapping("/search")
    public List<Bus> getBusOnRoute(
            @RequestParam String departureStation,
            @RequestParam String arrivalStation,
            @RequestParam LocalDate departureDate){
        return this.busServiceImpl.getBusBySourceAndDestinationAndDate(departureStation,arrivalStation,departureDate);
    }


    // get all available seats
    public Set<Integer> getAllAvailableSeats(int busNumber){
        return busServiceImpl.getAvailableSeats(busNumber);
    }

}
