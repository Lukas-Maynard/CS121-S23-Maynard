package src.Week13.Activity31_LinkedLIsts;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Lukas","Maynard",5442,"Computer Science","Junior",3.5);
        Student student2 = new Student("Buzz","Light-year",3225,"Space Ranger","Senior",4.0);

        student1.addCourse("Discrete Structures");
        student1.addCourse("Data Mining");
        student1.addCourse("OOP");
        student1.getStudentInfo();
        student1.displayStudentCourses();
        student1.removeCourse("Data Mining");
        student1.displayStudentCourses();


        student2.addCourse("Flight Training");
        student2.addCourse("Astronomy");
        student2.addCourse("Time Travel");
        student2.getStudentInfo();
        student2.displayStudentCourses();
        student2.removeCourse("Time Travel");
        student2.displayStudentCourses();
    }
}
