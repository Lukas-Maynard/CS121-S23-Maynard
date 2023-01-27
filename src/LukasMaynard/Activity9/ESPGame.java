/*
**************************************************************
                    Activity #9 - ESP Game
                    Name: Lukas Maynard
                    Data Structures Date: Date of Submission (1/27/2023)
 ***************************************************************
    Guess between 5 colors to try and match the computer. 10 guesses before result screen.
 *****************************************************************
             ESPGame::main()
        Parameters: None
       Randomly picks a color and tests if user guessed correctly. Repeats 10 times and display results.
 ********************************************************************
*/
package LukasMaynard.Activity9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ESPGame {
    public static void main(String[] args) {

        String[] colors = {"red","green","blue","orange","yellow"};
        Random rand = new Random();
        Scanner console = new Scanner(System.in);
        int correctGuess = 0;

        System.out.println("Here's the color options:\n"+ Arrays.toString(colors));

        for (int i=1; i<11; i++){
            int computerNumber = rand.nextInt(0,4);

            System.out.println(i+". What color has the computer chosen?");
            String userInput = console.nextLine();

            System.out.println("> The computer chose "+colors[computerNumber]);

            if (userInput.equalsIgnoreCase(colors[computerNumber])){
                correctGuess++;
            }
        }
        System.out.printf("You got %d out of 10 correct!",correctGuess);
    }
}
