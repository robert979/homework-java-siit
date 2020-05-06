package com.siit.tema9.cinema.set;

import lombok.ToString;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@ToString

public class Cinema {
    private String cinemaName;
    private Set<Seat> seat;
    private BigDecimal ballance;

    public Cinema(String cinemaName, Set<Seat> seat, BigDecimal ballance) {
        this.cinemaName = cinemaName;
        this.seat = seat;
        this.ballance = ballance;
    }

    public static void checkAllAvailableseats(Set<Seat> seats) {
        System.out.println("The following seats are available");
        for (Character ch = 'A'; ch <= 'J'; ch++) {
            for (int i = 1; i <= 10; i++) {
                if (seats.contains(new Seat(ch.toString(), i))) {
                    System.out.printf(" " + ch + "%02d", i);
                }

            }
            System.out.println();
        }


    }

    public static Set<Seat> createCinemaSeats(Character ch) {
        Set<Seat> seatsCinema = new HashSet<>();
        for (Character row = 'A'; row <= ch; row++) {
            for (int i = 1; i <= 10; i++) {
                Seat seat = new Seat(ch.toString(), 10);
                seatsCinema.add(seat);
            }
        }

        return seatsCinema;

    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public Set<Seat> getSeat() {
        return seat;
    }

    public void setSeat(Set<Seat> seat) {
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

    public BigDecimal getBallance() {
        return ballance;
    }

    public void setBallance(BigDecimal ballance) {
        this.ballance = ballance;
    }

    public boolean reserveSeat(Set<Seat> seats, Set<Seat> reservedSeats, String row, int seatNr) {
        if (seats.contains(new Seat(row, seatNr))) {
            System.out.printf("Your seat " + row + "%02d", seatNr);
            System.out.print(" was reserved");
            this.ballance = this.ballance.add(BigDecimal.valueOf(10.50));

            seats.remove(new Seat(row, seatNr));
            reservedSeats.add(new Seat(row, seatNr));

            return true;

        } else {
            System.out.println("The seat you requested can't be reserved");
            return false;
        }
    }

    public boolean cancelReservation(Set<Seat> availableSeats, Set<Seat> reservedSeats, String row, int seatNr) {
        if (reservedSeats.contains(new Seat(row, seatNr))) {
            System.out.println();
            System.out.printf("Your reservation for the seat " + row + "%02d", seatNr);
            System.out.print(" was canceled ");
            System.out.println();
            System.out.println("And 10.50 € were returned");
            reservedSeats.remove(new Seat(row, seatNr));
            availableSeats.add(new Seat(row, seatNr));
            this.ballance = this.ballance.subtract(BigDecimal.valueOf(10.50));
            return true;
        } else {
            System.out.println("Your cancel request was rejected - the seat doesn't not appear in our data base as reserved\n");
            System.out.println();
            return false;
        }
    }

}
