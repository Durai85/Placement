package lc0003_longest_substring_without_repeating_characters;

import java.util.HashSet;
import java.util.Set;

public class Hashset {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        Set<Character> window = new HashSet<>();
        int max = 0;
        for(int right = 0; right < s.length(); right ++){
            if(!window.contains(s.charAt(right))){
                window.add(s.charAt(right));
            }
            else{
                while(left < s.length() && window.contains(s.charAt(right))){
                    window.remove(s.charAt(left++));
                }
                window.add(s.charAt(right));
            }
            max = Math.max(max, window.size());
        }
        return max;
    }
}
