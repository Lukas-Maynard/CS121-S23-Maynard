package src.Activity10;

import javax.swing.*;
public class fileActivity {
    public static void main(String[] args) {

        String[] fileOptions = {"Create File", "Read File", "Write file header", "Append to file","-- Close program --"};
        Object selectedOption = JOptionPane.showInputDialog(null, "What would you like to do?", "Choose operation...", JOptionPane.QUESTION_MESSAGE, null, fileOptions, "Create File");

        if (selectedOption.equals("Create File")) {
            FileCreate.main(null);
        } else if (selectedOption.equals("Read File")) {
            FileRead.main(null);
        } else if (selectedOption.equals("Write file header")) {
            FileWrite.main(null);
        } else if (selectedOption.equals("Append to file")) {
            FileAppend.main(null);
        } else if (selectedOption.equals("-- Close program --")) {
            System.out.println("Program ended");
            System.exit(0);
        }

        System.exit(0);
    }
}

