package lc1512_number_of_good_pairs;

import java.util.Map;
import java.util.HashMap;

public class OptimalHashMap {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int count = 0;
        for(int num : map.keySet()){
            int freq = map.get(num);
            if(freq>1){
                count += findComb(freq);
            }
        }
        return count;
    }

    private int findComb (int num){
        return ((num*(num-1))/2);
    }
}
