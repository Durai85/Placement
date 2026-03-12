package lc1006_clumsy_factorial;

import java.util.Stack;

public class Simulation {
    public int clumsy(int n) {
        Stack<Integer> stack = new Stack<>();
        stack.push(n);
        n--;
        int i = 0;
        while(n > 0){
            if(i % 4 == 0){
                stack.push(stack.pop() * n);
            }
            else if(i % 4 == 1){
                stack.push(stack.pop() / n);
            }
            else if(i % 4 == 2){
                stack.push(n);
            }
            else{
                stack.push(-n);
            }
            i ++;
            n --;
        }
        int result = 0;
        while(!stack.isEmpty()){
            result += stack.pop();
        }
        return result;
    }
}
