package lc0155_min_stack;

import java.util.Deque;
import java.util.ArrayDeque;

class MinStack {
    Deque<Integer> stack = new ArrayDeque<>();
    Deque<Integer> min = new ArrayDeque<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        this.stack.push(val);
        if(!(this.min.isEmpty())&&(this.min.peek() >= val)){
            this.min.push(val);
        }
        else if(this.min.isEmpty()) this.min.push(val);
    }
    
    public void pop() {
        int p = this.stack.pop();
        if(p == this.min.peek()) this.min.pop();
    }
    
    public int top() {
        return this.stack.peek();
    }
    
    public int getMin() {
        // System.out.println(this.min);
        return this.min.peek();
    }
}

public class Optimal {
    
}
