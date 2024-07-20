package com.infoigain.brs.repo;

import com.infoigain.brs.models.Bus;
import com.infoigain.brs.models.responses.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface BusRepository extends JpaRepository<Bus, Long> {
    List<Bus> findByDepartureStationAndArrivalStation(String departureStation, String arrivalStation);

    @Query("select ")
    List<Schedule> getSchedules();
}
