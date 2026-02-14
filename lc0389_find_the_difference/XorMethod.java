package lc0389_find_the_difference;

public class XorMethod {
    public char findTheDifference(String s, String t) {
        char res = 0;
        for(char ch : s.toCharArray()){
            res ^= ch;
        }
        for(char ch : t.toCharArray()){
            res ^= ch;
        }
        return res;
    }
}
