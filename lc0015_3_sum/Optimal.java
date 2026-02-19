package lc0015_3_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Optimal {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i=0; i<nums.length; i++){
            if (i > 0 && nums[i]==nums[i-1]) continue;
            int left = i+1;
            int right = nums.length-1;
            while (left < right){
                // System.out.println(result);
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left ++;
                    right --;
                    while(left < right && nums[left-1]==nums[left]) left++;
                    while(left < right && nums[right+1]==nums[right]) right--;
                }
                else if (sum < 0) left ++;
                else right --;
            }
        }
        return result;
    }
}
