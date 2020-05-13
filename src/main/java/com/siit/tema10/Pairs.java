package com.siit.tema10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pairs {

    static int[] socks = {1, 2, 3, 1, 3, 1, 2, 2, 2, 3};

    static int checkPairsNumbers() {
        int pairs = 0;
        List<Integer> uniqueSocks = new ArrayList<>();
        uniqueSocks.add(socks[0]);
        for (int i = 1; i <= socks.length - 1; i++) {
            if (!uniqueSocks.contains(socks[i])) {
                uniqueSocks.add(socks[i]);

            }
        }
        for (int i = 0; i <= uniqueSocks.size() - 1; i++) {
            int counter = 0;
            for (int j = 0; j <= socks.length - 1; j++) {

                if (uniqueSocks.get(i) == socks[j]) {
                    counter = counter + 1;

                }
            }
            pairs = pairs + counter / 2;
        }
        return pairs;
    }

    /*static int checkThePairs() {
        TreeMap<Integer, Integer> list = Arrays.stream(socks)
                .collect(Arrays.to)


    }

     */

    public static void main(String[] args) {
        System.out.println("fot the given list" + Arrays.toString(socks) + "\n we have " + checkPairsNumbers() + " pairs of socks");

    }
}
