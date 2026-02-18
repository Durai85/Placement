package lc0026_remove_duplicates_from_sorted_array;

public class Optimal {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        for (int right = 1; right < nums.length; right++){
            if(nums[left] != nums[right]){
                nums[++left] = nums[right];
            }
        }
        return left+1;
    }
}
