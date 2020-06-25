package com.siit.tema14.ciorna;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JDBCCiorna {
    public static void main(String[] args) {


        LocalDateTime today = LocalDateTime.now();
        System.out.println("today = " + today);
        today= LocalDateTime.parse("2020-06-19T10:24:05");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd,yyyy, HH:mm:ss ");
        today = LocalDateTime.parse("01 19,2020, 15:24:05 ", formatter);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MMM dd,yyyy, HH:mm:ss a");
        System.out.println("new format " +today);
        System.out.println("today = " + today.format(formatter1));
        DateTimeFormatter formatSQL = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("SQL format " + today.format(formatSQL));

    }
}
