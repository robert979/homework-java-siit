package com.siit.tema12.festival.service;

import com.siit.tema12.festival.repository.GateRepository;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import static com.siit.tema12.festival.repository.GateRepository.*;
import static com.siit.tema12.festival.repository.TicketRepository.*;

public class FestivalService {
    static private GateRepository gateRepository = new GateRepository();
    static private int maxAttends = 20;
    static private int gatesNumber = 5;

    public static void main(String[] args) {

        gateRepository.checkStatistics();
        gateRepository.entryPeople();

        //gateRepository.startEntryPeople();


    }
}
