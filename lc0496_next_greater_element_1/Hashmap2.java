package lc0496_next_greater_element_1;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Hashmap2 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] stack = new int[nums2.length];
        int top = -1;
        int[] greater = new int[nums2.length];
        Arrays.fill(greater,-1);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums2.length; i++){
            while(top > -1 && nums2[i] > nums2[stack[top]]){
                int prev = stack[top--];
                greater[prev] = nums2[i];
            }
            stack[++top] = i;
        }
        for(int i=0; i<nums2.length; i++){
            map.put(nums2[i],greater[i]);
        }
        for(int i=0; i<nums1.length; i++){
            nums1[i] = map.get(nums1[i]);
        }
        return nums1;
    }
}
