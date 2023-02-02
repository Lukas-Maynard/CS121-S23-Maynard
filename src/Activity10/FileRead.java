/*
**************************************************************
                    Activity #10 - File Activity/FileRead
                    Name: Lukas Maynard
                    Data Structures Date: Date of Submission (2/2/2023)
 ***************************************************************
        Reads text file and prints it in terminal.
 *****************************************************************
             FileRead::main()
        Parameters: None
       Uses while loop to print file, uses exception handling to catch un-found file or other error.
 ********************************************************************
*/
package src.Activity10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        try{
            File myFile = new File("fileActivityTXT.txt");
            Scanner console = new Scanner(myFile);
            System.out.println("vvvv Read file are the lines below vvvv\n");

            while (console.hasNextLine()){
                String output = console.nextLine();
                System.out.println(output);
            }

            System.out.println("\n^^^^ File as been fully read ^^^^");
            console.close();
        } catch (FileNotFoundException e){
            System.out.println("An error occurred.\nMake sure the file is created.");
        }
    }
}
