package lc0150_evaluate_reverse_polish_notation;

import java.util.ArrayDeque;
import java.util.Deque;

public class SwitchCase {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(String str : tokens){
            switch(str){
                case "+" , "-" , "*" , "/" -> {
                    int b = stack.pop();
                    int a = stack.pop();
                    switch(str){
                        case "+" -> stack.push(a + b);
                        case "-" -> stack.push(a - b);
                        case "*" -> stack.push(a * b);
                        case "/" -> stack.push(a / b);
                    }
                }
                default -> {
                    stack.push(Integer.parseInt(str));
                }
            }
        }
        return stack.peek();
    }
}
