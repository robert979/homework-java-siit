package com.siit.tema9.cinema.set;

import java.util.Set;

public class Cinema {
    private String cinemaName;
    private Set<Seat> seat;

    public Cinema(String cinemaName, Set<Seat> seat) {
        this.cinemaName = cinemaName;
        this.seat = seat;
    }

    public static void checkIfAvailableByRow(Set<Seat> seats, String row) {
        System.out.println();
        System.out.println("Available seats on row " + row + " are");
        for (int i = 1; i <= 10; i++) {

            if (seats.contains(new Seat(row, i))) {

                System.out.printf("%02d", i);
                System.out.print(" ");
            }
        }
    }

    public static boolean reserveSeat(Set<Seat> seats, Set<Seat> reservedSeats, String row, int seatNr) {
        if (seats.contains(new Seat(row, seatNr))) {
            System.out.printf("Your seat " + row + "%02d", seatNr);
            System.out.print(" was reserved");

            seats.remove(new Seat(row, seatNr));
            reservedSeats.add(new Seat(row, seatNr));
            return true;

        } else {
            System.out.println("The seat you requested can't be reserved");
            return false;
        }
    }

    public static boolean cancelReservation(Set<Seat> availableSeats, Set<Seat> reservedSeats, String row, int seatNr) {
        if (reservedSeats.contains(new Seat(row, seatNr))) {
            System.out.println();
            System.out.printf("Your reservation for the seat " + row + "%02d", seatNr);
            System.out.println(" was canceled ");
            reservedSeats.remove(new Seat(row, seatNr));
            availableSeats.add(new Seat(row, seatNr));
            return true;
        } else {
            System.out.println("Your cancel request was rejected - the seat doesn't not appear in our data base as reserved");
            return false;
        }
    }

    public static void checkAllAvailableseats(Set<Seat> seats) {
        System.out.println("The following are available");
        for (Character ch = 'A'; ch <= 'J'; ch++) {
            for (int i = 1; i <= 10; i++) {
                if (seats.contains(new Seat(ch.toString(), i))) {
                    System.out.printf(" " + ch + "%02d", i);
                }

            }
            System.out.println();
        }

    }


}
