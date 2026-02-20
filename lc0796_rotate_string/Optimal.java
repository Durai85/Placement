package lc0796_rotate_string;

public class Optimal {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        if((s+s).contains(goal)) return true;
        return false;
    }
}
