package lc0121_best_time_to_buy_and_sell_stock;

public class Optimal {
    public int maxProfit(int[] prices) {
        int min_price = Integer.MAX_VALUE;  
        int max_profit = 0;
        for(int p : prices){
            min_price = Math.min(min_price, p);
            int current_profit = p - min_price;
            max_profit = Math.max(current_profit, max_profit);
        }
        return max_profit;
    }
}
