package com.siit.tema9.appalegeri;

import lombok.ToString;

import java.math.BigDecimal;

@ToString


public class Candidat {
    private String name;
    private BigDecimal votes;

    public Candidat(String name, BigDecimal votes) {
        this.name = name;
        this.votes = votes;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getVotes() {
        return votes;
    }

    public void setVotes(BigDecimal votes) {
        this.votes = votes;
    }
    /*Comparator<Candidat> comparatorulMeu = new Comparator<Candidat>() {
        @Override
        public int compare(Candidat o1, Candidat o2) {
            int i=0;
            if (Integer.parseInt(o1.getVotes().toString())>Integer.parseInt(o2.getVotes().toString())){
                i=1;
            }else if (Integer.parseInt(o1.getVotes().toString())<Integer.parseInt(o2.getVotes().toString())){
                i=-1;
            }else {
               i = o1.getName().compareTo(o2.getName());
            }
            return i;
        }
    };

     */


}
