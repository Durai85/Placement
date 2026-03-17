package lc0069_sqrt;

public class Optimal {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        while(left <= right){
            int mid = left + (right - left) / 2;
            long pow = (long)mid * mid;
            if (pow == x){
                return mid;
            }
            else if (pow < x){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return left - 1;
    }
}
