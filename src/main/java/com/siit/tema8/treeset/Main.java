package com.siit.tema8.treeset;

import java.util.ArrayList;
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
        Comparator<Persoana> comparatorVarsta = new Comparator<Persoana>() {
            @Override
            public int compare(Persoana o1, Persoana o2) {
                int i;
                if (o1.getVarsta() > o2.getVarsta()) {
                    i = 1;
                } else if (o1.getVarsta() < o2.getVarsta()) {
                    i = -1;
                } else {
                    i = (o1.getNume().compareTo(o2.getNume()));
                }
                return i;
            }
        };

        ArrayList<Persoana> personsArr = new ArrayList<>();

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

        for (Object o : persons) {
            System.out.println("aici" + o.hashCode());
        }

        //persons.remove(persons.hashCode()==59559151);

        persons.forEach((persoana) -> {
            //System.out.println(persoana.getNume() +" "+ persoana.getVarsta());
            System.out.println(persoana);
        });
        personsArr.addAll(persons);

        for (Object arr : personsArr) {
            System.out.println("aici" + arr);

        }

        //personsArr.remove(0);
        //for (Object arr:personsArr){

        //  System.out.println("aici 2 " + arr);}


        persons.removeAll(persons);
        persons.addAll(personsArr);
        persons.forEach((persoana) -> {
            //System.out.println(persoana.getNume() +" "+ persoana.getVarsta());
            System.out.println("aici 3 " + persoana);
        });


    }


}
