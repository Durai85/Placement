package lc3115_maximum_prime_difference;

public class Optimal {
    public int maximumPrimeDifference(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(!isPrime(nums[left])) left++;
        while(!isPrime(nums[right])) right--;
        return right - left;
    }
    private boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2; i*i<=n; i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
