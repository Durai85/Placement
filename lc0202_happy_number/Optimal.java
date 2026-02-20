package lc0202_happy_number;

import java.util.HashSet;
import java.util.Set;

public class Optimal {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while(!seen.contains(n)){
            seen.add(n);
            int sum = 0;
            while(n > 0){
                sum += (n % 10)*(n % 10);
                n/=10;
            }
            // System.out.println(sum);
            n = sum;
        }
        return n == 1;
    }
}
