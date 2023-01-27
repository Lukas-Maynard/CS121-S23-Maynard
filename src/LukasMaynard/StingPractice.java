package LukasMaynard;

import java.util.Scanner;

public class StingPractice {
    public static void main(String[] args) {

        String Creator = "Lukas Maynard";
        Scanner console = new Scanner(System.in);

        System.out.println("Enter first name:");
        String FirstName = console.nextLine();
        System.out.println("Enter last name");
        String LastName = console.nextLine();

        String FullName = FirstName + ' '+ LastName;

        if (Creator.equalsIgnoreCase(FullName)){
            System.out.printf("Correct name: %s %s", FirstName, LastName);
        } else {
            System.out.printf("This name is incorrect %s", FullName);
        }

    }
}
