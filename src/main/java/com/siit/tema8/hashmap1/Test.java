package com.siit.tema8.hashmap1;

import java.util.*;

public class Test {

 public static void main(String[] args) {
  Map<Persoana, List<Hobby>> hobies = new HashMap<>(); //Map

  List<Adresa> adresaCycling = new ArrayList<>();
  List<Adresa> adresaswiming = new ArrayList<>();
  List<Adresa> adresaJogging = new ArrayList<>();

  List<Hobby> swimingList = new ArrayList<>();
  List<Hobby> cyclingList = new ArrayList<>();
  List<Hobby> joggingList = new ArrayList<>();


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
  hobies.putIfAbsent(mihai1, joggingList);


  //hobies.put(new Persoana("Valentin"), List.of(new Hobby("skating",2,adresaCycling )));
  hobies.put(new Persoana("Valentin"), List.of(new Hobby("skating", 2, List.of(new Adresa("Egipt")))));
  hobies.forEach((key, value) -> System.out.println(key.getName() + "::" + hobies.get(key)));
  System.out.println("===BREAK===");
  hobies.remove(new Persoana("Calin"));


  hobies.forEach((key, value) -> System.out.println(key.getName() + "::" + hobies.get(key)));
  //hobies.remove(List.of(swiming));
  //System.out.println("===BREAK===");
  //hobies.forEach((key, value) -> System.out.println(key.getName() + "::" + hobies.get(key)));
  Set<Map.Entry<Persoana, List<Hobby>>> iteratorSet = hobies.entrySet();
  Iterator<Map.Entry<Persoana, List<Hobby>>> myIterator = iteratorSet.iterator();
  while (myIterator.hasNext()) {
   Map.Entry<Persoana, List<Hobby>> print = myIterator.next();
   System.out.println(print.getKey() + " :::: " + print.getValue());
  }
/*  System.out.println("===BREAK=== 2 ===");

  while (myIterator.hasNext()){
   if (hobies.containsValue(swimingList)){
    hobies.remove( new List<Hobby>());
   }


  }*/
  hobies.forEach((key, value) -> System.out.println(key.getName() + "::" + hobies.get(key)));

 }
}
