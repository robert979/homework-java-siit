package com.siit.tema12.festival.service;

import com.siit.tema12.festival.repository.GateRepository;
import static com.siit.tema12.festival.repository.GateRepository.*;

public class FestivalService {
    static private  GateRepository gateRepository = new GateRepository();
    public static void main(String[] args) {

        gateRepository.checkStatistics();
        gateRepository.entryPeople();
    }
}
