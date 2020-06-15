package com.siit.tema12.festival.domain;

public class Ticket {
    private TicketType ticketType;

    public Ticket (TicketType ticketType){this.ticketType =ticketType;}

    public TicketType getTicketType() {
        return ticketType;
    }

    public void setTicketType(TicketType ticketType) {
        this.ticketType = ticketType;
    }
}
