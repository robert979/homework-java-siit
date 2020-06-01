package com.siit.tema11;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class IOHomework {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {

     //displayFolderContent();
       //displayFolderContentWithlinkAsString("src/main/java/com/siit/tema9");
//dislayFilesByExtension("src\\main\\java\\com\\siit\\tema1","java");
//checkIfFileOrDirectory("src\\main\\java\\com\\siit\\tema1\\maxdigit.java");
//checkWrittingPermission("src\\main\\java\\com\\siit\\tema1\\maxdigit.java");
//checkWrittingPermission("E:\\repartitoare\\Aprilie _2020.pdf");
       // System.out.println(checkLastModificationDate("E:\\repartitoare\\Aprilie _2020.pdf"));
       // System.out.println(checkFileSize("E:\\repartitoare\\Aprilie _2020.pdf") + " bytes");
        //System.out.println(checkFileSize("E:\\repartitoare\\Aprilie _2020.pdf")/1024 + " kB");
       //System.out.println(((checkFileSize("E:\\repartitoare\\Aprilie _2020.pdf")/1024)/1024) + " MB");

//deleteFolder(("E:\\new\\gol\\altgol"));
        //createNewDir("E:\\new\\gol\\altgol");
        String pathFile ="E:\\SQL\\mysql-server\\mysql-5.5.62-winx64\\readme" ;
        File fileToBeSaved = new File("C:\\Users\\Scarlat\\Desktop\\home_work\\src\\test_txt\\savedFileFromComsole.txt");
        String txtToBeAdded= "This is the added text on the same line";
        String txtOnTheNextLine = "This txt will be added on the next line";
        //writeTxtFromJavaConsole(fileToBeSaved);
        //appendText(txtToBeAdded, fileToBeSaved);
        //appendTxtOnNextLine(txtOnTheNextLine, fileToBeSaved);
       // System.out.println("text to string: \n"+convertFileToString(pathFile));
        appendTxtOnNextLine("This will be a new line", fileToBeSaved);


    }
    static String convertFileToString (String path) throws IOException {
        Path fileToBeRead = Paths.get(path);
        String fileCollected = Files.readString(fileToBeRead);

        return fileCollected;

    }

    static void appendTxtOnNextLine (String txtTobeAdded, File file) {
        try {
            System.out.println("Original text : \n"+Files.readString(Paths.get(file.getPath())));
            BufferedWriter newText = new BufferedWriter(new FileWriter(file, true));
            newText.newLine();
            newText.append(txtTobeAdded);
            newText.close();
            System.out.println("Modified text :\n" + Files.readString(Paths.get(file.getPath())));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static void appendText (String txtToBeAdded, File file) throws IOException {
        BufferedWriter newText = new BufferedWriter(new FileWriter(file,true));
        newText.append(" ");
        newText.append(txtToBeAdded);
        newText.flush();


    }
    static String writeTxtFromJavaConsole(File file) throws IOException {
        System.out.println("Please insert the txt you want to save");
        String str = scanner.nextLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(str);

        writer.close();

        return str;}
    static void deleteFolder (String path){
        try {
            Files.delete(new File (path).toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static void createNewDir (String path) throws IOException {
        new File(path).mkdir();

    }
    static double checkFileSize (String path) throws IOException {
        return (new File(path)).length();


    }
    static FileTime checkLastModificationDate (String path) throws IOException {
       return Files.getLastModifiedTime((new File(path).toPath()));
    }

    static void checkWrittingPermission (String path){
        if (checkIfFile(path)){
           if ((new File(path)).canWrite()){
               System.out.println("The file is not write/read protected "  );
           }else if ((new File(path)).canRead()){
               System.out.println("The file is write protected but it can be read/opened");
           }else {
               System.out.println("The file is write/read protected ");
           }
        }
    }
    static boolean checkIfFile (String path){
        File checkedFile = new File(path);
        if (checkedFile.exists()&& checkedFile.isFile()){
            return true;
        }else {
            return false;
        }

    }
    static void checkIfFileOrDirectory (String path){
        File pathToBeChecked = new File(path);


        if (pathToBeChecked.exists()){
            if (!pathToBeChecked.isDirectory()){
                System.out.println("The path is a file \"" + pathToBeChecked.getName()+"\"");


            }else{
                System.out.println("The path is a directory");
            }
        }else{
            System.out.println("Invalid path address ");
        }
    }
    static List<String> dislayFilesByExtension(String path, String extension){
        if ((new File(path).exists())){
        List<String> str= Arrays.asList((new File(path)).list()).stream()
        .filter(n->n.substring(n.indexOf(".")+1).equals(extension) )
                .collect(Collectors.toList());
        if (str.size()!=0){
            System.out.println(str);
            return str;
        }else{
            System.out.println("There is no file with the extension *." + extension + " on the specified path");
            return null;

        }}
        else {
            System.out.println("The path \"" + path+"\" you gave, doesn't exist");
            return null;
        }
    }
    static void displayFolderContent (){

            File file = new File("E:");
            String[] fileList = file.list();

            if(file.exists()){
            for(String name:fileList){
                System.out.println(name);}
                System.out.println(file.getAbsoluteFile());

            }else {
                System.out.println("Invalid path");

            }

    }
    static void displayFolderContentWithlinkAsString (String str){

        File file = new File(str);
        if(file.exists()){
        String[]  folderContent = file.list();
        System.out.println(Arrays.toString(folderContent));
        }else {
            System.out.println("Invalid path");
        }

        }
    }

