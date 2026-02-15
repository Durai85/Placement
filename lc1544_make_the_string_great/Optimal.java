package lc1544_make_the_string_great;

import java.util.ArrayDeque;
import java.util.Deque;

public class Optimal {
    public String makeGood(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder res = new StringBuilder();
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && Math.abs(c - stack.peek())==32){
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
