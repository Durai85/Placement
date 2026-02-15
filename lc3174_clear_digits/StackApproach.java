package lc3174_clear_digits;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackApproach {
        public String clearDigits(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!stack.isEmpty() && Character.isDigit(c)){
                stack.pop();
            }
            else {
                stack.push(c);
            }
        }
        StringBuilder result = new StringBuilder();
        for(char c : stack){
            result.append(c);
        }
        return result.reverse().toString();
    }
}
