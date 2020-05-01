package com.siit.tema8.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Persoana mihai1 = new Persoana("Mihai");
        Persoana florin = new Persoana("Florin");
        Persoana mihai2 = new Persoana("Mihai");

        List<Adresa> adresaSwiming = new ArrayList<>();


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

        List<Adresa> adresaCycling = new ArrayList<>();
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
        Hobby joking = Hobby.builder()
                .hobyName("joking")
                .frequency(5)
                .build();

        hobbies.add(swiming);
        hobbies.add(cycling);
        hobbies.add(joking);

        hobbies.add(null);


        HashMap<Persoana, List<Hobby>> hobbyList = new HashMap<>();
        hobbyList.put(mihai1, hobbies.subList(0, 2));
        hobbyList.put(florin, hobbies.subList(1, 2));
        hobbyList.put(mihai2, hobbies.subList(2, 3));

        hobbyList.forEach((key, value) -> System.out.println("\n" + key.name + ": " + "\n" + value));

        System.out.println("aici" + hobbyList.remove(mihai1, hobbies.subList(0, 1)));


        /*while (iterator.hasNext()) {
            Map.Entry me = (Map.Entry) iterator.next();
            System.out.println("Key: " + me.getKey() + " & Value: " + me.getValue());
        }


         */


        hobbyList.forEach((key, value) -> System.out.println(key.name + ": " + value));

        // System.out.println(mihai);
        //System.out.println(florin);

        /*for (int i=0; i<=hobbyList.size()-1;i++){
            System.out.println(hobbyList.keySet()+ " :" + hobbies.get(i).getHobyName() +", " +hobbies.get(i).getAdresa().get(i) +", "+ hobbies.get(i).getFrequency() + " times" );
        }

         */


        //hobbyList.values().add()

    }
}
