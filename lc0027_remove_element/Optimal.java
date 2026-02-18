package lc0027_remove_element;

public class Optimal {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        for(int right=0; right<nums.length; right++){
            if(nums[left]==val && nums[right]!=val){
                int temp = nums[left];
                nums[left++] = nums[right];
                nums[right] = temp;
            }
            else if(nums[left]!=val) left++;
        }
        return left;
    }
}
