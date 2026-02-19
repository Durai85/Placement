package lc0349_intersection_of_two_arrays_1;

import java.util.HashSet;
import java.util.Set;

public class Optimal {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> inter = new HashSet<>();
        for(int n1 : nums1) set.add(n1);
        for(int n2 : nums2){
            if(set.contains(n2)) inter.add(n2);
        }
        int[] res = new int[inter.size()];
        int index = 0;
        for(int i : inter){
            res[index++] = i;
        }
        return res;
    }
}
