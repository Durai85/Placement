package lc0204_count_primes;

public class SieveOptimal {
    public int countPrimes(int n) {
        if(n < 2) return 0;
        int[] isPrime = new int[n];
        isPrime[0] = 0;
        isPrime[1] = 0;
        for(int i=2; i<n; i++) isPrime[i] = 1;

        for(int i=2; i*i < n; i++){
            if(isPrime[i]==1){
                for(int j=i*i; j < n; j+=i){
                    isPrime[j] = 0;
                }
            }
        }
        int num = 0;
        for(int count : isPrime){
            num += count;
        }
        return num;
    }
}
