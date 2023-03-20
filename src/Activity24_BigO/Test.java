/*
**************************************************************
            Activity #24 - Big O
            Name: Lukas Maynard
            Date of Submission (3/20/2023)
 *************************************************************
        Tests the BigO class methods
 *************************************************************
*/
package src.Activity24_BigO;

public class Test {
    public static void main(String[] args) {
        BigO Test = new BigO();

        Test.printOnce("printed once");
        System.out.println("-------------");
        Test.printNTimes("print N times",3);
        System.out.println("-------------");
        Test.printNSquaredTimes("print N^2 times",3);
    }
}
