package lc0560_subarray_sum_equals_k;

import java.util.Map;
import java.util.HashMap;

public class PrefixSum {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int prefixsum = 0;
        int count = 0;
        for(int num : nums){
            prefixsum += num;
            if(map.containsKey(prefixsum - k)){
                count += map.get(prefixsum - k);
            }
            map.put(prefixsum, map.getOrDefault(prefixsum,0)+1);
        }
        return count;
    }
}
