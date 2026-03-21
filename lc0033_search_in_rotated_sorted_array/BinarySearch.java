package lc0033_search_in_rotated_sorted_array;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int i = 0;
        int n = nums.length;
        while (i < n-1 && nums[i] < nums[i+1]) i++;
        int res = -1;
        if(i < n && i != n-1){
            int res1 = binarySearch(nums, 0, i, target);
            int res2 = binarySearch(nums, i+1, n-1, target);
            if(res1 != -1) res = res1;
            if(res2 != -1) res = res2;
        }
        else {
            res = binarySearch(nums, 0, n-1, target);
        }
        return res;
    }

    private int binarySearch(int[] nums, int left, int right, int target){
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
