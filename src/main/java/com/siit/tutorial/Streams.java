package com.siit.tutorial;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
    static final List<User> userList = new ArrayList<>();
    static final List<User> usersWithGender = new ArrayList<>();

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
        User user11 = new User("Jhon", true);
        User user12 = new User("Maria", false);
        User user13 = new User("Marius", true);
        User user14 = new User("Aglaia", false);

        usersWithGender.add(user11);
        usersWithGender.add(user12);
        usersWithGender.add(user13);
        usersWithGender.add(user14);
    }

    public static void main(String[] args) {

        //System.out.println(getLimitedUserList(userList, 2).size());

        partionUsersByGender(usersWithGender).forEach((key, value) -> System.out.println(key + ": " + printUser(value)));


    }

    public static String printUser(List<User> list) {
        String str = new String();
        for (int i = 0; i <= list.size() - 1; i++) {
            str = str + list.get(i).getName() + " ";
        }
        return str;
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

        return users.stream()
                .map(n -> n.getAge())
                .distinct()
                .collect(Collectors.toCollection(ArrayList::new));
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
        return integers.stream()
                .reduce(0, (a, b) -> a + b);

    }

    public static List<Integer> skip(List<Integer> integers, Integer toSkip) {

        return integers.stream()
                //.filter(i -> i % toSkip == 0) pastreaza indicii 0,0+toskip, 0+toskipx2..etc
                .skip(toSkip)
                .collect(Collectors.toCollection(ArrayList::new));


    }

    public static List<String> getFirstNames(List<String> names) {
        return names.stream()
                .map(n -> n.substring(0, n.indexOf(" ")))
                .collect(Collectors.toCollection(ArrayList::new));

    }

    public static List<String> getDistinctLetters(List<String> names) {

        return names.stream()
                .map(n -> n.split(""))
                .flatMap(n -> Arrays.stream(n))
                .distinct()
                .collect(Collectors.toCollection(ArrayList::new));

    }

    public static String separateNamesByComma(List<User> users) {
        return (String) users.stream()
                .map(n -> n.getName())
                .collect(Collectors.joining(", "));


    }

    public static double getAverageAge(List<User> users) {

        return users.stream()
                .mapToInt(n -> n.getAge())
                .average().getAsDouble();
    }

    public static Integer getMaxAge(List<User> users) {

        return users.stream()
                .mapToInt(n -> n.getAge())
                .max().getAsInt();


    }

    public static Integer getMinAge(List<User> users) {

        return users.stream()
                .mapToInt(n -> n.getAge())
                .min().getAsInt();
    }

    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users) {

        //throw new NotImplementedException();
        return users.stream()
                .collect(Collectors.groupingBy(User::isMale));
        // .collect(Collectors.toCollection(HashMap<boolean,ArrayList::new>::new))
    }


    public static Map<Integer, List<User>> groupByAge(List<User> users) {
        return users.stream()
                //.sorted((a,b)->a.getAge()-b.getAge())
                .sorted(Comparator.comparingInt(User::getAge))
                .collect(Collectors.groupingBy(User::getAge));
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users) {
        return users.stream()
                .sorted((b, a) -> a.getAge() - b.getAge())
                .collect(Collectors.groupingBy(User::isMale, Collectors.groupingBy(User::getAge)));
    }

    public static Map<Boolean, Long> countGender(List<User> users) {
        //throw new NotImplementedException();
        return users.stream()


                .collect(Collectors.groupingBy(User::isMale, Collectors.counting()));

        //.collect(Collectors.partitioningBy(s->s.isMale(), Length)


    }

    public static boolean anyMatch(List<User> users, int age) {
        return users.stream()
                .map(s -> s.getAge())
                .anyMatch(s -> s == age);

    }

    public static boolean noneMatch(List<User> users, int age) {
        return users.stream()
                .map(s -> s.getAge())
                .anyMatch(s -> s != age);
    }

    public static Optional<User> findAny(List<User> users, String name) {
        throw new NotImplementedException();
        /*
          return users.stream()
                .sorted((a,b) ->a.getAge()-b.getAge())
                .map(n->User.getUsersWithAge())
                .findFirst()


                .collect()

         */

    }

    public static List<User> sortByAge(List<User> users) {
        return users.stream()
                .sorted((a, b) -> a.getAge() - b.getAge())
                .collect(Collectors.toCollection(ArrayList::new));

    }

    public static Stream<Integer> getBoxedStream(IntStream stream) {
        return stream
                .boxed();


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
        return users.stream()
                .sorted((a, b) -> b.getAge() - a.getAge())
                .findFirst().get();


    }

    public static int sumAge(List<User> users) {
        return users.stream()
                .mapToInt(n -> n.getAge())
                .sum();

    }

    public static class NotImplementedException extends RuntimeException {
        public NotImplementedException() {
            super("This method hasn't been implemented yet!");
        }
    }

}
