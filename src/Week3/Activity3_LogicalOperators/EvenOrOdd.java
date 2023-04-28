/*
**************************************************************
                    Activity #3 - Even Or Odd
                    Name: Lukas Maynard
                    Data Structures Date: Date of Submission (1/23/2023)
 ***************************************************************
        User inserts integer to determine if its odd or even
 *****************************************************************
             EvenOrOdd::main()
        Parameters: None
       Tests users input with a modulus operator to determine if it is even or odd.
 ********************************************************************
*/
package src.Week3.Activity3_LogicalOperators;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Enter a whole number: ");

        int input = console.nextInt();
        String EvenOrOdd;


        if (input%2 == 0){
            EvenOrOdd = "EVEN";
        } else {
            EvenOrOdd = "ODD";
        }

        System.out.printf("Your input: %d is %s",input,EvenOrOdd);

        console.close();
        System.exit(0);
    }
}
