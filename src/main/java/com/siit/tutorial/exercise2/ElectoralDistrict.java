package com.siit.tutorial.exercise2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

public enum ElectoralDistrict {

    CROYDON("CR"),
    BARKING("BA"),
    HACKNEY("HA"),
    EDMONTON("ED");

    private final String prefix;
    static final Collection<RegisteredVoter> votersList = new ArrayList<>();

    static {
        RegisteredVoter croydonVoters = new RegisteredVoter(CROYDON.prefix);
        RegisteredVoter barkingVoters = new RegisteredVoter(BARKING.prefix);
        RegisteredVoter hackneyVoters = new RegisteredVoter(HACKNEY.prefix);
        RegisteredVoter edmontonVoters = new RegisteredVoter(EDMONTON.prefix);
        votersList.add(croydonVoters);
        votersList.add(barkingVoters);
        votersList.add(hackneyVoters);
        votersList.add(edmontonVoters);
    }

    ElectoralDistrict(String prefix) {
        this.prefix = prefix;
    }

    /**
     * Complete this method to pass Exercise_2_Test#setOfVotersInDistrict()
     *
     * @param district - District to vote in
     * @param voters   - voters to filter
     * @return filtered set of registered voters in a district
     */
    public static Set<RegisteredVoter> votersIn(ElectoralDistrict district, Collection<RegisteredVoter> voters) {
        // [your code here]

        return Collections.emptySet();
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

