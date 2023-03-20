/*
**************************************************************
            Activity #24 - Big O
            Name: Lukas Maynard
            Date of Submission (3/20/2023)
 *************************************************************
        3 methods that print provided parameter a certain amount of times.
 *************************************************************
*/
package src.Activity24_BigO;

public class BigO {
    public void printOnce(String input){
        System.out.println(input);
    }

    public void printNTimes(String input,int amount){
        for(int i=0;i<amount;i++){
            System.out.println(input);
        }
    }

    public void printNSquaredTimes(String input,int amount){
        for(int i=0;i<(amount*amount);i++){
            System.out.println(input);
        }
    }
}
