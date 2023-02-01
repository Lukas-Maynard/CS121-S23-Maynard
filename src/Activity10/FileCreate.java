/*
**************************************************************
                    Activity #10 - File Activity/FileCreate
                    Name: Lukas Maynard
                    Data Structures Date: Date of Submission (1/31/2023)
 ***************************************************************
    Creates the file: "fileActivityTXT.txt", detects if file already exists.
 *****************************************************************
             FileCreate::main()
        Parameters: None
       Creates file or detects if it already exists all in exception handling to detect other errors.
 ********************************************************************
*/
package src.Activity10;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {

        try {
            File myFile = new File("fileActivityTXT.txt");
            if (myFile.createNewFile()){
                System.out.println("File created");
            }else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
        }
    }
}
