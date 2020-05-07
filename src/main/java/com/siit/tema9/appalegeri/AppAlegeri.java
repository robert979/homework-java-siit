package com.siit.tema9.appalegeri;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

//list with all CNP
//1800306040735
//1800306040736
//1800306040737
//1800306040738
//1800306040739
//1800306040739
//1800306040740
//1800306040741
//1800306040742
//1800306040743
public class AppAlegeri {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Path path = Paths.get("CNP_List.txt");
        String allInformation = Files.readString(path, StandardCharsets.US_ASCII);
        //System.out.println(allInformation);
        List<String> cnpList = new ArrayList<>();
        List<String> cnpListVoted = new ArrayList<>();
        List<String> cnpListNonvoted = cnpList;
        int counterVote = 0;
        Comparator<Candidat> comparatorulMeu = new Comparator<Candidat>() {
            @Override
            public int compare(Candidat o1, Candidat o2) {
                int i = 0;
                if (Integer.parseInt(o1.getVotes().toString()) > Integer.parseInt(o2.getVotes().toString())) {
                    i = -1;
                } else if (Integer.parseInt(o1.getVotes().toString()) < Integer.parseInt(o2.getVotes().toString())) {
                    i = 1;
                } else {
                    i = o1.getName().compareTo(o2.getName());
                }
                return i;
            }
        };

        Candidat ionescu = new Candidat("Ionescu", BigDecimal.valueOf(0));
        Candidat popescu = new Candidat("Popescu", BigDecimal.valueOf(0));
        Candidat costache = new Candidat("Costache", BigDecimal.valueOf(0));
        Candidat voicu = new Candidat("Voicu", BigDecimal.valueOf(0));
        Candidat canceledVotes = new Candidat("Canceled", BigDecimal.valueOf(0));
        TreeSet<Candidat> candidats = new TreeSet<>(comparatorulMeu);
        candidats.add(ionescu);
        candidats.add(popescu);
        candidats.add(costache);
        candidats.add(voicu);


        //candidats.forEach(candidat -> System.out.println("suntem aici" + candidat.getName()));
        // for (Object candidat : candidats) {
        //     System.out.println("a doua incercare" + candidat);
        // }

        String strAnswer = "yes";
        for (int i = 0; i <= allInformation.length() - 22; i++) {
            if (allInformation.substring(i, i + 3).equals("CNP")) {
                String strTemp = allInformation.substring(i + 5, i + 18);
                cnpList.add(strTemp);
            }

        }
        System.out.println("The ist with all CNP is: ");

        for (String str : cnpListNonvoted) {
            System.out.println(str);
        }
        while (strAnswer.equals("yes") && counterVote != 10) {
            System.out.println("Please chose your action:\n" +
                    "1) Vote\n" +
                    "2) Check intermediate pool\n" +
                    "3) End vote.");
            String actionStr = input.nextLine();
            if (actionStr.equals("1")) {
                System.out.println("Please insert your CNP");
                String cnpReader = input.nextLine();
                if (cnpList.contains(cnpReader)) {
                    if (!cnpListVoted.contains(cnpReader)) {
                        System.out.println();
                        System.out.println("Please vote by typing the digit corresponding to the chosen candidate, from the list :\n" +
                                "1) Ionescu\n" +
                                "2) Popescu\n" +
                                "3) Costache\n" +
                                "4) Voicu\n" +
                                "5) Vote for no one");
                        String choiceStr = input.nextLine();
                        if (choiceStr.equals("1")) {
                            cnpListVoted.add(cnpReader);
                            cnpListNonvoted.remove(cnpReader);
                            ionescu.setVotes(ionescu.getVotes().add(BigDecimal.valueOf(1)));
                            System.out.println(ionescu.getVotes());
                            counterVote = counterVote + 1;
                            System.out.println("So far " + counterVote + " people voted");
                        } else if (choiceStr.equals("2")) {
                            cnpListVoted.add(cnpReader);
                            cnpListNonvoted.remove(cnpReader);
                            popescu.setVotes(popescu.getVotes().add(BigDecimal.valueOf(1)));
                            counterVote = counterVote + 1;
                            System.out.println("So far " + counterVote + " people voted");

                        } else if (choiceStr.equals("3")) {
                            cnpListVoted.add(cnpReader);
                            cnpListNonvoted.remove(cnpReader);
                            costache.setVotes(costache.getVotes().add(BigDecimal.valueOf(1)));
                            counterVote = counterVote + 1;
                            System.out.println("So far " + counterVote + " people voted");

                        } else if (choiceStr.equals("4")) {
                            cnpListVoted.add(cnpReader);
                            cnpListNonvoted.remove(cnpReader);
                            voicu.setVotes(voicu.getVotes().add(BigDecimal.valueOf(1)));
                            counterVote = counterVote + 1;
                            System.out.println("So far " + counterVote + " people voted");

                        } else if (choiceStr.equals("5")) {
                            cnpListVoted.add(cnpReader);
                            cnpListNonvoted.remove(cnpReader);
                            canceledVotes.setVotes(canceledVotes.getVotes().add(BigDecimal.valueOf(1)));
                            counterVote = counterVote + 1;
                            System.out.println("So far " + counterVote + " people voted");

                        } else {
                            System.out.println("Your choice doen't match the option");
                            System.out.println("Do you want to continue elections, please type \"yes\" if you do,\n" +
                                    "or type anything else in order to finish the elections ");
                            strAnswer = input.nextLine();
                        }
                    }
                }
            } else if (actionStr.equals("2")) {
                checkStatus(candidats);
            }

        }
    }

    public static void checkStatus(Set<Candidat> candidats) {
        Comparator<Candidat> comparatorulMeu = new Comparator<Candidat>() {
            //Comparator<Candidat> comparatorulMeu = (o1, o2) ->
            @Override
            public int compare(Candidat o1, Candidat o2) {
                int i = 0;
                if (Integer.parseInt(o1.getVotes().toString()) > Integer.parseInt(o2.getVotes().toString())) {
                    i = -1;
                } else if (Integer.parseInt(o1.getVotes().toString()) < Integer.parseInt(o2.getVotes().toString())) {
                    i = 1;
                } else {
                    i = o1.getName().compareTo(o2.getName());
                }
                return i;
            }
        };
        Set<Candidat> candidatArrList1 = new TreeSet<>(comparatorulMeu);
        candidatArrList1.addAll(candidats);
        List<Candidat> candidatArrList = new ArrayList<>();
        candidatArrList.addAll(candidatArrList1);

        for (int i = 0; i <= candidatArrList.size() - 1; i++) {

            System.out.println("on position " + (i + 1) + " we have the candidate " + candidatArrList.get(i).getName() + " which has " + candidatArrList.get(i).getVotes() + " votes");
        }
        //candidats.forEach(candidat -> System.out.println("suntem aici" + candidat));


    }

}

