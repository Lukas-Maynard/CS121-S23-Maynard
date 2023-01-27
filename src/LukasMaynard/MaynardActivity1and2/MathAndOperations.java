/*
**************************************************************
                    Activity #1 - Math and Operations
                    Name: Lukas Maynard
                    Data Structures Date: Date of Submission (1/17/2023)
 ***************************************************************
      User chooses a mathematical operation from a drop-down menu then inputs
      required numbers in input message boxes. The desired calculation is executed,
      all information is displayed on the final output window.
 *****************************************************************
              MathAndOperations:: NumberInput1()  and  NumberInput2()
        Parameters: None
       Both methods serve the purpose of prompting user for a numerical value with a dialog box.
       Floating point number input in dialog box is returned.

              MathAndOperations::main()
        Parameters: None
       Prompts user for a choice by a drop-down box. The choice then dictates the mathematical operation
       used for the end value. Depending on the operation choice 1 or 2 numbers may
       be needed.(called by "NumberInput" methods)
 ********************************************************************
*/
package LukasMaynard.MaynardActivity1and2;

import javax.swing.*;

public class MathAndOperations {
    // Public/global Number variables are used in many places over the program.
    public static double Number1;
    public static double Number2;
    static double NumberInput1() {
        // Message box for user numerical input
        String Input1;
        Input1 = JOptionPane.showInputDialog("Enter the first number:");
        Number1 = Integer.parseInt(Input1);

        return Number1;
    }

    static double NumberInput2() {
        // Message box for user numerical input
        String Input2;
        Input2 = JOptionPane.showInputDialog("Enter the second number:");
        Number2 = Integer.parseInt(Input2);

        return Number2;
    }
    public static void main(String[] args) {
        double FinalOutput = 0;

        // Array for math operation options.
        String[] option = new String[]{"Add", "Subtract", "Multiply", "Divide", "Square root", "Power", "Logarithm (Base 10)"};

        // Drop down box for operations
        Object selectedOption = JOptionPane.showInputDialog(null, "Choose an operation:", "Choose operation...", JOptionPane.QUESTION_MESSAGE, null, option, "Add");

        // Chosen operator effects the end output and the number of inputs. (There maybe a better way to do this)
        if(selectedOption == "Add") {
            FinalOutput = NumberInput1() + NumberInput2();
        } else if (selectedOption == "Subtract") {
            FinalOutput = NumberInput1() - NumberInput2();
        } else if (selectedOption == "Multiply") {
            FinalOutput = NumberInput1() * NumberInput2();
        } else if (selectedOption == "Divide") {
            FinalOutput = NumberInput1() / NumberInput2();
        } else if (selectedOption == "Square root") {
            FinalOutput = Math.sqrt(NumberInput1());
        } else if (selectedOption == "Power") {
            FinalOutput = Math.pow(NumberInput1(), NumberInput2());
        } else if (selectedOption == "Logarithm (Base 10)") {
            FinalOutput = Math.log10(NumberInput1());
        }

        // Final output
        JOptionPane.showMessageDialog(null,String.format("""
                        Chosen Operation: %s
                        Input Number 1: %.2f
                        Input Number 2: %.2f
                        End Calculation: %.2f""",selectedOption,Number1,Number2,FinalOutput));

        System.exit(0);
    }
}
