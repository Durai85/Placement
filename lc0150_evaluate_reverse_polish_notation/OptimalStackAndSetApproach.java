package lc0150_evaluate_reverse_polish_notation;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class OptimalStackAndSetApproach {
    public int evalRPN(String[] tokens) {
        Set<String> operator = new HashSet<>();
        operator.add("+");
        operator.add("-");
        operator.add("*");
        operator.add("/");
        Deque<Integer> stack = new ArrayDeque<>();
        for(String token : tokens){
            if(!operator.contains(token)){
                stack.push(Integer.parseInt(token));
            }
            else if(stack.size()>1){
                int b = stack.pop();
                int a = stack.pop();
                switch(token){
                    case "+" :
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b);
                        break;
                }
            }
        }
        return stack.pop();
    }
}
