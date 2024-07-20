package com.infoigain.brs.services.impl;

import com.infoigain.brs.models.Ticket;
import com.infoigain.brs.repo.TicketRepository;
import com.infoigain.brs.services.TicketService;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class TicketServiceImpl implements TicketService {


    private TicketRepository ticketRepository = null;

    @Autowired
    public TicketServiceImpl(TicketRepository ticketRepositoryImpl){
        this.ticketRepository = ticketRepositoryImpl;
    }

    @Override
    public Ticket bookTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }


    public List getTicketsByBusAndDate(Long busId, LocalDate travelDate) {
        return ticketRepository.findByBusIdAndTravelDate(busId, travelDate);
    }

    public List getTicketsByUser(Long userId) {
        return ticketRepository.findByUserId(userId);
    }
}
