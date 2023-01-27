/*
**************************************************************
                    Activity #4 - Switch Activity
                    Name: Lukas Maynard
                    Data Structures Date: Date of Submission (1/24/2023)
 ***************************************************************
        User enters a planet and is returned the size, amount of moons, and distance from the sun.
 *****************************************************************
             SwitchActivity::main()
        Parameters: None
       Uses a switch statement to assign correct information about the entered planet.
       Checks if a valid planet is entered, if not restarts program.
 ********************************************************************
*/
package src.Activity4;

import javax.swing.*;

public class SwitchActivity {
    public static void main(String[] args) {

        String distance = "";
        String size = "";
        String moonCount = "";

       String selectedPlanet = JOptionPane.showInputDialog(null,"Enter a planet");

        switch (selectedPlanet) {
            case "Mercury" -> {
                distance = "0.39";
                size = "1,516";
                moonCount = "0";
            }
            case "Venus" -> {
                distance = "0.72";
                size = "3760.4";
                moonCount = "0";
            }
            case "Earth" -> {
                distance = "1";
                size = "3958.8";
                moonCount = "1";
            }
            case "Mars" -> {
                distance = "1.52";
                size = "2106.1";
                moonCount = "2";
            }
            case "Jupiter" -> {
                distance = "5.2";
                size = "43,441";
                moonCount = "80";
            }
            case "Saturn" -> {
                distance = "9.54";
                size = "36,184";
                moonCount = "83";
            }
            case "Uranus" -> {
                distance = "19.2";
                size = "15,759";
                moonCount = "27";
            }
            case "Neptune" -> {
                distance = "30.06";
                size = "15,299";
                moonCount = "14";
            }
            default -> {
                JOptionPane.showMessageDialog(null,selectedPlanet+" is not a planet/spelling error.");
                main(null);
            }
        }

        JOptionPane.showMessageDialog(null, String.format("""
                Planet chosen: %s
                Size: %s miles (radius)
                Distance: %s au
                Moons: %s""",selectedPlanet,size,distance,moonCount));

        System.exit(0);
    }
}
