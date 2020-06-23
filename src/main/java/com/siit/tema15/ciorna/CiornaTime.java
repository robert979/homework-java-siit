package com.siit.tema15.ciorna;

import jdk.nashorn.internal.runtime.regexp.joni.ast.AnyCharNode;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.Calendar;

public class CiornaTime {
    public static void main(String[] args) {
        int counter =0;


        LocalDate robertBirthDate = LocalDate.parse("1979-02-19");
        String b = "2020";
       //LocalDate anyDate = LocalDate.parse("2020-01-"+b);

       //System.out.println(anyDate.getDayOfWeek());
       //
       //System.out.println(robertBirthDate.getDayOfWeek());
       //System.out.println(b);
       //
       //System.out.println("ziua din an " + robertBirthDate.getDayOfYear());
       //System.out.println("ziua din luna " + robertBirthDate.getDayOfMonth());

       //LocalDate startDate = LocalDate.parse(b+"-01-01");
       //LocalDate endDate = LocalDate.parse(b+"-12-31");
       //
       //System.out.println(startDate.getDayOfWeek());
       //System.out.println(endDate.getDayOfWeek());

        YearMonth yearMonth = YearMonth.of(2020, 2);
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,2020);
        calendar.set(Calendar.MONTH,2);
        System.out.println(yearMonth.lengthOfMonth());

    }
}
