package com.siit.tema11.atm;

import java.math.BigDecimal;

public class Ciorna {
    public static void main(String[] args) {
        String a = "   0.0      ";
        BigDecimal b = new BigDecimal(a.substring(1, 10).trim());
        System.out.println(b);
    }
}
