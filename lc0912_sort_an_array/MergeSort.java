package lc0912_sort_an_array;

public class MergeSort {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        // merge(nums, 0, nums.length/2, nums.length);
        return nums;
    }
    private void mergeSort(int[] nums, int left, int right){
        if(left < right){
            int mid = left + (right - left) / 2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid+1, right);
            merge(nums, left, mid, right);
        }
    }
    private void merge(int[] nums, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] first = new int[n1];
        int[] last = new int[n2];
        for(int i=0; i<n1; i++){
            first[i] = nums[i + left];
        }
        for(int i=0; i<n2; i++){
            last[i] = nums[mid + 1 + i];
        }
        // System.out.println(Arrays.toString(nums));
        // System.out.println(Arrays.toString(last));
        int i=0,j=0,k=left;
        while(i<n1 && j<n2){
            if(first[i] <= last[j]){
                nums[k++] = first[i++];
            }
            else{
                nums[k++] = last[j++];
            }
        }

        while(i<n1){
            nums[k++] = first[i++];
        }
        
        while(j<n2){
            nums[k++] = last[j++];
        }
    }
}
