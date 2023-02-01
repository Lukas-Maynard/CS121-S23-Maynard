/*
**************************************************************
                    Activity #10 - File Activity MAIN
                    Name: Lukas Maynard
                    Data Structures Date: Date of Submission (1/31/2023)
 ***************************************************************
    The hub for all other files in the package. With this you choose from all the options of
    reading, writing a header, appending, and creating a file. Uses JOptionPane for the selection, but the
    individual processes use scanner, through the terminal.
 *****************************************************************
             FileActivityMAIN::main()
        Parameters: None
       Uses JOptionPane drop down box to syphon through if-else-if statements and call the other classes.
       -- Could be made better by using either only JOptionPane or only scanner --
 ********************************************************************
*/
package src.Activity10;

import javax.swing.*;
public class FileActivityMAIN {
    public static void main(String[] args) {

        String[] fileOptions = {"Create File", "Read File", "Write file header", "Append to file","-- Close program --"};

        while(true) {
            Object selectedOption = JOptionPane.showInputDialog(null, "What would you like to do?", "Choose operation...", JOptionPane.QUESTION_MESSAGE, null, fileOptions, "Create File");

            if (selectedOption.equals("Create File")) {
                FileCreate.main(null);
            } else if (selectedOption.equals("Read File")) {
                FileRead.main(null);
            } else if (selectedOption.equals("Write file header")) {
                FileWrite.main(null);
            } else if (selectedOption.equals("Append to file")) {
                FileAppend.main(null);
            } else if (selectedOption.equals("-- Close program --")) {
                System.out.println("Program ended");
                System.exit(0);
            }
        }
    }
}

