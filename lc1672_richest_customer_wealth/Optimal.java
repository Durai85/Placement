package lc1672_richest_customer_wealth;

public class Optimal {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int arr[] : accounts){
            int temp = 0;
            for (int a : arr){
                temp += a;
            }
            max = Math.max(max, temp);
        }
        return max;
    }
}
