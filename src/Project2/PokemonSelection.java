/*
**************************************************************
            Project #2 - Pokemon Class
            Name: Lukas Maynard
            Data Structures Date: Date of Submission (3/30/2023)
 *************************************************************
            PokemonSelection::createPokemon()
        Takes user input by using scanner, assigns to Pokemon object
        Uses Pokemon class

            PokemonSelection::assignPokemon()
        Loop to enter and display data
*************************************************************
*/
package src.Project2;

import java.util.Scanner;

public class PokemonSelection {
    Scanner console = new Scanner(System.in);
    private final Object[] storage = new Object[2];

    public Object createPokemon(){
        Pokemon newPokemon = new Pokemon();
        System.out.println("Enter pokemon name:");
        newPokemon.setName(console.nextLine());
        System.out.println("Enter pokemon HP:");
        newPokemon.setHitPoints(Double.parseDouble(console.nextLine()));
        System.out.println("Enter pokemon move:");
        newPokemon.setMove(console.nextLine());
        System.out.println("Enter pokemon move power:");
        newPokemon.setMovePower(Double.parseDouble(console.nextLine()));
        System.out.println("Enter pokemon attack speed:");
        newPokemon.setAttackSpeed(Double.parseDouble(console.nextLine()));

        return newPokemon;
    }

    public void assignPokemon(int amount){
        for (int i=0;i<amount;i++) {
            System.out.println("Player " + (i + 1) + ": Select a pokemon and enter its stats.");
            storage[i] = createPokemon();
        }
        for (int j=0;j<amount;j++) {
            System.out.println("\nPlayer "+(j+1)+" Pokemon\n----------------");
            System.out.println(Pokemon.PrintStats((Pokemon) storage[j]));
        }
        console.close();
    }
//close scanner
}
