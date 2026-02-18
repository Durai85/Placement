package lc0283_move_zeros;

public class ForLoopMethod {
    public void moveZeroes(int[] nums) {
        int t = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[t]==0 && nums[i]!=0){
                nums[t++] = nums[i];
                nums[i] = 0;
            }
            else if(nums[t]!=0) t++;
        } 
    }
}
