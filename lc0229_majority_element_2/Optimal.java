package lc0229_majority_element_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Optimal {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        int k = nums.length/3;
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key)>k){
                arr.add(key);
            }
        }
        return arr;
    }
}
