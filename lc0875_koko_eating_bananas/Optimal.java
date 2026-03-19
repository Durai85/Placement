package lc0875_koko_eating_bananas;

public class Optimal {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int pile : piles){
            max = Math.max(max, pile);
        }

        int left = 1;
        int right = max;
        int min = max;
        while (left <= right){
            int mid = left + (right - left) / 2;
            long k = 0;
            for(int num : piles){
                k += (num + mid - 1) / mid;
            }
            if(k <= h){
                min = mid;
                right = mid - 1;
            }
            else left = mid + 1;
        }
        return min;
    }
}
