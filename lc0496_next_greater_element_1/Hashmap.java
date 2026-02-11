package lc0496_next_greater_element_1;

import java.util.HashMap;

public class Hashmap {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums2.length; i++){
            int ng = -1;
            for(int j=i+1; j<nums2.length; j++){
                if(nums2[j] > nums2[i]){
                    ng = nums2[j];
                    break;
                }
            }
            map.put(nums2[i],ng);
        }
        // System.out.println(map);

        int[] arr = new int[nums1.length];
        for(int i=0; i<arr.length; i++){
            arr[i] = map.get(nums1[i]);
        }
        return arr;
        // return new int[]{};
    }
}
