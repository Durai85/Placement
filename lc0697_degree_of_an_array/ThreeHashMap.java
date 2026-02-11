package lc0697_degree_of_an_array;

import java.util.HashMap;

public class ThreeHashMap {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> first = new HashMap<>();
        HashMap<Integer,Integer> last = new HashMap<>();
        int max = 0;
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            max = Math.max(max,map.get(nums[i]));
            // First-index
            if(first.containsKey(nums[i])){
                int minFirst = first.get(nums[i]);
                first.put(nums[i],Math.min(minFirst,i));
            }
            else{
                first.put(nums[i],i);
            }
            // Last-index
            if(last.containsKey(nums[i])){
                int maxFirst = last.get(nums[i]);
                last.put(nums[i],Math.max(maxFirst,i));
            }
            else{
                last.put(nums[i],i);
            }
        }

        int min = Integer.MAX_VALUE;
        for(int num : nums){
            if(map.get(num)==max){
                min = Math.min(min,last.get(num) - first.get(num) + 1);
            }
        }


        return min;
    }
}
