package lc0283_move_zeros;

public class Optimal {
    public void moveZeroes(int[] nums) {
        int idx = 0;
        int left = idx;
        while (left < nums.length){
            if(nums[left]!=0){
                int temp = nums[idx];
                nums[idx] = nums[left];
                nums[left] = temp;
                idx ++;
            }
            left ++;
        }
    }
}
