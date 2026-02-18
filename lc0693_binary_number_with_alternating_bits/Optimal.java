package lc0693_binary_number_with_alternating_bits;

public class Optimal {
    public boolean hasAlternatingBits(int n) {
        int res = n ^ (n>>1);
        return (res & (res +1))==0;        
    }
}
