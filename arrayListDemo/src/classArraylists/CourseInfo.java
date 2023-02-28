package arrayListDemo.src.classArraylists;

import arrayListDemo.src.stringArrayList.StingArrayList;

import java.util.Scanner;

public class CourseInfo {
    public static void main(String[] args) {

        StingArrayList info = new StingArrayList();

        Scanner console = new Scanner(System.in);
        String[] neededInput = {"class name", "score", "GPA", "letter grade"};
        String input = "";
        String[] collected = new String[4];

        do {
            for (int i = 0; i < 4; i++) {
                System.out.printf("Enter %s:", neededInput[i]);
                input = console.nextLine();
                if (input.equals("q")) {
                    break;
                }
                collected[i] = input;
            }
            info.addToEachList(collected[0],Integer.parseInt(collected[1]),Double.parseDouble(collected[2]),collected[3].charAt(0));
            System.out.println("-------------\nEnter \"q\" to quit");
        } while(!input.equals("q"));
        info.printTable();
    }
}
