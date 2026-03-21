package lc0003_longest_substring_without_repeating_characters;

import java.util.Map;
import java.util.HashMap;

public class Hashmap {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        Map<Character,Integer> map = new HashMap<>();
        int max = 0;
        for(int right = 0; right < s.length(); right ++){
            if(map.containsKey(s.charAt(right))){
                left = Math.max(map.get(s.charAt(right))+1, left);
            }
            map.put(s.charAt(right), right);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
