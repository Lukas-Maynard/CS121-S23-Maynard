/*
**************************************************************
                    Activity #10 - File Activity/FileWrite
                    Name: Lukas Maynard
                    Data Structures Date: Date of Submission (1/31/2023)
 ***************************************************************
    Creates the header of the "fileActivityTXT.txt" file. Will overwrite anything in the file.
 *****************************************************************
             FileWrite::main()
        Parameters: None
       Writes the first 2 lines of text file with user input, uses exception handling
 ********************************************************************
*/
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
            System.out.println("There was an error, make sure the file exists.");
        }

    }
}
