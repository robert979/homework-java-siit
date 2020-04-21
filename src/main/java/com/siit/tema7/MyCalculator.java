package com.siit.tema7;

public class MyCalculator {
    public int power(int n, int p) throws Exception {
        int d;
        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");

        } else if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        } else {
            d = (int) Math.pow(n, p);

        }
        return d;
    }
}
