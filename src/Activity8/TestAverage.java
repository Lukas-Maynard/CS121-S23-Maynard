/*
**************************************************************
                    Activity #8 - Test Average
                    Name: Lukas Maynard
                    Data Structures Date: Date of Submission (1/27/2023)
 ***************************************************************
        Amount of students and tests per student is input then data is requested. Average is output.
 *****************************************************************
             TestAverage::main()
        Parameters: None
       Large amount of inputs created in nested loops. Other basic calculations.
 ********************************************************************
*/
package src.Activity8;

import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {

        int total = 0;

        Scanner console = new Scanner(System.in);
        System.out.println("Enter number of students:");
        String input = console.nextLine();
        int studentNum = Integer.parseInt(input);

        System.out.println("Enter number of tests per student:");
        String input2 = console.nextLine();
        int testsNum = Integer.parseInt(input2);

        for (int i=1;i < studentNum; i++){
            for (int j=1; j < testsNum; j++){
                System.out.println("Enter score "+(j)+":");
                String testScores = console.nextLine();
                total += Double.parseDouble(testScores);
            }

            int average = total/testsNum;
            System.out.println("The average for student "+(i)+": "+ average);
            total = 0;
        }

        console.close();
        System.exit(0);
    }
}
