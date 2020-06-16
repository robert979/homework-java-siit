//checkStatistics -->porneste pool2 cu 1 Thread de statistica statistica  --> este nevoie de obiect creeat - metoda nestatica
//entryPeople --> genereaza un pool cu nr de Tread-uri egal cu nr de gatesNumber --> este nevoie de obiect creeat - metoda nestatica
package com.siit.tema12.festival.repository;


import static com.siit.tema12.festival.repository.TicketRepository.*;


import java.util.concurrent.*;

public class GateRepository {

    private final ScheduledExecutorService programGate = Executors.newScheduledThreadPool(gatesNumber);
    private final ScheduledExecutorService programStatistic = Executors.newSingleThreadScheduledExecutor();


    static private int gatesNumber = 5;
    static private int maxAttends = 20;



    public  void entryPeople() {


    Runnable entry = () ->{

            soldTickets.add(returnRandomTicket()); //comanda este de a intra/adauga un om/bilet la lista soldtickets}
        System.out.println("Thread entry  " + Thread.currentThread().getName());
        };
    ScheduledFuture<?> entryHandle = programGate.scheduleAtFixedRate(entry, 0, 480, TimeUnit.MILLISECONDS);
    Runnable stopEntry = () -> entryHandle.cancel(checkCapacity());
    programGate.schedule(stopEntry, 200, TimeUnit.SECONDS);

    }
    public void checkStatistics (){
        Runnable checkStatistics = ()-> returnStatistics();
       ScheduledFuture <?> statisticHandle = programStatistic.scheduleWithFixedDelay(checkStatistics, 5, 5, TimeUnit.SECONDS);
       Runnable stopStatistics = () -> statisticHandle.cancel(checkCapacity());
       programStatistic.schedule(stopStatistics, 200, TimeUnit.SECONDS);
      }



    public  void  startEntryPeople(){
        ScheduledExecutorService entry =new ScheduledThreadPoolExecutor(gatesNumber);
        Runnable myRunnableMethod = ()-> entryPeople();
        entry.scheduleWithFixedDelay(myRunnableMethod, 0, 1, TimeUnit.SECONDS);
    }

/*
    public static void main(String[] args) {
        GateRepository test = new GateRepository();
        test.entryPeople();
        test.checkStatistics();

    }

 */

}

/*
for (Gate gate:gateList){
        ScheduledExecutorService entry =new ScheduledThreadPoolExecutor(1);
        Runnable myRunnableMethod = ()-> entryPeople();
        entry.scheduleWithFixedDelay(myRunnableMethod, 0, 1, TimeUnit.SECONDS);
        }
sau pe linia 2
     ScheduledExecutorService entry =new ScheduledThreadPoolExecutor(gateList.getIndex(gate));
 */

/*
public static List<Gate> allGates() {
        List<Gate> allGates = new ArrayList<>();
        for (int i = 1; i <= gatesNumber; i++) {
            allGates.add(new Gate());
        }
        return allGates;
    }
 */
