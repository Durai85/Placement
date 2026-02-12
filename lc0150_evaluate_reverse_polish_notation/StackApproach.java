package lc0150_evaluate_reverse_polish_notation;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackApproach {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(String t : tokens){
            if(!t.equals("+") && !t.equals("-") && !t.equals("*") && !t.equals("/")){
                stack.push(Integer.parseInt(t));
            }
            else{
                int b = stack.pop();
                int a = stack.pop();
                switch(t){
                    case "+" -> stack.push(a+b);
                    case "-" -> stack.push(a-b);
                    case "*" -> stack.push(a*b);
                    case "/" -> stack.push(a/b);
                }
            }
            System.out.println(t);
        }
        return stack.peek();
        // return 0;
    }
}
