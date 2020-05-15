package com.siit.tutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
    static final List<User> userList = new ArrayList<>();

    static {
        User user1 = new User(15);
        User user2 = new User(14);
        User user3 = new User(19);
        User user4 = new User(20);
        User user5 = new User(21);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
    }

    public static void main(String[] args) {
        System.out.println(getLimitedUserList(userList, 2).size());
    }

    public static List<Integer> returnSquareRoot(List<Integer> numbers) {

        return numbers.stream()
                .map(n -> (int) Math.sqrt(n))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static List<Integer> getAgeFromUsers(List<User> user) {
        return user.stream()
                .map(n -> n.getAge())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static List<Integer> getDistinctAges(List<User> users) {
        throw new NotImplementedException();
    }

    public static List<User> getLimitedUserList(List<User> users, int limit) {

        return users.stream()
                .limit(limit)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static Integer countUsersOlderThen25(List<User> users) {

        return users.stream()
                .filter(n -> n.getAge() > 25)

                .collect(Collectors.toCollection(ArrayList::new)).size();
    }

    public static List<String> mapToUpperCase(List<String> strings) {

        return strings.stream()
                .map(n -> n.toUpperCase())
                .collect(Collectors.toCollection(ArrayList::new));

    }

    public static Integer sum(List<Integer> integers) {
        throw new NotImplementedException();
    }

    public static List<Integer> skip(List<Integer> integers, Integer toSkip) {
        throw new NotImplementedException();
    }

    public static List<String> getFirstNames(List<String> names) {
        throw new NotImplementedException();
    }

    public static List<String> getDistinctLetters(List<String> names) {
        throw new NotImplementedException();
    }

    public static String separateNamesByComma(List<User> users) {
        throw new NotImplementedException();
    }

    public static double getAverageAge(List<User> users) {
        throw new NotImplementedException();
    }

    public static Integer getMaxAge(List<User> users) {
        throw new NotImplementedException();
    }

    public static Integer getMinAge(List<User> users) {
        throw new NotImplementedException();
    }

    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users) {
        throw new NotImplementedException();
    }

    public static Map<Integer, List<User>> groupByAge(List<User> users) {
        throw new NotImplementedException();
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users) {
        throw new NotImplementedException();
    }

    public static Map<Boolean, Long> countGender(List<User> users) {
        throw new NotImplementedException();
    }

    public static boolean anyMatch(List<User> users, int age) {
        throw new NotImplementedException();
    }

    public static boolean noneMatch(List<User> users, int age) {
        throw new NotImplementedException();
    }

    public static Optional<User> findAny(List<User> users, String name) {
        throw new NotImplementedException();
    }

    public static List<User> sortByAge(List<User> users) {
        throw new NotImplementedException();
    }

    public static Stream<Integer> getBoxedStream(IntStream stream) {
        throw new NotImplementedException();
    }

    public static List<Integer> generateFirst10PrimeNumbers() {
        throw new NotImplementedException();
    }

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }

    public static List<Integer> generate10RandomNumbers() {
        throw new NotImplementedException();
    }

    public static User findOldest(List<User> users) {
        throw new NotImplementedException();
    }

    public static int sumAge(List<User> users) {
        throw new NotImplementedException();
    }

    public static class NotImplementedException extends RuntimeException {
        public NotImplementedException() {
            super("This method hasn't been implemented yet!");
        }
    }

}
