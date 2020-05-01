package com.siit.tema8.treeset;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class Ciorna {
    public static void main(String[] args) {
        Set<Persoana> persoane = new HashSet<>();
        Persoana persoana1 = new Persoana("Popescu", 15);
        Persoana persoana2 = new Persoana("Georgescu", 17);

        persoane.add(persoana1);
        persoane.add(persoana2);

        persoane.forEach((persoana) -> {
            //System.out.println(persoana.getNume() +" "+ persoana.getVarsta());
            System.out.println(persoana);
        });

        //Comparator<Persoana> comparatorPersoane ()

        SortedSet<Persoana> sortedPersoane = new TreeSet<>();
        sortedPersoane.addAll(persoane);
        sortedPersoane.forEach((persoana) -> {
            //System.out.println(persoana.getNume() +" "+ persoana.getVarsta());
            System.out.println(persoana);
        });

    }
}


