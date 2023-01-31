package src.Activity10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        try{
            File myFile = new File("fileActivityTXT.txt");
            Scanner console = new Scanner(myFile);
            System.out.println("Read file are the lines below:\n");

            while (console.hasNextLine()){
                String output = console.nextLine();
                System.out.println(output);
            }

            System.out.println("\nFile as been fully read ^^^^");
            console.close();
        } catch (FileNotFoundException e){
            System.out.println("An error occurred");
        }
    }
}
