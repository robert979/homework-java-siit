package com.siit.tema12.thread.ciorna;

import com.siit.tema12.festival.domain.Gate;
import com.siit.tema12.festival.domain.TicketType;
import com.sun.source.tree.NewArrayTree;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FestivalRepository {
    private static   int maxAttendees = 1000;
    private static int gatesNumber = 5;
   static List <BilletType> allTicketsType = Arrays.asList(
           BilletType.FULL,
            BilletType.FULL_VIP,
            BilletType.ONE_DAY_VIP
    );
    static List<FestivalAttendeeThread> threadList = new ArrayList<>();

    public static List<FestivalAttendeeThread> generateAllGatesThreads (){
        for (int i=0; i<= gatesNumber-1;i++){
            threadList.add(new FestivalAttendeeThread(generateRandomTicketType(),new Entrance()));
        }
        return threadList;
    }
    public static BilletType generateRandomTicketType (){
        return allTicketsType.get(new Random().nextInt(allTicketsType.size()));
    }

    public static void main(String[] args) {

    }

}
