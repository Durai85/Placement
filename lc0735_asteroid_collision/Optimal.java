package lc0735_asteroid_collision;

import java.util.ArrayDeque;
import java.util.Deque;

public class Optimal {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(int as : asteroids){
            boolean flag = false;
            if(as < 0){
                while(!stack.isEmpty() && stack.peek() > 0){
                    if(Math.abs(stack.peek()) < Math.abs(as)){
                        stack.pop();
                    }
                    else if(Math.abs(stack.peek()) == Math.abs(as)){
                        stack.pop();
                        flag = true;
                        break;
                    }
                    else{
                        flag = true;
                        break;
                    }
                }
            }
            if(!flag){
                stack.push(as);
            }
        }
        int[] result = new int[stack.size()];
        int i = 0;
        while(!stack.isEmpty()){
            result[i++] = stack.pop();
        }
        int left = 0;
        int right = result.length-1; 
        while(left < right){
            int temp = result[left];
            result[left++] = result[right];
            result[right--] = temp;
        }
        return result;
    }
}
