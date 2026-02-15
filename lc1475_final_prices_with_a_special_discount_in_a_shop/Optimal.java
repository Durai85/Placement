package lc1475_final_prices_with_a_special_discount_in_a_shop;

public class Optimal {
    public int[] finalPrices(int[] prices) {
        int top = -1;
        int[] stack = new int[prices.length];
        for(int i=0; i<prices.length; i++){
            while(top!=-1 && prices[stack[top]] >= prices[i]){
                int prev = stack[top--];
                prices[prev] -= prices[i];
            }
            stack[++top]=i;
        }
        return prices;
    }
}
