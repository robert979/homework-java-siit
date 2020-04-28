package com.siit.tema8;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Comparator<Persoana> comparatorNume = new Comparator<Persoana>() {
            @Override
            public int compare(Persoana o1, Persoana o2) {
                int i = o1.getNume().compareTo(o2.getNume());
                if (i == 0) {
                    if (o1.getVarsta() == o2.getVarsta()) {
                        return 0;
                    } else if (o1.getVarsta() > o2.getVarsta()) {
                        return 1;
                    } else {
                        return -1;
                    }

                }

                return i;
            }
        };

        TreeSet<Persoana> persons = new TreeSet<>(comparatorNume);
        Persoana persoana1 = new Persoana("Popescu", 15);
        Persoana persoana2 = new Persoana("Georgescu", 17);
        Persoana persoana3 = new Persoana("Popescu", 12);

        persons.add(persoana1);
        persons.add(persoana2);
        persons.add(persoana3);

        persons.forEach((persoana) -> {
            //System.out.println(persoana.getNume() +" "+ persoana.getVarsta());
            System.out.println(persoana);
        });


    }
}
