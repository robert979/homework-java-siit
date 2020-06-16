package com.siit.tema12.thread.ciorna;

import com.siit.tema12.festival.domain.Gate;
import lombok.Data;

import java.util.Arrays;
import java.util.List;


@Data

public class FestivalAttendeeThread {

    private BilletType billetType;
    private Entrance entrance;

    public FestivalAttendeeThread(BilletType billetType, Entrance entrance) {
        this.billetType = billetType;
        this.entrance = entrance;
    }

    public static void main(String[] args) {
        FestivalAttendeeThread festivalAttendeeThread = new FestivalAttendeeThread(BilletType.FULL, new Entrance());
    }

}
