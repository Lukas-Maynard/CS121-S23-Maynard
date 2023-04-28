package src.Week14.Activity34_dateFormat;

import src.Activity34_dateFormat.TotalCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TotalCalories totalCalories = new TotalCalories();
        Scanner console = new Scanner(System.in);

        System.out.println("Enter the calories per day: ");
        double rate = Double.parseDouble(console.nextLine());
        System.out.println("Enter the start date as mm/dd/yyyy: ");
        String pickupDate = console.nextLine();
        System.out.println("Enter the end date as mm/dd/yyyy: ");
        String returnDate = console.nextLine();

        double fee = totalCalories.calcTotalCalories(rate, pickupDate, returnDate);
        System.out.printf("Total calories = %.2f", fee);

        console.close();
    }
}
