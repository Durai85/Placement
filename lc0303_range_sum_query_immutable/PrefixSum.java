package lc0303_range_sum_query_immutable;

public class PrefixSum {
    int[] arr;
    public PrefixSum(int[] nums) {
        arr = nums;
        for(int i=1; i<arr.length; i++){
            arr[i] += arr[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left == 0) return arr[right];
        return arr[right] - arr[left-1];
    }
}
