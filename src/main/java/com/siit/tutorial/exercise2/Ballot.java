package com.siit.tutorial.exercise2;

public final class Ballot {

    private final boolean isSpoiled;
    private final Party party;

    private Ballot(Party party) {
        this.party = party;
        this.isSpoiled = party == null;
    }

    static {
        Ballot ballot1 = new Ballot(Party.GREEN_PARTY);
        Ballot ballot2 = new Ballot(Party.MONSTER_RAVING_LOONY_PARTY);
        Ballot ballot3 = new Ballot(null);
        ElectoralDistrict.ballotList.add(ballot1);
        ElectoralDistrict.ballotList.add(ballot2);
        ElectoralDistrict.ballotList.add(ballot3);

    }


    /**
     * Vote for a particular party on a Ballot
     *
     * @param party - party to vote for
     * @return The Ballot containing the party
     */
    public static Ballot voteFor(Party party) {
        return new Ballot(party);
    }

    @Override
    public String toString() {
        return "Ballot{" +
                "isSpoiled=" + isSpoiled +
                ", party=" + party +
                '}';
    }

    /**
     * Indicate a spoiled Ballot (one that has no Party)
     *
     * @return A spoiled Ballot
     */
    public static Ballot spoiled() {
        return new Ballot(null);
    }

    public boolean isSpoiled() {
        return isSpoiled;
    }

    public Party getParty() {
        return party;
    }
}
