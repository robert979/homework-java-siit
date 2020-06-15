//entryPeople --> genereaza un nr de persoane pentru fiecare poarta, din totalul de porti declarate
//entryOnAllGates --> genereaza numarul de persoane pe toate portile
package com.siit.tema12.festival.repository;

import com.siit.tema12.festival.domain.Gate;
import static com.siit.tema12.festival.repository.TicketRepository.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class GateRepository {
    //private final ScheduledExecutorService programBeeper = Executors.newScheduledThreadPool(1);
    private final ScheduledExecutorService programGate = Executors.newScheduledThreadPool(gatesNumber);

    static private int gatesNumber = 1;


    public static List<Gate> allGates() {
        List<Gate> allGates = new ArrayList<>();
        for (int i = 1; i <= gatesNumber; i++) {
            allGates.add(new Gate());
        }
        return allGates;
    }
   /* public static void entryOnAllGates (){
        GateRepository eachGate =new GateRepository();
      for (Gate gate: allGates()){
          eachGate.entryPeople(gate);

      }
    }

    */

    public  void entryPeople() {

            Runnable entry = () -> soldTickets.add(returnRandomTicket()); //comanda este de a intra/adauga un om/bilet la lista soldtickets
            ScheduledFuture<?> entryHandle = programGate.scheduleAtFixedRate(entry, 0, 2, TimeUnit.SECONDS);

           Runnable stopEntry = () -> entryHandle.cancel(checkCapacity());  // --> se creaza conditia de oprire intrare
             programGate.schedule(stopEntry,1 ,TimeUnit.HOURS );

           // entryHandle.cancel(checkCapacity());



    }
    public void checkStatistics (){
        Runnable checkStatistics = ()->returnStatistics();
        ScheduledFuture <?> statisticHandle = programGate.scheduleAtFixedRate(checkStatistics, 10, 10, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        GateRepository test = new GateRepository();
        test.entryPeople();
        test.checkStatistics();

    }

}


