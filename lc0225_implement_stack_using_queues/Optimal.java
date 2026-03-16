package lc0225_implement_stack_using_queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class Optimal {
    class MyStack {
        Deque <Integer> queue; 

        public MyStack() {
            queue = new ArrayDeque<>();
        }
        
        public void push(int x) {
            queue.offer(x);
            for(int i=0; i<queue.size()-1; i++){
                queue.offer(queue.poll());
            }
        }
        
        public int pop() {
            return queue.poll();
        }
        
        public int top() {
            return queue.peek();
        }
        
        public boolean empty() {
            return queue.isEmpty();
        }
    }
}
