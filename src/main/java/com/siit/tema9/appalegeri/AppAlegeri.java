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
        int counterVote = 0;
        int checkElectionFinish = 0;
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
        System.out.println("The list with all CNP is: ");

        for (String str : cnpList) {
            System.out.println(str);
        }
        while (strAnswer.equals("yes")) {
            if (counterVote != 10) {
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
                                ionescu.setVotes(ionescu.getVotes().add(BigDecimal.valueOf(1)));
                                System.out.println(ionescu.getVotes());
                                counterVote = counterVote + 1;
                                System.out.println("So far " + counterVote + " people voted");
                            } else if (choiceStr.equals("2")) {
                                cnpListVoted.add(cnpReader);

                                popescu.setVotes(popescu.getVotes().add(BigDecimal.valueOf(1)));
                                counterVote = counterVote + 1;
                                System.out.println("So far " + counterVote + " people voted");

                            } else if (choiceStr.equals("3")) {
                                cnpListVoted.add(cnpReader);
                                costache.setVotes(costache.getVotes().add(BigDecimal.valueOf(1)));
                                counterVote = counterVote + 1;
                                System.out.println("So far " + counterVote + " people voted");

                            } else if (choiceStr.equals("4")) {
                                cnpListVoted.add(cnpReader);
                                voicu.setVotes(voicu.getVotes().add(BigDecimal.valueOf(1)));
                                counterVote = counterVote + 1;
                                System.out.println("So far " + counterVote + " people voted");

                            } else if (choiceStr.equals("5")) {
                                cnpListVoted.add(cnpReader);
                                canceledVotes.setVotes(canceledVotes.getVotes().add(BigDecimal.valueOf(1)));
                                counterVote = counterVote + 1;
                                System.out.println("So far " + counterVote + " people voted");

                            } else {
                                System.out.println("Your choice doen't match the option");
                                System.out.println("Do you want to continue elections, please type \"yes\" if you do,\n" +
                                        "or type anything else in order to finish the elections ");
                                strAnswer = input.nextLine();
                            }
                        } else {
                            System.out.println("You already voted, you can't vote again ");
                        }
                    } else {
                        System.out.println("You are not on the list therefor you can't vote in this polling place");
                    }
                } else if (actionStr.equals("2")) {
                    System.out.println("The curent situation is");
                    checkStatus(candidats, canceledVotes, counterVote, checkElectionFinish);
                } else if (actionStr.equals("3") && counterVote > 0) {
                    checkElectionFinish = 1;
                    System.out.println("The elections are finished\n" +
                            "The final results are");
                    checkStatus(candidats, canceledVotes, counterVote, checkElectionFinish);
                    strAnswer = "No";

                } else if (actionStr.equals("3") && counterVote == 0) {
                    System.out.println("Election were abandoned as no vote was expressed.");
                    strAnswer = "No";
                }
            }//aici
            else if (counterVote == 10) {
                checkElectionFinish = 1;
                System.out.println("The elections are finished\n" +
                        "The final results are");
                checkStatus(candidats, canceledVotes, counterVote, checkElectionFinish);
                break;
            }

        }
    }


    public static void checkStatus(Set<Candidat> candidats, Candidat canceledVotes, int votes, int checkelectionsFinish) {
        if (votes > 0) {
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
            int position = 1;
            Set<Candidat> candidatArrList1 = new TreeSet<>(comparatorulMeu);
            candidatArrList1.addAll(candidats);
            List<Candidat> candidatArrList = new ArrayList<>();
            candidatArrList.addAll(candidatArrList1);
            List<Candidat> candidats1 = new ArrayList<>();
            candidats1.add(candidatArrList.get(0));
            for (int i = 1; i <= candidatArrList.size() - 1; i++) {
                if (candidatArrList.get(i).getVotes().equals(candidatArrList.get(0).getVotes())) {
                    candidats1.add(candidatArrList.get(i));
                }
            }


            System.out.println("on position 1 we have the candidate " + candidatArrList.get(0).getName() + " which has " + candidatArrList.get(0).getVotes() + " vote(s) ");


            for (int i = 1; i <= candidatArrList.size() - 1; i++) {
                if (!candidatArrList.get(i - 1).getVotes().equals(candidatArrList.get(i).getVotes())) {
                    position = i + 1;


                    System.out.println("on position " + (i + 1) + " we have the candidate " + candidatArrList.get(i).getName() + " which has " + candidatArrList.get(i).getVotes() + " vote(s) "
                    );
                } else {
                    System.out.println("on position " + (position) + " we have the candidate " + candidatArrList.get(i).getName() + " which has " + candidatArrList.get(i).getVotes() + " vote(s)"
                    );
                }

            }
            if (!canceledVotes.getVotes().equals(0)) {
                System.out.println("And " + canceledVotes.getVotes() + " vote(s) were invalidated");

            }
            if (checkelectionsFinish == 1) {
                if (candidats1.size() == 1) {
                    System.out.println("WE HAVE A WINNER\n" +
                            "Mr. " + candidats1.get(0).getName() + " won the elections");
                } else {
                    System.out.println("WE HAVE A TIE");
                    for (int j = 0; j <= candidats1.size() - 1; j++) {
                        System.out.println("Mr. " + candidats1.get(j).getName());

                    }
                    System.out.println("Will go to he second round");
                }
            }

            //candidats.forEach(candidat -> System.out.println("suntem aici" + candidat));
        } else {
            System.out.println("No vote was counted, there is no intermediate pool available");
        }


    }

}

// (candidatArrList.get(i).getVotes().divide(BigDecimal.valueOf(votes).subtract(canceledVotes.getVotes()))).multiply(BigDecimal.valueOf(100)) + " %, of available votes")
// +
//                    ((Float.parseFloat(candidatArrList.get(0).getVotes().toString())* Float.parseFloat(BigDecimal.valueOf(votes).subtract(canceledVotes.getVotes()).toString()))*10) + " %, of available votes"

