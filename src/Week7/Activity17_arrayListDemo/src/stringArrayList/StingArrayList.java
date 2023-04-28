package src.Week7.Activity17_arrayListDemo.src.stringArrayList;

import java.util.ArrayList;

public class StingArrayList {
    private ArrayList<String> classNameArray = new ArrayList<>();
    private ArrayList<Integer> scoreArray = new ArrayList<>();
    private ArrayList<Double> gpaArray = new ArrayList<>();
    private ArrayList<Character> letterGradeArray = new ArrayList<>();


    public void addString(String input){
        classNameArray.add(input);
    }

    public void removeString(String input){
        classNameArray.remove(input);
    }

    public int SizeOfArray(){
        return classNameArray.size();
    }

    public String getElement(int input){
        return classNameArray.get(input);
    }

    public void foreachPrint(){
        System.out.println("\nForeach loop print: ");
        for(String i:classNameArray){
            System.out.println(i);
        }
    }

    public void forLoopPrint(){
        System.out.println("\nRegular for loop print: ");
        for (int i=0; i<classNameArray.size();i++){
            System.out.println(classNameArray.get(i));
        }
    }

    public void addToEachList(String className, int score, double gpa, char letterGrade){
        classNameArray.add(className);
        scoreArray.add(score);
        gpaArray.add(gpa);
        letterGradeArray.add(letterGrade);
    }

    public void printTable() {
        System.out.format("%15s%10s%10s%10s\n", "Class name", "Score", "GPA", "Grade");
        for (int i = 0; i < classNameArray.size()-1; i++) {
            System.out.format("%15s%10d%10.2f%10c\n", classNameArray.get(i), scoreArray.get(i), gpaArray.get(i), letterGradeArray.get(i));
        }
    }


    public static void main(String[] args) {
         StingArrayList test = new StingArrayList();
         test.addString("This");
         test.addString("is ");
         test.addString("a");
         test.addString("test");

         System.out.println(test.SizeOfArray());
         System.out.println(test.getElement(2));

         test.forLoopPrint();
         test.removeString("a");
         test.foreachPrint();
    }
}
