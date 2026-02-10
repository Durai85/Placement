package lc0014_longest_common_prefix;

import java.util.Arrays;

public class Optimal {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int len1 = strs[0].length();
        int len2 = strs[strs.length-1].length();
        int len = Math.min(len1,len2);
        StringBuilder result = new StringBuilder();
        for(int i=0; i<len; i++){
            char f = strs[0].charAt(i);
            char l = strs[strs.length-1].charAt(i);
            if(f!=l) break;
            result.append(f);
        }
        return result.toString();
    }
}
