package lc0020_valid_parentheses;

import java.util.Stack;
import java.util.HashMap;

public class StackApproach {
    public boolean isValid(String s) {
        HashMap<Character,Character> pair = new HashMap<>();
        pair.put(')','(');
        pair.put('}','{');
        pair.put(']','[');

        Stack<Character> stack = new Stack<>();
        char arr[] = s.toCharArray();
        for(char c : arr){
            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
            }
            else if(stack.isEmpty()) return false;
            else if(stack.pop() != pair.get(c)) return false;
        }
        return stack.isEmpty();
    }
}
