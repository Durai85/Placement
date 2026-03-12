package lc1768_merge_strings_alternately;

public class Optimal {
    public String mergeAlternately(String word1, String word2) {
        int i=0, j=0;
        StringBuilder str = new StringBuilder();
        while(i < word1.length() && j < word2.length()){
            str.append(word1.charAt(i++));
            str.append(word2.charAt(j++));
        }
        while(i < word1.length()){
            str.append(word1.charAt(i++));
        }
        while(j < word2.length()){
            str.append(word2.charAt(j++));
        }
        return new String(str);
    }
}
