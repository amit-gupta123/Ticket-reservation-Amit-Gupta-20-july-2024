package com.infoigain.brs.repo;

import com.infoigain.brs.models.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.time.LocalDate;
import java.util.List;

@Repository
public interface BusRepository extends JpaRepository<Bus, Long> {
    // custom method for searching based on departure and arrival locations and date
    List<Bus> findByDepartureStationAndArrivalStationAndDepartureDate(String departureStation, String arrivalStation, LocalDate departureDate);
}
