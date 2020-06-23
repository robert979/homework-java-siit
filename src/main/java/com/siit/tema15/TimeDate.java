package com.siit.tema15;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.YearMonth;

public class TimeDate {
    public static void main(String[] args) {
        int maxNumberDays = Month.of(2).maxLength();
        ///System.out.println(maxNumberDays);

        //listAllMondays(12);
        listAllMondaysWithYear(1979, 2);


    }

    public static void listAllMondays(int monthNo) {
        if (monthNo > 0 && monthNo <= 12) {
            YearMonth yearMonth = YearMonth.of(2020, monthNo);
            for (LocalDate date = LocalDate.parse("2020-" + String.format("%02d", monthNo) + "-01");
                 date.isBefore(LocalDate.parse("2020-" + String.format("%02d", monthNo) + "-" + yearMonth.lengthOfMonth()));
                 date = date.plusDays(1)) {
                if (date.getDayOfWeek().toString().equals("MONDAY")) {
                    System.out.println(date + " is Monday");
                }

            }

        } else {
            System.out.println("Please input a right value between 1 and 12");
        }
    }

    public static void listAllMondaysWithYear(int year, int monthNo) {
        if (monthNo > 0 && monthNo <= 12) {
            YearMonth yearMonth = YearMonth.of(year, monthNo);
            for (LocalDate date = LocalDate.parse(year + "-" + String.format("%02d", monthNo) + "-01");
                 date.isBefore(LocalDate.parse(year + "-" + String.format("%02d", monthNo) + "-" + yearMonth.lengthOfMonth()));
                 date = date.plusDays(1)) {
                if (date.getDayOfWeek().toString().equals("MONDAY")) {
                    System.out.println(date + " is Monday");
                }

            }

        } else {
            System.out.println("Please input a right value between 1 and 12");
        }
    }

}
