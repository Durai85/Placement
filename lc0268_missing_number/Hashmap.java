package lc0268_missing_number;

import java.util.Map;
import java.util.HashMap;

public class Hashmap {
    public int missingNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<=nums.length; i++){
            map.put(i,0);
        }

        for(int i : nums){
            map.put(i, map.get(i)+1);
        }

        for(int i : map.keySet()){
            if(map.get(i)==0) return i;
        }
        return 0;
    }
}
