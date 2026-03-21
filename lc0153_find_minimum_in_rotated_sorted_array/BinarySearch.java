package lc0153_find_minimum_in_rotated_sorted_array;

public class BinarySearch {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int mid = left + (right - left) / 2;
            // System.out.println(nums[left]+" "+nums[mid]+" "+nums[right]);
            if(nums[mid] > nums[right]){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        return nums[left];
    }
}
