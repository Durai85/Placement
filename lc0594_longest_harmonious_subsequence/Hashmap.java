package lc0594_longest_harmonious_subsequence;

import java.util.Map;
import java.util.HashMap;

public class Hashmap {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        int max = 0;
        for(int num : map.keySet()){
            int comp = num - 1;
            if(map.containsKey(comp)){
                max = Math.max(max, (map.get(num)+map.get(comp)));
            }
        }
        return max;
    }
}
