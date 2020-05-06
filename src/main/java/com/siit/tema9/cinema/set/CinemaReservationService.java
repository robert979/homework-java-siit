package com.siit.tema9.cinema.set;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class CinemaReservationService {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Seat> seats = new HashSet<>();
        Set<Seat> reservedSeats = new HashSet<>();
        String intialStr = "yes";
        String allRows = "A©B©C©D©E©F©G©H©I©J ";
        String allseatsNumbers = "1©2©3©4©5©6©7©8©9©10";

        for (Character letters = 'A'; letters <= 'J'; letters++) {
            for (int i = 1; i <= 10; i++) {
                Seat seatTemporar = new Seat(letters.toString(), Integer.parseInt(String.format("%02d", i)));

                seats.add(seatTemporar);
            }

        }
        String cinemaName = "Scala";
        Cinema cinema = new Cinema(cinemaName, seats, BigDecimal.valueOf(0.00));


        while (intialStr.equals("yes")) {
            System.out.println("Please make choice:\n" +
                    "1) check all available seats.\n" +
                    "2) reserve a seat.\n" +
                    "3) cancel a reservation\n" +
                    "4) check ballance");
            String str = input.nextLine();
            if (str.equals("1")) {
                Cinema.checkAllAvailableseats(cinema.getSeat());
                System.out.println("Do you want to go back to the meniu, please type \"yes\" if you do.");
                System.out.println();
                intialStr = input.nextLine().toLowerCase();
            } else if (str.equals("2")) {
                System.out.println("The price for one ticket is 10.50 €." +
                        "" +
                        "\nIn order to reserve a seat please insert the row from \"A\" to \"J\"");
                String row = input.nextLine().toUpperCase();
                if (allRows.contains(row)) {
                    System.out.println("please insert the seat number you want to reserve");
                    String seatNumber = input.nextLine();
                    if (allseatsNumbers.contains(seatNumber)) {
                        cinema.reserveSeat(seats, reservedSeats, row, Integer.parseInt(seatNumber));
                        System.out.println();
                        System.out.println("Do you want to go back to the meniu, please type \"yes\" if you do.");
                        intialStr = input.nextLine().toLowerCase();
                    } else {
                        System.out.println("Wrong seat number.\n" +
                                "Do you want to go back to the meniu, please type \"yes\" if you do.");
                        intialStr = input.nextLine().toLowerCase();
                    }
                } else {
                    System.out.println("This row doesn't exists.\n" +
                            "Do you want to go back to the meniu, please type \"yes\" if you do.");
                    intialStr = input.nextLine().toLowerCase();

                }

            } else if (str.equals("4")) {
                System.out.println();
                System.out.println("Cinema\'s ballance is " + cinema.getBallance() + " €\n" +
                        "This means that there are " + cinema.getBallance().divide(BigDecimal.valueOf(10.5)) + " tickets sould\n" +
                        "And there are stil " + BigDecimal.valueOf(100).subtract(cinema.getBallance().divide(BigDecimal.valueOf(10.5))) + " tickets available");
                System.out.println();
                System.out.println("Do you want to go back to the meniu, please type \"yes\" if you do.");
                intialStr = input.nextLine().toLowerCase();
            } else if (str.equals("3")) {
                System.out.println("What is the seat that you want to cancel the reservation fo\n" +
                        "Please type the row");
                String row = input.nextLine().toUpperCase();
                if (allRows.contains(row)) {
                    System.out.println("Please type the seat number");
                    {
                        String seatNumber = input.nextLine();
                        if (allseatsNumbers.contains(seatNumber)) {
                            cinema.cancelReservation(seats, reservedSeats, row, Integer.parseInt(seatNumber));
                        } else {
                            System.out.println("Wrong seat number.\n" +
                                    "Do you want to go back to the meniu, please type \"yes\" if you do.");
                            intialStr = input.nextLine().toLowerCase();
                        }
                    }
                } else {
                    System.out.println("This row doesn't exists.\n" +
                            "Do you want to go back to the meniu, please type \"yes\" if you do.");
                    intialStr = input.nextLine().toLowerCase();

                }
            } else {
                System.out.println("There is no such option as \"" + str + "\"");
                System.out.println();
                System.out.println("Do you want to go back to the meniu, please type \"yes\" if you do.");
                intialStr = input.nextLine().toLowerCase();
                System.out.println();
                System.out.println();

            }

        }

    }


}
