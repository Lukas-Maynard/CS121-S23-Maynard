/*
**************************************************************
                    Activity #7 - Guessing Game
                    Name: Lukas Maynard
                    Data Structures Date: Date of Submission (1/27/2023)
 ***************************************************************
         User guesses a number from 1 to 100 until correct or quit.
 *****************************************************************
             GuessingGame::main()
        Parameters: None
       Sets random number from 1 to 100 and test user input if correct. If input is a letter quit.
 ********************************************************************
*/
package LukasMaynard.Activity7;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner console = new Scanner(System.in);

        int number = rand.nextInt(1,101);
        String input;
        int guessCount=0, guess=0;

        System.out.println("Guess a number between 1 and 100. Enter a letter to exit.");

            while (guess < 101 && guess >= 0) {

                input = console.nextLine();

                try{
                    guess = Integer.parseInt(input);
                }catch (NumberFormatException e){
                    System.out.println("Quitter! The number was "+number);
                    break;
                }

                guessCount += 1;

                if (guess == number) {
                    System.out.println("Correct!\nNumber of guesses: " + guessCount);
                    break;
                } else if (guess < number) {
                    System.out.println("Too low guess again");
                } else {
                    System.out.println("Too high guess again");
                }
            }
            console.close();
            System.exit(0);
    }
}
