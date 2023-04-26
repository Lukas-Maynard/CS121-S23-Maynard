
public class Student {
    private String name;
    private int id;
    private String department;
    // Constructor
    public Student(String name, int id, String department){
        this.name = name;
        this.id = id;
        this.department = department;
    }
    /* --------------------- SETTERS -------------------*/
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public String getDepartment(){
        return department;
    }
    /* --------------------- GETTERS -------------------*/
    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id= id;
    }
    public void setDepartment(String department){
        this.department = department;
    }
}
