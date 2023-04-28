import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StudentReader{
    public static void main(String[] args) {
        try{
//Creates a Gson object
            Gson gson = new Gson();
// reading the json file with BuffferedReader class object
//Reads text from a character-input stream, buffering characters.
// Provides for the efficient reading of characters, arrays, and lines.
            BufferedReader reader = new BufferedReader(new
                    FileReader("Student.json"));
// converts json to Java object
            Student student = gson.fromJson(reader,Student.class);
            System.out.println("****** Student Details ******");
            System.out.printf("Student name %s\nStudent id: %d\nStudent department: %s",student.getName(), student.getId(), student.getDepartment());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
