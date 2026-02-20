package lc0796_rotate_string;

public class Alternate {
    public boolean rotateString(String s, String g) {
        if(s.length()!=g.length()) return false;
        return (s+s).contains(g);
    }
}
