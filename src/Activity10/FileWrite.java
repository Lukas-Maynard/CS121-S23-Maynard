package src.Activity10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileWrite {
    public static void main(String[] args) {

        String fileName = "fileActivityTXT.txt";
        System.out.println("What would you like as the header?");
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();

        try{
            FileWriter writer = new FileWriter(fileName);
            writer.write(input);
            writer.write("\n-----------------------------");
            writer.close();

            System.out.println("Your input was written to the file");
        } catch (IOException e ){
            System.out.println("There was an error");
        }

    }
}
