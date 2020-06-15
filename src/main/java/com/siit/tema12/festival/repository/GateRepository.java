package com.siit.tema12.festival.repository;

import com.siit.tema12.festival.domain.Gate;
import static com.siit.tema12.festival.repository.TicketRepository.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class GateRepository {
//private final ScheduledExecutorService programBeeper = Executors.newScheduledThreadPool(1);
    private final ScheduledExecutorService  programGate = Executors.newScheduledThreadPool(gatesNumber);

    static private int gatesNumber = 1;
    static private int maxAttends = 1000;

    public static List<Gate> allGates (){
        List<Gate> allGates = new ArrayList<>();
        for (int i=1; i<=gatesNumber;i++){
            allGates.add(new Gate());
        }
        return allGates;
    }
    public int entryPeople(){
        Runnable entry = ()->soldTickets.add(returnRandomTicket());
    }
}

/*
public void beepForAnHour() {
        Runnable beeper = () -> System.out.println("beep");
        ScheduledFuture<?> beeperHandle = programBeeper.scheduleAtFixedRate(beeper, 10, 10, TimeUnit.SECONDS);


        Runnable canceller = () -> beeperHandle.cancel(checkIfAvailable(15000));
        programBeeper.schedule(canceller, 1, TimeUnit.HOURS);

 */
