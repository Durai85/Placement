package lc1009_complement_of_base_10_integer;

public class Optimal {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        int i = 1;
        while(n >= i) i*=2;
        return n^(i-1);
    }
}
