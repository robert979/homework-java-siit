package com.siit.tema12.festival.service;

import com.siit.tema12.festival.repository.GateRepository;
import static com.siit.tema12.festival.repository.GateRepository.*;

public class FestivalService {
    public static void main(String[] args) {
        GateRepository object = new GateRepository();

       object.entryPeople();
        object.checkStatistics();

    }
}
