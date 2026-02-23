package lc0347_top_k_frequent_elements;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class BucketSort {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        @SuppressWarnings("unchecked")
        List<Integer> bucket[] = new List[nums.length + 1];

        for(int key : map.keySet()){
            int f = map.get(key);
            if(bucket[f]==null){
                bucket[f] = new ArrayList<>();
            }
            bucket[f].add(key); 
        }
        
        int[] result = new int[k];
        int idx = 0;
        for(int i=bucket.length-1; i >= 0 && idx < k; i--){
            if(bucket[i]!=null){
                for(int a : bucket[i]){
                    result[idx++] = a;
                }
            }
        }

        return result;
    }
}
