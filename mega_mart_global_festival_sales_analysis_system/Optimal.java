package mega_mart_global_festival_sales_analysis_system;

import java.util.ArrayList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.HashMap;

public class Optimal {
    public int[] mostFrequent(int[] nums,int n){
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int[] result = new int[n];
        if(n > map.size()){
            ArrayList<Integer> arr = new ArrayList<>();
            for(int key : map.keySet()){
                arr.add(key);
            }
            int[] res = new int[arr.size()];
            for(int i=0; i<res.length; i++){
                res[i] = arr.get(i);
            }
            return res;
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> {
            if(map.get(a) != map.get(b)){
                return map.get(b) - map.get(a);
            }
            return a - b;
        });

        for(int key : map.keySet()){
            pq.offer(key);
        }
        for(int i=0; i<n; i++){
            result[i] = pq.poll();
        }
        return result;
    }
}
