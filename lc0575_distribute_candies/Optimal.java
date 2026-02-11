package lc0575_distribute_candies;

import java.util.HashSet;
import java.util.Set;

public class Optimal {
    public int distributeCandies(int[] candyType) {
        Set<Integer> unique = new HashSet<>();
        for(int c : candyType){
            unique.add(c);
        }
        int uniqueCount = unique.size();
        int halfCount = candyType.length / 2;
        
        if(uniqueCount >= halfCount){
            return halfCount;
        }
        return uniqueCount;
    }
}
