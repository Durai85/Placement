package lc0771_jewels_and_stones;

import java.util.HashSet;
import java.util.Set;

public class Hashset {
        public int numJewelsInStones(String jewels, String stones) {
        Set<Character> key = new HashSet<>();   

        for(char ch : jewels.toCharArray()){
            key.add(ch);
        }
        int count=0;
        int len = stones.length();
        for(int i=0; i<len; i++){
            if(key.contains(stones.charAt(i))){
                count++;
            }
        }
        return count;
    }
}
