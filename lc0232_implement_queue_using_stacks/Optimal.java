package lc0232_implement_queue_using_stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class Optimal {
    class MyQueue {
        Deque<Integer> stack1;
        Deque<Integer> stack2;

        public MyQueue() {
            stack1 = new ArrayDeque<>();
            stack2 = new ArrayDeque<>();
        }
        
        public void push(int x) {
            stack1.push(x);
        }
        
        public int pop() {
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            int pop = stack2.pop();
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
            return pop;
        }
        
        public int peek() {
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            int peek = stack2.peek();
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
            return peek;
        }
        
        public boolean empty() {
            return stack1.isEmpty();
        }
    }

}
