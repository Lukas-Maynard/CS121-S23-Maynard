/*
**************************************************************
            Activity #23 - Palindrome detector
            Name: Lukas Maynard
            Data Structures Date: Date of Submission (3/18/2023)
 *************************************************************
        Uses recursion to compare the first and last letter in a string then shorten it before calling itself.
 *************************************************************
*/
package src.Week10.Activity23_recursion;

public class PalindromeDetector {

    public static boolean isPalindrome(String word1){
        if(word1.length() <=1) {
            return true;}
        if (word1.charAt(0) == word1.charAt(word1.length()-1)) {
            return isPalindrome(word1.substring(1, word1.length() - 1));
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("test"));
        System.out.println(isPalindrome("hannah"));
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("false"));
    }
}
