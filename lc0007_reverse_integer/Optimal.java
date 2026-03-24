package lc0007_reverse_integer;

public class Optimal {
    public int reverse(int x) {
        int rev = 0;
        boolean flag = false;
        if(x < 0){
            x *= -1;
            flag = true;
        }

        while(x > 0){
            if(rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10){
                return 0;
            }
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return flag ? rev * -1 : rev;
    }
}
