package lc0167_two_sum_2_input_array_is_sorted;

public class Optimal {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            int idx = 0;
            if(complement < nums[i]){
                idx = search(nums, 0, i-1, complement);
            }
            else{
                idx = search(nums, i+1, nums.length-1, complement);
            }
            // System.out.println(idx);
            if(idx != -1){
                    return new int[]{i+1,idx+1};
            }
        }   
        return new int[]{};
    }

    private int search(int[] nums, int left, int right, int target){
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}
