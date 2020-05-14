package com.siit.tema10;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Stream;

public class FibonacciWithStream {


    public static int[] generateFibonacciSeries(int series) {
        return Stream.iterate(new int[]{0, 1}, s -> new int[]{s[1], s[0] + s[1]})
                .limit(series)
                .mapToInt(n -> n[0])
                .toArray();
    }

    public static BigInteger[] generateFibonacciWithBigInteger(int value) {

        BigInteger[] arrBI =
                Stream.iterate(new BigInteger[]{BigInteger.valueOf(0), BigInteger.valueOf(1)}, s -> new BigInteger[]{s[1], s[0].add(s[1])})
                        .limit(value)
                        .map(arr -> arr[0])
                        .toArray(BigInteger[]::new);


        return arrBI;
    }


    public static void main(String[] args) {
        /*for (int s: generateFibonacciSeries(45)){
            System.out.println(s);
            }
         */
        System.out.println(Arrays.toString(generateFibonacciWithBigInteger(100)));


    }
}

