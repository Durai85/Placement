package lc0762_prime_number_of_set_bits_in_binary_representation;

public class OptimalBuiltIn {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int temp = left; temp <= right; temp++){
            int j = 0;
            j = Integer.bitCount(temp);
            count += (isPrime(j)) ? 1 : 0;
        }
        return count;
    }

    private boolean isPrime(int n){
        if(n==0 || n==1) return false;
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}
