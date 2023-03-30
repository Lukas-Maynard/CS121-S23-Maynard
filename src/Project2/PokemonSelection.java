package src.Project2;

import java.util.Scanner;

public class PokemonSelection {
    Scanner console = new Scanner(System.in);
    private static int playerNumber = 1;

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

        return newPokemon;
    }

    public void assignPokemon(){
        System.out.println("Select a pokemon and enter its stats.");
        Object currentPokemon = createPokemon();

        System.out.println("Player "+playerNumber+" Pokemon\n----------------");
        Pokemon.PrintStats((Pokemon) currentPokemon);

        playerNumber++;
    }
//close scanner
}
