package lc0389_find_the_difference;

public class Optimal {
    public char findTheDifference(String s, String t) {
        int res = 0;
        for(char ch : t.toCharArray()){
            res += ch;
        }
        for(char ch : s.toCharArray()){
            res -= ch;
        }
        return (char)res;
    }
}
