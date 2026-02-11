package lc0020_valid_parentheses;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class DequeApproach {
    public boolean isValid(String s) {
        HashMap<Character,Character> pair = new HashMap<>();
        pair.put(')','(');
        pair.put('}','{');
        pair.put(']','[');

        Deque<Character> stack = new ArrayDeque<>();
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
