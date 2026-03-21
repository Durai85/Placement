package lc1011_capacity_to_ship_packages_within_d_days;

public class BinarySearch {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;       // Max element in the array
        int right = 0;      // Sum of the elements in the array
        for(int w : weights){
            left = Math.max(left, w);
            right += w;
        }

        while (left <= right){
            int daysNeeded = 1;
            int currentLoad = 0;
            int mid = left + (right - left) / 2;

            for(int w : weights){
                if(currentLoad + w > mid){
                    daysNeeded ++;
                    currentLoad = 0;
                }
                currentLoad += w;
            }

            if(daysNeeded <= days){
                right = mid - 1;
            }            
            else{
                left = mid + 1;
            }
        }
        return left;
    }
}
