package lc1816_truncate_sentence;

import java.util.Arrays;

public class BuiltIn {
    public String truncateSentence(String s, int k) {
        String arr[] = s.split(" ");
        return String.join(" ",Arrays.copyOfRange(arr,0,k));    
    }
}
