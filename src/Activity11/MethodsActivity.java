/*
**************************************************************
                    Activity #11 - Methods Activity
                    Name: Lukas Maynard
                    Data Structures Date: Date of Submission (2/2/2023)
 ***************************************************************
    Takes length and width from user then displays inputs and area.
 *****************************************************************
    --------MethodsActivity::main()
        Parameters: None
       Calls all other methods

    --------MethodsActivity::getLength()
        Parameters: None
       Takes user input for length.

    --------MethodsActivity::getWidth()
        Parameters: None
       Takes user input for width.

    --------MethodsActivity::getArea()
        Parameters: Double length, Double width
       Multiplies the length and width.

    --------MethodsActivity::displayData()
        Parameters: Double length, Double width, Double Area
       Prints out all user input and the area.
 ********************************************************************
*/
package src.Activity11;

import java.util.Scanner;

public class MethodsActivity {

    static double getLength(){
        System.out.println("Enter the rectangles length:");
        return console.nextDouble();
    }

    static double getWidth(){
        System.out.println("Enter the rectangles width:");
        return console.nextDouble();
    }

    static double getArea(double length, double width){
        return length * width;
    }

    static void displayData(double length, double width, double area){
        System.out.printf("""
                Rectangle length: %.2f
                Rectangle width: %.2f
                Rectangle area: %.2f""",length,width,area);
    }

    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {

        double length = getLength();
        double width = getWidth();
        displayData(length,width,getArea(length,width));

        console.close();
    }
}