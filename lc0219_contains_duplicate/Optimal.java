package lc0219_contains_duplicate;

import java.util.HashSet;
import java.util.Set;

public class Optimal {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length; 
        Set<Integer> seen = new HashSet<>();
        for(int i=0; i<n; i++){
            if(seen.contains(nums[i])){
                return true;
            }
            seen.add(nums[i]);
            if(seen.size() > k){
                seen.remove(nums[i-k]);
            }
        }
        return false;
    }
}
