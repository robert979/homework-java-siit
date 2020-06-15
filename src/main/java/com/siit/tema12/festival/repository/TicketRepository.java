//soldTickets - QUEUE care stocheaza toate biletele
package com.siit.tema12.festival.repository;

import com.siit.tema12.festival.domain.Ticket;
import com.siit.tema12.festival.domain.TicketType;

import java.util.*;

public class TicketRepository {
    List<Ticket> ticketType = Arrays.asList(
            new Ticket(TicketType.FREE_PASS),
            new Ticket(TicketType.FULL),
            new Ticket(TicketType.FULL_VIP),
            new Ticket(TicketType.ONE_DAY),
            new Ticket(TicketType.ONE_DAY_VIP)
    );
    Queue<Ticket> soldTickets = new LinkedList();

    public static int allSoldTickets(Queue soldTickets) {
        return soldTickets.size();
    }

    public static void returnStatistics(Queue<Ticket> soldTickets) {
        int counterFreePass = 0;
        int counterFull = 0;
        int counterFullVip = 0;
        int counterOneDay = 0;
        int counterOneDayVip = 0;

        for (Ticket ticket : soldTickets) {
            if (ticket.getTicketType() == TicketType.FREE_PASS) {
                counterFreePass += 1;
            }
            if (ticket.getTicketType() == TicketType.FULL) {
                counterFull += 1;
            }
            if (ticket.getTicketType() == TicketType.FULL_VIP) {
                counterFullVip += 1;
            }
            if (ticket.getTicketType() == TicketType.ONE_DAY) {
                counterOneDay += 1;
            }
            if (ticket.getTicketType() == TicketType.ONE_DAY_VIP) {
                counterOneDayVip += 1;
            }
            if (soldTickets.size() > 0) {
                System.out.println("FREE_PASS " + counterFreePass + "%\n" +
                        "FULL " + counterFull + "%\n" +
                        "FULL_VIP " + counterFullVip + "%\n" +
                        "ONE_DAY " + counterOneDay + "%\n" +
                        "ONE_DAY_VIP " + counterOneDayVip + "%");

            } else {
                System.out.println("No tickets sold");
            }

        }
    }

    private static double checkPercentage(int soldTicketsType, int allSoldTickets) {

            return (100 * soldTicketsType) / allSoldTickets;


    }
}

