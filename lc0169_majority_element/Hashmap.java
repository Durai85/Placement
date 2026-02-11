package lc0169_majority_element;

import java.util.Map;
import java.util.HashMap;

public class Hashmap {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> pair = new HashMap<>();
        int n = nums.length/2;
        for(int num : nums){
            pair.put(num, pair.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : pair.entrySet()){
            if(entry.getValue() > n){
                return entry.getKey();
            }
        }
        return 0;
    }
}
