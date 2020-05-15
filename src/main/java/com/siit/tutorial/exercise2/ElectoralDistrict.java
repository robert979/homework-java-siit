package com.siit.tutorial.exercise2;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;


public enum ElectoralDistrict {

    CROYDON("CR"),
    BARKING("BA"),
    HACKNEY("HA"),
    EDMONTON("ED");

    private final String prefix;


    static final Collection<RegisteredVoter> votersList = new ArrayList<>();
    static final Set<Ballot> ballotList = new HashSet<>();
    static final List<RegisteredVoter> allVoters = new ArrayList<>(asList(
            new RegisteredVoter("CR2345"),
            new RegisteredVoter("HA7654"),
            new RegisteredVoter("HA2213"),
            new RegisteredVoter("BA9987"),
            new RegisteredVoter("CR6203"),
            new RegisteredVoter("ED9876")
            // ... and many more
    ));

    static {

    }

    static {
        RegisteredVoter croydonVoters = new RegisteredVoter(CROYDON.prefix);

        RegisteredVoter barkingVoters = new RegisteredVoter(BARKING.prefix);
        RegisteredVoter hackneyVoters = new RegisteredVoter(HACKNEY.prefix);
        RegisteredVoter edmontonVoters = new RegisteredVoter(EDMONTON.prefix);
        votersList.add(croydonVoters);
        votersList.add(barkingVoters);
        votersList.add(hackneyVoters);
        votersList.add(edmontonVoters);

        Person person1 = new Person("Jhon", 15);
        Person person2 = new Person("Axel", 19);

        RegisteredVoter registeredVoter1 = new RegisteredVoter(CROYDON.getPrefix());

    }

    ElectoralDistrict(String prefix) {
        this.prefix = prefix;
    }

    public static void main(String[] args) {
        for (RegisteredVoter s : votersIn(HACKNEY, allVoters)) {
            System.out.println(s.getElectorId());
        }
        System.out.println(votersIn(HACKNEY, allVoters).size());
    }

    /**
     * Complete this method to pass Exercise_2_Test#setOfVotersInDistrict()
     *
     * @param district - District to vote in
     * @param voters   - voters to filter
     * @return filtered set of registered voters in a district
     */
    public static Set<RegisteredVoter> votersIn(ElectoralDistrict district, Collection<RegisteredVoter> voters) {
        HashSet<RegisteredVoter> votersList = voters.stream()
                .filter(n -> n.getElectorId().substring(0, 2).equals(district.getPrefix()))

                .collect(Collectors.toCollection(HashSet::new));
        // [your code here]

        return votersList;
    }

    /**
     * Complete this method to pass Exercise_2_Test#removeAllSpoiledBallots()
     *
     * @param ballots - ballots to filter
     * @return filtered set of unspoiled ballots
     */
    public static Set<Ballot> unspoiledBallots(Set<Ballot> ballots) {
        // [your code here]

        return Collections.emptySet();
    }

    public String getPrefix() {
        return prefix;
    }
}

