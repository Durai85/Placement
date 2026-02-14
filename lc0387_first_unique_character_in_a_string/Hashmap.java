package lc0387_first_unique_character_in_a_string;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (int i=0; i<s.length(); i++){
            if (map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
