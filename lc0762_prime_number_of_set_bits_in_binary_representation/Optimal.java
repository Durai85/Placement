package lc0762_prime_number_of_set_bits_in_binary_representation;

public class Optimal {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i = left; i<=right; i++){
            int temp = countOnes(i);
            if(isPrime(temp)){
                // System.out.println(i+" "+temp);
                count++;
            }
        }
        return count;
    }

    private int countOnes(int n){
        int count = 0;
        while(n > 0){
            n = n & (n-1);
            count++;
        }
        return count;
    }

    private boolean isPrime(int n){
        if(n < 2) return false;
        for(int i=2; i*i <= n; i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
