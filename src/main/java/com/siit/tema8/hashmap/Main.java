package com.siit.tema8.hashmap;

import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {

        HashMap<Persoana, List<Hobby>> hobbyList = new HashMap<>();

        List<Adresa> adresaSwiming = new ArrayList<>();
        List<Adresa> adresaCycling = new ArrayList<>();

        Persoana mihai1 = new Persoana("Mihai");
        Persoana florin = new Persoana("Florin");
        Persoana mihai2 = new Persoana("Mihai");


        Adresa swimingPool1 = Adresa.builder()
                .country("Romania")
                .city("Bucuresti")
                .streetName("Bulevardul Iuliu Maniu")
                .streetNumber(10)
                .build();
        Adresa complexSport = Adresa.builder()
                .country("SUA")
                .city("Boston")
                .streetName("Avenue 5")
                .streetNumber(13)
                .build();

        Adresa cyclingArena = new Adresa.AdresaBuilder()
                .country("Romania")
                .city("Bucuresti")
                .streetName("Bulevardul Mihai Bravu")
                .streetNumber(25)
                .build();
        adresaSwiming.add(swimingPool1);
        adresaSwiming.add(complexSport);


        adresaCycling.add(cyclingArena);
        adresaCycling.add(complexSport);
        List<Hobby> hobbies = new ArrayList<>();
        Hobby swiming = Hobby.builder()
                .hobyName("swiming")
                .frequency(3)
                .adresa(adresaSwiming)
                .build();

        Hobby cycling = Hobby.builder()
                .hobyName("cycling")
                .frequency(2)
                .adresa(adresaCycling)
                .build();
        Hobby jogging = Hobby.builder()
                .hobyName(" jogging")
                .frequency(5)
                .build();

        hobbies.add(swiming);
        hobbies.add(cycling);
        hobbies.add(jogging);

        hobbies.add(null);


        hobbyList.put(mihai1, List.of(jogging, swiming)); //more readable
        hobbyList.put(florin, hobbies.subList(1, 2));
        hobbyList.put(mihai2, hobbies.subList(2, 3));
        hobbyList.put(mihai2, hobbies.subList(1, 2));

        hobbyList.remove(new Persoana("Mihai")); //o sa caute un obiect egal cu arg in cheile HashMap

        hobbyList.forEach((key, value) -> System.out.println(key.name + "::" + hobbyList.get(key)));

        Set<Entry<Persoana, List<Hobby>>> iteratorSet = hobbyList.entrySet();
        Iterator<Entry<Persoana, List<Hobby>>> iteratorMeu = iteratorSet.iterator();

        while (iteratorMeu.hasNext()) {
            Entry<Persoana, List<Hobby>> print = iteratorMeu.next();
            System.out.println(print.getKey() + " ::" + print.getValue());
        }


        //System.out.println("aici " + hobbyList.remove(mihai1, hobbyList.get(mihai1)));


        /*


        while (iterator.hasNext()) {
            Map.Entry me = (Map.Entry) iterator.next();
            System.out.println("Key: " + me.getKey() + " & Value: " + me.getValue());
        }


         */


        //hobbyList.forEach((key, value) -> System.out.println(key.name + ": " + value));

        // System.out.println(mihai);
        //System.out.println(florin);

        /*for (int i=0; i<=hobbyList.size()-1;i++){
            System.out.println(hobbyList.keySet()+ " :" + hobbies.get(i).getHobyName() +", " +hobbies.get(i).getAdresa().get(i) +", "+ hobbies.get(i).getFrequency() + " times" );
        }

         */


        //hobbyList.values().add()

    }
}
