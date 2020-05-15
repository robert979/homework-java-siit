package com.siit.tutorial.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class representing voting rules in an election
 */
public class VotingRules {
    static {
        Person person1 = new Person("Jhon", 18);
    }

    /**
     * Complete this for Exercise_2_Test#getAllPersonsEligibleToVote
     *
     * @param potentialVoters  - voters to filter
     * @param legalAgeOfVoting - age where it's legal to vote
     * @return a list of eligible voters
     */
    public static List<Person> eligibleVoters(List<Person> potentialVoters, int legalAgeOfVoting) {
        List<Person> listLegalvoters = potentialVoters.stream()
                .filter(n -> n.getAge() >= legalAgeOfVoting)
                .collect(Collectors.toCollection(ArrayList::new));
        // [your code here]

        return listLegalvoters;
    }
}
