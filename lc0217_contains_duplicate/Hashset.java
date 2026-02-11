package lc0217_contains_duplicate;

import java.util.HashSet;
import java.util.Set;

public class Hashset {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer>seen = new HashSet<>();
        for(int num : nums){
            if(seen.contains(num)) return true;
            seen.add(num);
        } 
        return false;
    }
}
