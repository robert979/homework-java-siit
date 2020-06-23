package com.siit.tema15;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.YearMonth;

public class TimeDate {
    public static void main(String[] args) {
        // int maxNumberDays = Month.of(2).maxLength();

        //listAllMondaysWithYear(1979, 2);
        //checkMonthLength(1979);
        //checkFridayThirteen(2020, 4);
        //findDay(2, 19, 1979); //hackerRank


    }

    public static boolean checkFridayThirteen(int year, int monthNo) {
        if ((LocalDate.parse(year + "-" + String.format("%02d", monthNo) + "-13")).getDayOfWeek().toString().equals("FRIDAY")) {
            System.out.println("the date " + (LocalDate.parse(year + "-" + String.format("%02d", monthNo) + "-13") + " is Friday"));
            System.out.println(true);
            return true;
        } else {
            System.out.println("the date " + (LocalDate.parse(year + "-" + String.format("%02d", monthNo) + "-13")) + " is " +
                    (LocalDate.parse(year + "-" + String.format("%02d", monthNo) + "-13").getDayOfWeek().toString()));
            System.out.println(false);
            return false;
        }
    }

    public static void checkMonthLength(int year) {
        int i = 1;
        while (i <= 12) {
            System.out.println("For the year/month " + year + "/" + YearMonth.of(year, i).getMonth() + " there are " +
                    YearMonth.of(year, i).lengthOfMonth() + " of days");
            i++;
        }
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
    public static String findDay(int month, int day, int year) {
        LocalDate wantedDay= LocalDate.parse(year+"-"+String.format("%02d", month)+"-"+String.format("%02d", day));
        System.out.println(wantedDay.getDayOfWeek());
        return wantedDay.getDayOfWeek().toString();


    }

}
