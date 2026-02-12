package lc2696_min_string_len_after_remove_substring;

import java.util.ArrayDeque;
import java.util.Deque;

public class OptimalStack {
    public int minLength(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char ch : s.toCharArray()){
            if(!stack.isEmpty() && ((stack.peek()=='A' && ch=='B') || (stack.peek()=='C' && ch=='D'))){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        return stack.size();
    }
}
