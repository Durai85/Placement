package lc0762_prime_number_of_set_bits_in_binary_representation;

public class Slower {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int temp = left; temp <= right; temp++){
            int i = temp;
            int j = 0;
            while(i > 0){
                j += ((i & 1) == 1) ? 1 : 0;
                i >>= 1;
            }
            count += isPrime(j) ? 1 : 0;
            // System.out.println(count+ " "+j+" "+temp);
        }
        return count;
    }

    private boolean isPrime(int n){
        if(n==0 || n==1) return false;
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}
