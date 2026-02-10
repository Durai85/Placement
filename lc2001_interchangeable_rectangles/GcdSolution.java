package lc2001_interchangeable_rectangles;

import java.util.HashMap;

public class GcdSolution {
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<String,Integer> count = new HashMap<>();
        for(int[] rec : rectangles){
            int g = gcd(rec[0],rec[1]);
            int a = rec[0]/g;
            int b = rec[1]/g;
            String key = a+"/"+b;
            count.put(key,count.getOrDefault(key,0)+1);
        }
        // System.out.println(count);
        long result = 0l;
        for(int i : count.values()){
            result += ((long)i * (i-1)) / 2;
        }
        return result;
        // return 0l;
    }

    private int gcd(int a, int b){
        return b==0 ? a : gcd(b, a%b);
    }
}
