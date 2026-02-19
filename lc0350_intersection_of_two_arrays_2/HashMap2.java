package lc0350_intersection_of_two_arrays_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class HashMap2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i=0; i<n1; i++){
            map1.put(nums1[i], map1.getOrDefault(nums1[i],0)+1);
        }
        
        for (int i=0; i<n2; i++){
            map2.put(nums2[i], map2.getOrDefault(nums2[i],0)+1);
        }
        
        for (int num : nums1){
            if(map2.containsKey(num)){
                result.add(num);
                map1.put(num, map1.get(num)-1);
                map2.put(num, map2.get(num)-1);
                if(map1.get(num)==0) map1.remove(num);
                if(map2.get(num)==0) map2.remove(num);
            }
        }

        int res[] = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            res[i] = result.get(i);
        }
        return res;
    }
}
