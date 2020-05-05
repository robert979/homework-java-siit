package com.siit.tema9.cinema.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class CinemaReservationService {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Seat> seats = new HashSet<>();
        Set<Seat> reservedSeats = new HashSet<>();

        for (Character letters = 'A'; letters <= 'J'; letters++) {
            for (int i = 1; i <= 10; i++) {
                Seat seatTemporar = new Seat(letters.toString(), Integer.parseInt(String.format("%02d", i)));

                seats.add(seatTemporar);
            }

            Cinema cinema = new Cinema("Gloria", seats);
        }
        System.out.println("Please insert the name of your Cinema");
        String cinemaName = input.nextLine();
        System.out.println("How many rows do you want your Cinema to have ? \n" +
                "(please chose any leeter from A to Z)");
        String maxRow = input.nextLine().toUpperCase();


    }


}
