/*
**************************************************************
                    Activity #2 - Test Scores
                    Name: Lukas Maynard
                    Data Structures Date: Date of Submission (1/18/2023)
 ***************************************************************
        Calculates your average grade given 3 individual grades.
        Assigns the correct letter grade given that average.
        Finally, displays all data.
 *****************************************************************
              TestScores::main()
        Parameters: None
       Displays 3 input dialog boxes using a for loop, stores inputs in an array and uses
       them to calculate average. Uses the average to determine grade within the if-else-if statements.
       All data is then output.
 ********************************************************************
*/
package src.MaynardActivity1and2;

import javax.swing.*;

public class TestScores {
    public static void main(String[] args) {
        char letterGrade = 'E';
        double[] score = new double[3];

        // Gather 3 grade inputs, assign them to the score[] array
        for(int i = 0; i < 3; i++){
            String inputScore = JOptionPane.showInputDialog(null, "Enter score "+ (i+1));
            score[i] = Double.parseDouble(inputScore);
        }

        // Calculate average
        double average = (score[0] + score[1]+ score[2]) / 3;

        // Assign the letter grade by using the average
        if (average <= 100 && average >= 90){
            letterGrade = 'A';
        } else if (average < 90 && average >= 80) {
            letterGrade = 'B';
        } else if (average < 80 && average >= 70) {
            letterGrade = 'C';
        } else if (average < 70 && average >= 60) {
            letterGrade = 'D';
        } else if (average < 60) {
            letterGrade = 'F';
        }

        // Final output
        JOptionPane.showMessageDialog(null, String.format("""
                Entered Scores: %.1f,  %.1f,  %.1f
                Average: %.2f
                Letter Grade: %c""",score[0],score[1],score[2],average,letterGrade));

        System.exit(0);
    }
}
