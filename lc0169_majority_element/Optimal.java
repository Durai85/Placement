package lc0169_majority_element;

import java.util.Arrays;

public class Optimal {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length /2];
    }
}
