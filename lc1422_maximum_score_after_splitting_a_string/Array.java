package lc1422_maximum_score_after_splitting_a_string;

import java.util.Arrays;

public class Array {
    public int maxScore(String s) {
        int n = s.length();
        int[] zero = new int[n];
        int[] ones = new int[n];
        if(s.charAt(0)=='0') zero[0] = 1;
        if(s.charAt(n-1)=='1') ones[n-1] = 1;
        for(int i=1; i<n; i++){
            if(s.charAt(i)=='0'){
                zero[i] = zero[i-1] + 1;
            }
            else{
                zero[i] = zero[i-1];
            }
        }

        for(int i=n-2; i>=0; i--){
            if(s.charAt(i)=='1'){
                ones[i] = ones[i+1] + 1;
            }
            else{
                ones[i] = ones[i+1];
            }
        }
        System.out.println(Arrays.toString(zero));
        System.out.println(Arrays.toString(ones));
        int res = 0;
        for(int i=0; i<n-1; i++){
            res = Math.max(res, ones[i+1] + zero[i]);
        }
        return res;
    }
}
