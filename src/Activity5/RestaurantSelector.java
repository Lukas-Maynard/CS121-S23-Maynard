/*
**************************************************************
                    Activity #4 - Switch Activity
                    Name: Lukas Maynard
                    Data Structures Date: Date of Submission (1/24/2023)
 ***************************************************************
         User tells dietary needs of group and available restaurants are output.
 *****************************************************************
             RestaurantSelector::main()
        Parameters: None
       Input is tested if it equals "yes" if so that dietary restriction is set to true.
       These booleans are put through if-else-if statements to assign correct restaurants.

       * This is not the most optimal way to do this but the only way I thought of at the moment.
 ********************************************************************
*/
package src.Activity5;

import javax.swing.*;
public class RestaurantSelector {
    public static void main(String[] args) {
        String vegetarian = JOptionPane.showInputDialog(null,"Is anyone in your party vegetarian?");
        String vegan = JOptionPane.showInputDialog(null,"Is anyone in your party vegan?");
        String gluten = JOptionPane.showInputDialog(null,"Is anyone in your party gluten free?");
        String output;

        boolean vegetarianB = vegetarian.equalsIgnoreCase("yes");
        boolean veganB = vegan.equalsIgnoreCase("yes");
        boolean glutenB = gluten.equalsIgnoreCase("yes");

        //Used for debugging.
    /*  System.out.println("vegetarian "+vegetarianB);
        System.out.println("vegan "+veganB);
        System.out.println("gluten "+glutenB);
        */


        if (veganB && glutenB){
            output = """
                    Corner Cafe
                    The Chef’s Kitchen""";
        } else if (glutenB) {
            output = """
                    Main Street Pizza Company
                    Corner Cafe
                    The Chef’s Kitchen""";
        } else if (veganB) {
            output = """
                    Corner Cafe
                    The Chef’s Kitchen""";
        } else if (vegetarianB) {
            output = """
                    Main Street Pizza Company
                    Corner Cafe
                    Mama’s Fine Italian
                    The Chef’s Kitchen""";
        }else {
            output = """
                    Joe’s Gourmet Burgers
                    Main Street Pizza Company
                    Corner Cafe
                    Mama’s Fine Italian
                    The Chef’s Kitchen""";
        }

        //System.out.println("\n"+output);
        JOptionPane.showMessageDialog(null,"Here are your restaurant choices:\n\n"+output);
        System.exit(0);
    }
}
/*
Joe’s Gourmet Burgers –     Vegetarian: No,  Vegan: No,  Gluten-Free: No
Mama’s Fine Italian –       Vegetarian: Yes, Vegan: No,  Gluten-Free: No
arrayListDemo.src.stringArrayList.StringArrayList Street Pizza Company – Vegetarian: Yes, Vegan: No,  Gluten-Free: Yes
Corner Cafe -               Vegetarian: Yes, Vegan: Yes, Gluten-Free: Yes
The Chef’s Kitchen –        Vegetarian: Yes, Vegan: Yes, Gluten-Free: Yes

--- vegetarian
Main Street Pizza Company
Corner Cafe
Mama’s Fine Italian
The Chef’s Kitchen

--- vegan || vegan && gluten
Corner Cafe
The Chef’s Kitchen

--- gluten
Main Street Pizza Company
Corner Cafe
The Chef’s Kitchen
*/