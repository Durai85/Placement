package lc0349_intersection_of_two_arrays_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_Approach {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for(int i : nums1){
            set1.add(i);
        }

        Set<Integer> set2 = new HashSet<>();
        for(int i : nums2){
            set2.add(i);
        }

        List<Integer> res = new ArrayList<>();
        for(int i : set1){
            if(set2.contains(i)){
                res.add(i);
            }
        }

        int result[] = new int[res.size()];
        for(int i=0; i<res.size(); i++){
            result[i] = res.get(i);
        }
        return result;
    }
}
