/*
**************************************************************
                    Activity #3 - Triangles
                    Name: Lukas Maynard
                    Data Structures Date: Date of Submission (1/23/2023)
 ***************************************************************
        User inputs sides of a triangle and is told what kind of triangle it is.
 *****************************************************************
              Triangles::main()
        Parameters: None
       Asks user input within small for loop, compares them in if-else-if statements.
 ********************************************************************
*/
package src.Week3.Activity3_LogicalOperators;

import javax.swing.*;

public class Triangles {
    public static void main(String[] args) {
        int[] side = new int[3];
        String input, outMessage;

        for (int i=0; i<3; i++){
            input = JOptionPane.showInputDialog(null,"Input length of side "+(i+1));
            side[i] = Integer.parseInt(input);
        }

        if (side[0] != side[1] && side[0] != side[2]) {
            outMessage ="scalene";
        } else if (side[0] == side[1] && side[0] == side[2]){
            outMessage = "equilateral";
        } else {
            outMessage = "isosceles";
        }

        JOptionPane.showMessageDialog(null, String.format("""
                This triangle is %s
                With sides of: %d, %d, %d""",outMessage,side[0],side[1],side[2]));

        System.out.println(side[0] + side[1] + side[2]);
        System.exit(0);

    }
}
