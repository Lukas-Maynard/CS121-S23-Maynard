package src.Week13.Activity32_stackedBrackets;

public class BalancedBracketsTester {
    public static void main(String[] args) {
        BalancedBrackets balanced = new BalancedBrackets();

        System.out.println(balanced.checkBalance("()"));
        System.out.println(balanced.checkBalance("(()())"));
        System.out.println(balanced.checkBalance("((((()(())))))"));
        System.out.println(balanced.checkBalance("(()"));
        System.out.println();

        System.out.println(balanced.checkBalance("())"));
        System.out.println(balanced.checkBalance(")()"));
        System.out.println();

        System.out.println(balanced.checkBalance("([{}])"));
        System.out.println(balanced.checkBalance("([{])"));
    }
}
