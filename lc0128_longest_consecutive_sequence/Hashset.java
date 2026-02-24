package lc0128_longest_consecutive_sequence;

import java.util.HashSet;
import java.util.Set;

public class Hashset {
    public int longestConsecutive(int[] nums) {
        Set<Integer>pair = new HashSet<>();

        for(int num : nums){
            pair.add(num);
        }
        int max = 0;
        for(int num : pair){
            if(!pair.contains(num-1)){
                int temp = num+1;
                int streak = 1;
                while(pair.contains(temp)){
                    streak ++;
                    temp ++;
                }
                max = Math.max(max,streak);
            }
        }
        return max;
    }
}
