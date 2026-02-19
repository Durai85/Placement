package lc0015_3_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Worst {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Set<List<Integer>> mainSeen = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            Set<Integer> seen = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                int complement = -1 * (nums[i] + nums[j]);
                if (seen.contains(complement)) {
                    List<Integer> arr = Arrays.asList(nums[i], nums[j], complement);
                    Collections.sort(arr);
                    mainSeen.add(arr);
                }
                seen.add(nums[j]);
            }
        }
        res.addAll(mainSeen);
        return res;
    }
}
