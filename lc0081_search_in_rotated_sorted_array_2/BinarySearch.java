package lc0081_search_in_rotated_sorted_array_2;

public class BinarySearch {
    public boolean search(int[] nums, int target) {
        int i = 0;
        int n = nums.length;
        while (i < n-1 && nums[i] <= nums[i+1]) i++;
        boolean res = false;
        if(i < n && i != n-1){
            boolean res1 = binarySearch(nums, 0, i, target);
            boolean res2 = binarySearch(nums, i+1, n-1, target);
            res = res1 || res2;
        }
        else {
            res = binarySearch(nums, 0, n-1, target);
        }
        return res;
    }

    private boolean binarySearch(int[] nums, int left, int right, int target){
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) return true;
            else if(nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
}
