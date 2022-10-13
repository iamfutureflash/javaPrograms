package CodeWithHarry;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class java_class_111_File_Handling {
    public static void main(String[] args) {
        //code to create a file
        /*
        File fl = new File("/home/puneet/Documents/java_file/puneet.txt");
        try {
            fl.createNewFile();
        }
        catch (IOException e) {
            System.out.println(e + " Unable to create this file " + e.fillInStackTrace());
        }
        */
        //code to write a file
        /*
            File fl = new File("/home/puneet/Documents/java_file/puneet.txt");
            try {
                fl.createNewFile();
                FileWriter fileWriter = new FileWriter("puneet.txt");
                fileWriter.write("hi my name is puneet\nmy age is 22\nok bye");
                fileWriter.close();
            } catch (IOException e) {
                System.out.println(e + " Unable to create this file " + e.fillInStackTrace());
            }
            */
        //Reading a file
        /*
        * File myFile = new File("puneet.txt");
        try{
            Scanner scan = new Scanner(myFile);
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
            scan.close();
        }
        catch(FileNotFoundException e){
        e.printStackTrace();
        }
        * */
        //Deleting a file
        File myFile = new File("puneet.txt");
        if(myFile.delete()){
            System.out.println("i have deleted: " + myFile.getName());
        }
        else{
            System.out.println("some problem occures while deleting the file");
        }
        }
    }
