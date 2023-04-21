package src.Activity31_LinkedLIsts;

import java.util.LinkedList;

public class Student {
    String firstName;
    String lastName;
    int ID;
    String major;
    String classStanding;
    double gpa;

    LinkedList<String> courseList = new LinkedList<>();

    public Student(String firstName, String lastName, int ID, String major, String classStanding, double gpa){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.major = major;
        this.classStanding = classStanding;
        this.gpa = gpa;
    }

    public void addCourse(String course){
        courseList.add(course);
    }

    public void removeCourse(String course){
        courseList.remove(course);
    }

    public void getStudentInfo(){
        System.out.printf("""
                Full name: %s %s
                ID: %d
                Major: %s
                Standing: %s
                GPA: %.2f
                """,firstName, lastName, ID, major, classStanding, gpa);
    }

    public void displayStudentCourses(){
        System.out.println("\nCourse list:");
        for (String course :courseList){
            System.out.println(course);
        }
        System.out.println();
    }
}
