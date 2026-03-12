package lc0026_remove_duplicates_from_sorted_array;

public class Alternative {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = left + 1;
        while (right < n){
            while(right < n && nums[left] == nums[right]) right++;
            if(right < n){
                nums[++left] = nums[right];
            }
        }
        return left+1;
    }
}
