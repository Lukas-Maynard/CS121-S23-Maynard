/*
**************************************************************
                    Activity #2 - Book Club Points
                    Name: Lukas Maynard
                    Data Structures Date: Date of Submission (1/18/2023)
 ***************************************************************
           This will take users input through a dialog box and tell
           the user how many points they have obtained by buying books
           over the past month. Depending on the amount of bought books
           entered a different amount of points will be given.
 *****************************************************************
              BookClubPoints::main()
        Parameters: None
      Takes input through a series of if-else-if statements to validate book amount
      to give correct amount of points. Surrounded by exception handling to ensure integer input.
 ********************************************************************
*/
package src.MaynardActivity1and2;

import javax.swing.*;

public class BookClubPoints {
    public static void main(String[] args) {

        // Encased in a try-catch exception handling
        try {
            int points = 0;
            String userInput = JOptionPane.showInputDialog(null,"Enter the number of books purchased this month:");
            int bookCount = Integer.parseInt(userInput);

            // Assigns the points to the amount of books bought
            if (bookCount == 1) {
                points = 5;
            } else if (bookCount == 2) {
                points = 15;
            } else if (bookCount == 3) {
                points = 30;
            } else if (bookCount >= 4) {
                points = 60;
            }

            // Final Output
            JOptionPane.showMessageDialog(null, String.format("""
                Books Purchased: %d
                Points Earned: %s""", bookCount, points));

            System.exit(0);

        // Any wrong input displays error message and restarts program
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Invalid Input, Input integers only.");
            main(null);
        }
    }
}
