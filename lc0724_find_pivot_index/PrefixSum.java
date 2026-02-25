package lc0724_find_pivot_index;

public class PrefixSum {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] leftPrefix = new int[n];
        int[] rightPrefix = new int[n];

        for(int i=1; i<n; i++){
            leftPrefix[i] = leftPrefix[i-1] + nums[i-1];
        }
        for(int i=n-2; i>=0; i--){
            rightPrefix[i] = rightPrefix[i+1] + nums[i+1];
        }
        for(int i=0; i<n; i++){
            if(leftPrefix[i]==rightPrefix[i]) return i;
        }
        return -1;
    }
}
