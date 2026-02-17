package lc0401_binary_watch;

import java.util.ArrayList;
import java.util.List;

public class Optimal {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();
        // Map<Integer,List<String>> map = new HashMap<>();
        for(int i=0; i<12; i++){
            int hCount = countOnes(i);
            for(int j=0; j<60; j++){
                int mCount = countOnes(j);
                if(hCount+mCount == turnedOn){
                   if(j<10){
                        result.add(i+":0"+j);
                   }else {
                        result.add(i+":"+j);
                   }
                }
            }
        }
        return result;
    }

    private int countOnes(int num){
        int count = 0;
        while (num >0){
            count += num & 1;
            num >>= 1;
        }
        return count;
    }
}
