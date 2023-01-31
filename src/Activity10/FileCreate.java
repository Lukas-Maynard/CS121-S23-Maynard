package src.Activity10;

import java.io.File;
import java.io.IOException;


public class FileCreate {
    public static void main(String[] args) {

        //String fileName = "fileActivityTXT.txt";

        try {
            File myFile = new File("fileActivityTXT.txt");
            if (myFile.createNewFile()){
                System.out.println("File created");
            }else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
        }
    }
}
