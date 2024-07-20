package com.infoigain.brs.repo;

import com.infoigain.brs.models.Ticket;
import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

    List findByBusIdAndTravelDate(Long busId, LocalDate travelDate);

    List findByUserId(Long userId);
}
