package lc1470_shuffle_the_array;

public class Optimal {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
        int j = 0;
        for(int i=0; i < n; i++){
            result[j++] = nums[i];
            result[j++] = nums[i+n];
        }
        return result;
    }
}
