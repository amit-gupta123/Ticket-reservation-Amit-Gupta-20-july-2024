package com.infoigain.brs.controller.ticket;
import com.infoigain.brs.models.Ticket;
import com.infoigain.brs.services.TicketService;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;



@RestController
@RequestMapping("/api/tickets")
public class TicketController {

        private TicketService ticketServiceImpl;

        // constructor injection
        @Autowired
        public TicketController(TicketService ticketServiceImpl){
            this.ticketServiceImpl = ticketServiceImpl;
        }


        @PostMapping("/book")
        public Ticket bookTicket(@RequestBody Ticket ticket) {
            return ticketServiceImpl.bookTicket(ticket);
        }

        @GetMapping("/byBusAndDate")
        public List getTicketsByBusAndDate(@RequestParam Long busId, @RequestParam LocalDate travelDate) {
            return ticketServiceImpl.getTicketsByBusAndDate(busId, travelDate);
        }

        @GetMapping("/byUser")
        public List getTicketsByUser(@RequestParam Long userId) {
            return ticketServiceImpl.getTicketsByUser(userId);
        }
    }






















