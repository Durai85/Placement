package lc1413_minimum_value_to_get_positive_step_by_step_sum;

public class PrefixSum_Bot {
    public int minStartValue(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i=1; i<nums.length; i++){
            nums[i] += nums[i-1];
        }
        for(int i : nums){
            if(i < 0){
                min = Math.min(min,i);  
            }
        }
        System.out.println(min);
        if(min == Integer.MAX_VALUE) return 1;
        else if(min < 0) return Math.abs(min) + 1;
        else return min;
    }
}
