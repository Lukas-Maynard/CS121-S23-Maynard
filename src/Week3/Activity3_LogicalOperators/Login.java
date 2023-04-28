/*
**************************************************************
                    Activity #3 - Login
                    Name: Lukas Maynard
                    Data Structures Date: Date of Submission (1/23/2023)
 ***************************************************************
        User inputs Username and password, is told if correct.
 *****************************************************************
             Login::main()
        Parameters: None
       Tests users input through if else statements comparing strings.
 ********************************************************************
*/
package src.Week3.Activity3_LogicalOperators;

import javax.swing.*;
public class Login {
    public static void main(String[] args) {

        String userName = "Lukas";
        String password = "Maynard";
        String inputName, inputPass, endMessage;
        boolean nameCorrect, passCorrect;

        inputName = JOptionPane.showInputDialog(null, "Enter Username: ");
        inputPass = JOptionPane.showInputDialog(null, "Enter Password: ");

        nameCorrect = userName.equals(inputName);
        passCorrect = password.equals(inputPass);

        if (nameCorrect && passCorrect) {
            endMessage = "Welcome to CS 121!";
        } else if (!nameCorrect && !passCorrect) {
            endMessage = "Both username and password are incorrect.";
        } else if (nameCorrect) {
            endMessage = "Password is incorrect.";
        } else {
            endMessage = "Username is incorrect.";
        }
        
        JOptionPane.showMessageDialog(null, endMessage);
        System.exit(0);
    }
}
