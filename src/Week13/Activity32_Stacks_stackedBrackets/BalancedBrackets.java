package src.Week13.Activity32_Stacks_stackedBrackets;

import java.util.EmptyStackException;
import java.util.Stack;

public class BalancedBrackets {

    public String checkBalance(String input) {
        //char[] bracketsArray = {'(','[','{','}',']',')'};
        Stack<Character> stack = new Stack<>();
        char previous;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '(' || c =='[' || c =='{') {
                stack.push(c);
            } else {
                try {
                    stack.pop();
                } catch (EmptyStackException e){
                    return "unbalanced";
                }
            }
        }

        if (stack.empty()) {
            return "balanced";
        } else {
            return "unbalanced";
        }
    }
}
