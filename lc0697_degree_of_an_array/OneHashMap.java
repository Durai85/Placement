package lc0697_degree_of_an_array;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class OneHashMap {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
            max = Math.max(max, map.get(num));
        }
        // System.out.println(max);
        List<Integer> arr = new ArrayList<>();
        for(int num : map.keySet()){
            if(map.get(num)==max) arr.add(num);
        }
        
        int min = Integer.MAX_VALUE;
        for(int i : arr){
            int first = 0;
            int last = nums.length -1;
            while(nums[first++]!=i);
            while(nums[last--]!=i);
            --first;
            ++last;
            min = Math.min(min, last-first+1);
        }

        return min;
    }
}
