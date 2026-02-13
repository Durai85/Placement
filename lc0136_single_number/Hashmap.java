package lc0136_single_number;

import java.util.Map;
import java.util.HashMap;

public class Hashmap {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for(int i : map.keySet()){
            if(map.get(i)==1){
                return i;
            }
        }
        return 0;
    }
}
