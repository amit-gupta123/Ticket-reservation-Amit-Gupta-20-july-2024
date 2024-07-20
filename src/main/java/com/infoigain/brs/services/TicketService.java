package com.infoigain.brs.services;
import com.infoigain.brs.models.Ticket;
import org.hibernate.mapping.List;

import java.time.LocalDate;

public interface TicketService {
   Ticket bookTicket(Ticket ticket)  ;
   List getTicketsByBusAndDate(Long busId, LocalDate travelDate);
   List getTicketsByUser(Long userId);
}
