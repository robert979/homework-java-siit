//soldTickets - QUEUE care stocheaza toate biletele
//returnRandomTicket - genereaza un Ticket
package com.siit.tema12.festival.repository;

import com.siit.tema12.festival.domain.Ticket;
import com.siit.tema12.festival.domain.TicketType;

import javax.xml.crypto.Data;
import java.util.*;

public class TicketRepository {
    static private int maxAttends = 20;
   private static List<Ticket> ticketType = Arrays.asList(
            new Ticket(TicketType.FREE_PASS),
            new Ticket(TicketType.FULL),
            new Ticket(TicketType.FULL_VIP),
            new Ticket(TicketType.ONE_DAY),
            new Ticket(TicketType.ONE_DAY_VIP)
    );
   public static Queue<Ticket> soldTickets = new LinkedList();

    public static int allSoldTickets() {
        return soldTickets.size();
    }
    public static void returnStatistics(){
        if (soldTickets.size()==0){
            System.out.println("No tickets sold");
        }else {
            returnStatistic();
        }
    }

    public static void returnStatistic() {
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

            }
        System.out.println("FREE_PASS " + String.format("%.02f",checkPercentage(counterFreePass))+ "%\n" +
                "FULL " + String.format("%.02f",checkPercentage(counterFull)) + "%\n" +
                "FULL_VIP " + String.format("%.02f",checkPercentage(counterFullVip)) + "%\n" +
                "ONE_DAY " + String.format("%.02f",checkPercentage(counterOneDay)) + "%\n" +
                "ONE_DAY_VIP " + String.format("%.02f",checkPercentage(counterOneDayVip)) + "%\n" +
                java.time.LocalDateTime.now().toString().substring(0, 19)+
                "\nand a total of " + allSoldTickets()+" people are attending to this concert"+
                "\n===================================");
        }




    private static double checkPercentage(int soldTicketsType) {

            return (100 * (double)(soldTicketsType ) )/ ((double)allSoldTickets());


    }
    public static Ticket returnRandomTicket (){
        Random rand = new Random();
        return  ticketType.get(rand.nextInt(ticketType.size()));
    }
   public static Boolean checkCapacity(){
        if (soldTickets.size()<=maxAttends){
            System.out.println(true);
            return true;
        }
        else{
            System.out.println("False");
            return false;
        }
    }
}

