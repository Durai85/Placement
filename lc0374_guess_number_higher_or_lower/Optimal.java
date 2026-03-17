package lc0374_guess_number_higher_or_lower;

public class Optimal {
    private int guess(int mid){
        return 0;
    }
    
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if(guess(mid) == 0){
                return mid;
            }
            else if(guess(mid) == 1){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return 0;
    }
}
