package lc1929_concatenation_of_array;

public class Optimal {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length*2];
        for(int i=0; i<res.length; i++){
            res[i] = nums[i%nums.length];
        }
        return res;
    }
}
