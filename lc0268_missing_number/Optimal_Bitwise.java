package lc0268_missing_number;

public class Optimal_Bitwise {
    public int missingNumber(int[] nums) {
        int num = 0;
        for(int i=0; i<=nums.length; i++){
            num ^= i;
        }
        for(int i : nums){
            num ^= i;
        }
        return num;
    }
}
