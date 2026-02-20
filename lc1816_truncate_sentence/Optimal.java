package lc1816_truncate_sentence;

public class Optimal {
    public String truncateSentence(String s, int k) {
        StringBuilder res = new StringBuilder();
        int i = 0;
        while(k > 0 && i < s.length()){
            if(s.charAt(i)==' ') k--;
            if(k!=0)
                res.append(s.charAt(i++));
        }
        return new String(res);
    }
}
