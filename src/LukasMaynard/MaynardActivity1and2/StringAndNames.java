/*
**************************************************************
                    Activity #1 - Stings and Names
                    Name: Lukas Maynard
                    Data Structures Date: Date of Submission (1/17/2023)
 ***************************************************************
      Takes users name by prompting the user with 2 prompts in the terminal, first and last respectively.
      Then it will display the name in 3 different ways.
 *****************************************************************
              StringAndNames::main()
        Parameters: None
       Prompts user for their first and last name separately in the terminal.
       Final output is the input name in caps, lowercase, and in reverse.
 ********************************************************************
*/
package LukasMaynard.MaynardActivity1and2;

// import javax.swing.*;
import java.util.Scanner;

public class StringAndNames {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);



        String reverseName = "";

        // ------ User Input With Dialog boxes--- had to change to Scanner
        // firstName = JOptionPane.showInputDialog("Enter your first name:");
        // lastName = JOptionPane.showInputDialog("Enter your last name:");

        // User Input
        System.out.println("Enter your first name:");
        String firstName = console.nextLine();

        System.out.println("Enter your last name:");
        String lastName = console.nextLine();

        String fullName = firstName + " " + lastName;

        // Flips Name
        for(int i = 0; i < fullName.length(); i++){
            char charGrab = fullName.charAt(i);
            reverseName = charGrab + reverseName;
            // could use .insert() method here ^^
        }

        /* ----Final Output --  changed for Scanner
         JOptionPane.showMessageDialog(null, String.format("""
                        All Uppercase: %s
                        All Lowercase: %s
                        In Reverse: %s""", fullName.toUpperCase(), fullName.toLowerCase(),reverseName));
        */
        System.out.printf("""
                All Uppercase: %s
                All Lowercase: %s
                In Reverse: %s%n""", fullName.toUpperCase(), fullName.toLowerCase(),reverseName);

        console.close();
        System.exit(0);
    }
}
