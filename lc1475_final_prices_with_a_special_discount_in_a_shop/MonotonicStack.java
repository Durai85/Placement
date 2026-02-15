package lc1475_final_prices_with_a_special_discount_in_a_shop;

import java.util.ArrayDeque;
import java.util.Deque;

public class MonotonicStack {
    public int[] finalPrices(int[] prices) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i=0; i<prices.length; i++){
            while(!stack.isEmpty() && prices[stack.peek()] >= prices[i]){
                int prev = stack.pop();
                prices[prev] -= prices[i];
            }
            stack.push(i);
        }
        return prices;
    }
}
