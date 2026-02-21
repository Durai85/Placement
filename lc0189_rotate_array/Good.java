package lc0189_rotate_array;

public class Good {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int arr[] = new int[n];
        int j = 0;
        k = k % n;
        for(int i=n-k; i<2*n && j<n; i++){
            arr[j++] = nums[i % n];
        }
        for(int i=0; i<n; i++){
            nums[i] = arr[i];
        }
    }
}
