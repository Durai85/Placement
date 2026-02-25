package lc1356_sort_integers_by_the_number_of_1_bits;

import java.util.Arrays;

public class Optimal {
    public int[] sortByBits(int[] arr) {
        Integer[] nums = new Integer[arr.length];
        for(int i=0; i<arr.length; i++){
            nums[i] = arr[i];
        }
        Arrays.sort(nums, (a,b) -> 
            Integer.bitCount(a) == Integer.bitCount(b)
            ? a - b 
            : Integer.bitCount(a) - Integer.bitCount(b)
        );
        for(int i=0; i<arr.length; i++){
            arr[i] = nums[i];
        }
        return arr;
    }
}
