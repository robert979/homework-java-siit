package com.siit.tema10.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Stream {

    static Trader raoul = new Trader("Raoul", "Cambridge");

    static Trader mario = new Trader("Mario", "Milan");

    static Trader alan = new Trader("Alan", "Cambridge");

    static Trader brian = new Trader("Brian", "Cambridge");

    static List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
    );

    public static void main(String... args) {

        List<Transaction> streamList = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2012)
                // .sorted((t1,t2)-> t1.getValue()-t2.getValue())
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toCollection(ArrayList::new));
        streamList.forEach((s) -> System.out.println(s));


        // System.out.println(findAllCities());
        //System.out.println(findTradesFromCity("Cambridge"));
        //System.out.println(sortAllTraders());
        //System.out.println(findTradesFromCity("Milan"));
        //checkIfTraderFromCity("Milan");
        //printTransactionsValueFromCity("Cambridge");
        //findHighestTransactionValue();
        findSmallestValueTransaction();

    }

    /*
    1. Find all transactions in the year 2011 and sort them by value (small to high).
    2. What are all the unique cities where the traders work?
    3. Find all traders from Cambridge and sort them by name.
    4. Return a string of all traders’ names sorted alphabetically.
    5. Are any traders based in Milan?
    6. Print all transactions’ values from the traders living in Cambridge.
    7. What’s the highest value of all the transactions?
    8. Find the transaction with the smallest value.
     */
    static TreeSet<String> findAllCities() {
        TreeSet<String> sortedCities =

                transactions.stream()
                        .map(transaction -> transaction.getTrader().getCity())
                        .collect(Collectors.toCollection(TreeSet::new));

        return sortedCities;

    }


    static TreeSet<String> findTradesFromCity(String city) {
        TreeSet<String> sortedTradersFromCity = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity() == city)
                .map(transaction -> transaction.getTrader().getName())
                .collect(Collectors.toCollection(TreeSet::new));

        return sortedTradersFromCity;
    }

    static String sortAllTraders() {
        TreeSet<String> allTraders = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .collect(Collectors.toCollection(TreeSet::new));
        String str = allTraders.toString();
        return str;
    }

    static void checkIfTraderFromCity(String city) {
        ArrayList<String> arr = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity() == city)
                .map(transaction -> transaction.getTrader().toString())
                .collect(Collectors.toCollection((ArrayList<String>::new)));


        if (arr.size() > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    static void printTransactionsValueFromCity(String city) {
        ArrayList<Integer> transactionsValue = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity() == city)
                .map(transaction -> transaction.getValue())
                .collect(Collectors.<Integer, ArrayList<Integer>>toCollection(ArrayList::new));
        System.out.println("All transaction's value from " + city + " are:");
        transactionsValue.forEach(s -> System.out.println(s));
    }

    static void findHighestTransactionValue() {
        TreeSet<Integer> streamValue = transactions.stream()
                .map(transaction -> transaction.getValue())
                //     .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("The highest value transaction is " + streamValue.last());
    }

    static Transaction findSmallestValueTransaction() {
        ArrayList<Transaction> transactionList = transactions.stream()
                .sorted((t1, t2) -> t1.getValue() - t2.getValue())
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("The transaction with the smallest value is :\n" +
                transactionList.get(0));
        return transactionList.get(0);
    }

}
