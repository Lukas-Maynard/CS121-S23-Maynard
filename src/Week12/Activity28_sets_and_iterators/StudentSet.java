package src.Week12.Activity28_sets_and_iterators;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentSet {
    Set<Object> Students = new HashSet<>();
    
    public void addStudent(){
        Scanner console = new Scanner(System.in);
        String input;

        while(true){
            System.out.println("Input wanted student. \"q\" to exit. ");
            input = console.nextLine();
            if(input.equals("q")){
                break;
            }
            Students.add(input);
        }
    }

    public void displayStudents(){
        System.out.println(Students);
    }
}
