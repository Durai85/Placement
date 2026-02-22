package lc_0868_binary_gap;

import java.util.ArrayList;
import java.util.List;

public class BruteForce {
    public int binaryGap(int n) {
        StringBuilder str = binary(n);
        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='1') arr.add(i);
        }
        int max = 0;
        for(int i=1; i<arr.size(); i++){
            max = Math.max(max, arr.get(i)-arr.get(i-1));
        }
        return max;
    }
    private StringBuilder binary(int n){
        StringBuilder str = new StringBuilder();
        while(n>0){
            str.append(n&1);
            n>>=1;
        }
        return str.reverse();
    }
}
