package lc0853_car_fleet;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Optimal {
    public int carFleet(int target, int[] position, int[] speed) {
        Deque<Double> stack = new ArrayDeque<>();
        int n = position.length;
        int[][] pair = new int[n][2];
        for(int i=0; i<n; i++){
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }
        Arrays.sort(pair, (a,b)-> a[0] - b[0]);
        
        for(int i=n-1; i>=0; i--){
            double val = (double)(target - pair[i][0]) / pair[i][1];
            if(stack.isEmpty() || stack.peek() < val){
                stack.push(val);
            }
        }
        return stack.size();
    }
}
