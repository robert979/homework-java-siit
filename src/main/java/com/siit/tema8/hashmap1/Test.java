package com.siit.tema8.hashmap1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

 public static void main(String[] args) {
  Map<Persoana, List<Hobby>> hobies = new HashMap<>();

  ArrayList<Adresa> adresaCycling = new ArrayList<>();
  ArrayList<Adresa> adresaswiming = new ArrayList<>();
  ArrayList<Adresa> adresaJogging = new ArrayList<>();

  List<Hobby> swimingList = new ArrayList<>();
  ArrayList<Hobby> cyclingList = new ArrayList<>();
  ArrayList<Hobby> joggingList = new ArrayList<>();


  Adresa romania = new Adresa("Romania");
  Adresa germania = new Adresa("Germania");
  Adresa spania = new Adresa("Spania");
  Adresa franta = new Adresa("Franta");
  Adresa italia = new Adresa("Italia");

  adresaCycling.add(romania);
  adresaCycling.add(germania);
  adresaCycling.add(spania);
  adresaJogging.add(germania);
  adresaJogging.add(franta);
  adresaJogging.add(romania);
  adresaswiming.add(spania);
  adresaswiming.add(italia);

  Hobby swiming = new Hobby("swiming", 3, adresaswiming);
  Hobby cycling = new Hobby("cycling", 2, adresaCycling);
  Hobby jogging = new Hobby("jogging", 4, adresaJogging);

  swimingList.add(swiming);
  cyclingList.add(cycling);
  joggingList.add(jogging);

  Persoana mihai = new Persoana("Mihai");
  Persoana florin = new Persoana("Florin");
  Persoana calin = new Persoana("Calin");
  Persoana mihai1 = new Persoana("Mihai");

  hobies.put(mihai, swimingList);
  hobies.put(florin, List.of(swiming, cycling));
  hobies.put(calin, List.of(jogging));
  hobies.put(mihai1, joggingList);

  hobies.forEach((key, value) -> System.out.println(key.getName() + "::" + hobies.get(key)));

// Hobby("fising", 1, adresaCycling));

 }
}
