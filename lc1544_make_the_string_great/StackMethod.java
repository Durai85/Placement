package lc1544_make_the_string_great;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackMethod {
    public String makeGood(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder res = new StringBuilder();
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && (c != stack.peek()) && (Character.toLowerCase(c) == stack.peek() || Character.toUpperCase(c) == stack.peek())){
                stack.pop();
                continue;
            }
            stack.push(c);
        }
        for(char c : stack){
            res.append(c);
        }
        return res.reverse().toString();
    }
}
