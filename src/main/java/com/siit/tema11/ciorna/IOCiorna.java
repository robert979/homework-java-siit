package com.siit.tema11.ciorna;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IOCiorna {
    public static void main(String[] args) {
        String path = "src\\main\\java\\com\\siit\\tema1";
        String comand = "cd tema1";
        String commandDir = "mkdir newDir";
        String extractFromCommand = comand.substring(comand.indexOf(" ")+1);
        String dirName = commandDir.substring(commandDir.indexOf(" ")+1);
        //String comandFile = "type cal"
        //System.out.println(extractFromCommand);
        //System.out.println(cdToSpecifiedFile(path,extractFromCommand));
        //mkdir(dirName, path);

        sort(dir(path));

    }
   static void sort (File[] file){
        List<String> listFiles = new ArrayList<>();
        for (File f: file){
            listFiles.add(f.getName());
        }
        listFiles.sort(null);
        for (String s:listFiles){
            System.out.println(s);
        }

    }
    static File [] dir (String path){
        File[] file = (new File(path)).listFiles();
        for (File f: file){
            System.out.println(f);

        }
        return file;
    }
    static void mkdir (String dirName,String path){
        new File(path+"\\"+dirName).mkdir();

    }
    static String cdToSpecifiedFile (String path, String file){
        String str = path + "\\"+file;
        File newfile = new File(path+"\\"+file);
        if (newfile.isDirectory()){

            return str;

        }else{
            System.out.println("Invalid file name");
            System.out.println(str);
            return path;
        }
    }
    static void displayFileContent (String path) throws IOException {
        if (new File(path).isFile()){
            List<String> fileContent= Files.readAllLines(Paths.get(path)).stream()
                    .filter(n->n.length()>0)
                    .collect(Collectors.toList());
            for (String string:fileContent){
                System.out.println(string);
            }
        }else {
            System.out.println("Invalid file name");
        }
    }
}
