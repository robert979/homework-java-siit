package com.siit.tema9.cinema.set;

import lombok.Data;

import java.util.Set;

@Data


public class Seat {
    private String row;
    private int number;

    public Seat(String row, int number) {
        this.row = row;
        this.number = number;
    }

    public static void checkIfAvailableByRow(Set<Seat> seats, String row) {
        System.out.println("Available seats on row " + row + " are");
        for (int i = 1; i <= 10; i++) {

            if (seats.contains(new Seat(row, i))) {
                System.out.print(" ");
                System.out.printf("%02d", i);
            }
        }
    }
}
