package com.siit.tema11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CMD {
    public static void main(String[] args) throws IOException {
        String path = "src\\main\\java\\com\\siit\\tema1";
        String dirName="test1";
        Scanner scanner = new Scanner(System.in);
        String comand = new String();
        //mkdir(dirName, path);
       // System.out.println(cdUp(path));
        //System.out.println(cdToSpecifiedFile(path, "frfr"));
        //displayFileContent(path+"\\calculator.java");
        while (!comand.equals("exit")){
            System.out.println(path);
            comand = scanner.nextLine();

            if (comand.equals("dir")){
                dir(path);

                }else if (comand.equals("help")) {
                help();
            }else if(comand.equals("cd..")) {
               path=cdUp(path);

            }else{
                if (comand.contains("cd ")){
                   path = cdToSpecifiedFile(path, comand.substring(comand.indexOf(" ")+1));
                }else if (comand.contains("type")){
                    displayFileContent(path +"\\"+ comand.substring(comand.indexOf(" ")+1 ));
                }else if (comand.contains("mkdir")){
                    mkdir(path,comand.substring(comand.indexOf(" ")+1));
                }else if (comand.contains("type")){
                    displayFileContent(path+"\\"+comand.substring(comand.indexOf(" ")+1));
                }else if (comand.equals("exit")){
                    System.out.println("You have successfully exit the application");
                    break;
                }
                else {
                    System.out.println("Invalid command line");
                }
            }

        }

    }
    static void displayFileContent (String path) throws IOException {
        if (new File(path).isFile()){
            List <String> fileContent= Files.readAllLines(Paths.get(path)).stream()
                    .filter(n->n.length()>0)
                    .collect(Collectors.toList());
           for (String string:fileContent){
               System.out.println(string);
           }
        }else {
            System.out.println("Invalid file name");
        }
    }

    static String cdToSpecifiedFile (String path, String file){
        String str = path+"\\"+file;
        File newFile = new File(str);
        if (newFile.isDirectory()){
            return str;
        }else{
            System.out.println("Invalid file name");
            return path;
        }
    }


    static String cdUp (String path){
        return path.substring(0,path.lastIndexOf("\\"));
    }

    static void mkdir (String path,String dirName){
        new File(path+"\\"+dirName).mkdir();

    }

    static void dir (String path){
        File[] file = (new File(path)).listFiles();
        for (File f: file){
            System.out.println(f);
        }

    }
    static void help (){
        System.out.println(
                "CMD comands :" +
                        "\ndir                   - list all files under current location" +
                        "\ncd..                  - change current folder to parent folder" +
                        "\ncd \"folder name\"    - change to the new \"folder name\" if exists" +
                        "\nmkdir \"folder name\" - create a new (child) folder with the given name" +
                        "\ntype \"file name\"    - display file content if exists (data format needed))" +
                        "\nexit                  - exit the application"

        );
    }
}
