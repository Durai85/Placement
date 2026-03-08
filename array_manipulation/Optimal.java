package array_manipulation;

import java.util.List;

public class Optimal {
    public static long arrayManipulation(int n, List<List<Integer>> queries) {
    // Write your code here
        long[] arr = new long[n+1];
        for(List<Integer> q : queries){
            long a = q.get(0);
            long b = q.get(1);
            long k = q.get(2);
            for(int i=(int)a; i<=(int)b; i++){
                arr[i] += k;
            }
        }
        long answer = 0l;
        for(long a : arr){
            answer = Math.max(a, answer);
        }
        return answer;
    }
}
