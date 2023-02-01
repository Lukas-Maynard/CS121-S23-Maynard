/*
**************************************************************
                    Activity #10 - File Activity/FileAppend
                    Name: Lukas Maynard
                    Data Structures Date: Date of Submission (1/31/2023)
 ***************************************************************
        Appends to the end of the file preserving the header. Add as many lines as needed.
        Then end the program by not typing anything and pressing enter.
 *****************************************************************
             FileAppend::main()
        Parameters: None
       Input is in a while loop that checks if input is empty if so it stops the loop.
 ********************************************************************
*/
package src.Activity10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class FileAppend {
    public static void main(String[] args) {

        String fileName = "fileActivityTXT.txt";
        Scanner console = new Scanner(System.in);

        System.out.println("What would you like to add to the file? -- Enter nothing to end");
        String input = console.nextLine();

        try {
            FileWriter fileWrite = new FileWriter(fileName,true);
            BufferedWriter buffWriter = new BufferedWriter(fileWrite);

            while (!Objects.equals(input, "")){
                buffWriter.newLine();
                buffWriter.write(input);
                System.out.println("-- Next line --");
                input = console.nextLine();
            }

            System.out.println("All lines added to text file");
            buffWriter.close();
            fileWrite.close();

        } catch (IOException e){
            System.out.println("There was an error");
        }
    }
}
