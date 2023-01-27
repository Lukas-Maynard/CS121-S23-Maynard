/*
**************************************************************
                    Activity #8 - Average Rainfall
                    Name: Lukas Maynard
                    Data Structures Date: Date of Submission (1/27/2023)
 ***************************************************************
        User inputs amount of years then the amount of rainfall for every month. Average is output.
 *****************************************************************
             AverageRainfall::main()
        Parameters: None
       Large amount of inputs created in nested loops. Other basic calculations.
 ********************************************************************
*/
package LukasMaynard.Activity8;

import java.util.Scanner;

public class AverageRainfall {
    public static void main(String[] args) {

        int total = 0;

        Scanner console = new Scanner(System.in);
        System.out.println("Enter number of years:");
        String input = console.nextLine();
        int yearAmount = Integer.parseInt(input);

        for (int yearI=1; yearI < yearAmount+1; yearI++){
            for (int monthI=1; monthI < 13; monthI++){
                System.out.println("Enter inches of rainfall for year "+yearI+" month "+monthI+":");
                String testScores = console.nextLine();
                total += Double.parseDouble(testScores);
            }
        }

        int average = total/(yearAmount*12);
        System.out.printf("""
                Number of months: %d
                Total inches of rainfall: %d
                The average rainfall per month over %d years: %d""",yearAmount*12,total,yearAmount,average);


        console.close();
        System.exit(0);
    }
}
