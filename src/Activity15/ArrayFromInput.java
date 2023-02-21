/*
**************************************************************
                    Activity #15 - Array from input
                    Name: Lukas Maynard
                    Data Structures Date: Date of Submission (2/21/2023)
 *************************************************************
        Creates array's from user input
 *************************************************************
            ArrayFromInput::main()
        Initializes arrays, uses loops for input and output
 *************************************************************
*/
package src.Activity15;
import java.util.Scanner;

public class ArrayFromInput {
    public static void main(String[] args) {
        String[] studentName = new String[3];
        double[] gpa = new double[3];
        String[] letterGrade = new String[3];

        Scanner console = new Scanner(System.in);

        // input
        for (int i=0;i<3;i++) {
            System.out.println("Enter students name: ");
            studentName[i] = console.nextLine();
            System.out.println("Enter students gpa: ");
            gpa[i] = Double.parseDouble(console.nextLine());
            System.out.println("Enter students letter grade: ");
            letterGrade[i] = console.nextLine();
            // other option to get just 1 character (doesn't go to next line)
            // letterGrade[i] = console.next().charAt(0);
        }

        // output
        for (int i=0;i<3;i++) {
            System.out.printf("""
                    \n--- Student Info ---
                    Name: %s
                    GPA: %.2f
                    Letter Grade: %s""",studentName[i],gpa[i],letterGrade[i]);
        }
        System.exit(0);
    }
}
