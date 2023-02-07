/*
**************************************************************
                    Project 1 - Pokémon Battle
                    Name: Lukas Maynard
                    Data Structures Date: Date of Submission (2/7/2023)
 *************************************************************
        User inputs odd number of rounds to prevent tie. Then player1 and player2 input pokemon info.
        After determining who gos first by attack speed the attack sequence, the attacks by both players
        happen until one player's hitPoints are zero indicating the other player wins the round. Rounds
        continue until all are complete. Player with more rounds won, wins!
 *************************************************************
            PokemonBattle::main()
        Parameters: None
        Insures input round amount is a round number. Uses a series of loops to execute amount of rounds,
        needed input, math for the attacks, and output.

            PokemonBattle::whosFaster()
        Parameters: Player[] class List
        Determines what player has higher attack speed using the player instances. Returns array with player order.

            PokemonBattle::Player{}
        Parameters: None
        Used to create player instance containing: name, hitPoints, move, movePower,and attackSpeed.
 *************************************************************
*/
package src.Project1;

import java.util.Arrays;
import java.util.Scanner;
public class PokemonBattle {
    public static class Player{
        // Used to create player instance's
        String name;
        int hitPoints;
        String move;
        double movePower;
        double attackSpeed;
        int wins = 0;
    }

    public static int[] whosFaster(Player[] players){
        // Determines and outputs who attacks first by attack speed
        int[] order;
        if (players[0].attackSpeed >= players[1].attackSpeed){
            order = new int[]{0, 1};
        } else {
            order = new int[]{1, 0};
        }
        System.out.println(Arrays.toString(order));
        return order;
    }
    public static void main(String[] args) {
        // Instantiation could be reduced to one line somehow like this: Player[] players = new Player[2];
        Player player1 = new Player();
        Player player2 = new Player();
        Player[] players = {player1,player2};

        int recentWin;

        Scanner console = new Scanner(System.in);
        // Insures amount of rounds input is round.
        System.out.println("Enter odd number of rounds");
        int rounds = console.nextInt();
        if (rounds%2 == 0){
            System.out.println("Amount of rounds needs to be odd.");
            main(null);
        }
        // Main gameplay loop for amount of input rounds
        for(int i=0;i<rounds;i++){
            System.out.printf("""
                    \n
                    Round %d
                    ---------------
                    """,i+1);
            // Loop input for both players every round
            for (int playerCount=0;playerCount<2;playerCount++) {
                System.out.printf("""
                        Player %d
                        Enter Name:""", playerCount +1);
                players[playerCount].name = console.next();
                System.out.println("Enter HP:");
                players[playerCount].hitPoints = console.nextInt();
                System.out.println("Enter move:");
                players[playerCount].move = console.next();
                System.out.println("Enter move power:");
                players[playerCount].movePower = console.nextDouble();
                System.out.println("Enter attack speed:");
                players[playerCount].attackSpeed = console.nextDouble();
            }
            // Who goes first
            int[] atkSeq = whosFaster(players);

            // Main attack loop, does the math for the attacks until a players health is zero
            do{
                players[atkSeq[1]].hitPoints -= players[atkSeq[0]].movePower;
                if (players[atkSeq[1]].hitPoints<=0){
                    continue;}
                players[atkSeq[0]].hitPoints -= players[atkSeq[1]].movePower;
            } while(players[0].hitPoints>0 && players[1].hitPoints>0);

            // Determines recent winner for output and adds wins to players win amount.
            if (players[1].hitPoints<=0){
                players[0].wins +=1;
                recentWin = 0;
            } else{
                players[1].wins +=1;
                recentWin = 1;
            }
            // Output after avery round, displays who won/amount of wins.
            System.out.printf("""
                        Player %d's %s wins this round!
                        \nWins
                        ------
                        Player 1: %d
                        Player 2: %d
                        """,recentWin,players[0].name,players[0].wins,players[1].wins);
        }
        // Final output displays who won the whole game.
        if (players[0].wins > players[1].wins){
            System.out.println("Player 1 Wins!");
        } else if (players[0].wins < players[1].wins) {
            System.out.println("Player 2 Wins!");
        }
        System.exit(0);
    }
}