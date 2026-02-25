package lc1413_minimum_value_to_get_positive_step_by_step_sum;

public class PrefixSum_Optimal {
    public int minStartValue(int[] nums) {
        int prefixSum = 0;
        int minPrefix = 0;

        for (int num : nums) {
            prefixSum += num;
            minPrefix = Math.min(minPrefix, prefixSum);
        }

        return 1 - minPrefix;
    }
}
