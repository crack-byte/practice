package com.crack_byte;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int maxProfit = maxProfit(7, 1, 5, 3, 6, 4);
        System.out.println(maxProfit);
    }

    public static int maxProfit(int... prices) {
        int i = 100000;
        int max = 0;
        int k = 0;
        while (k < prices.length) {
            if (prices[k] < i)
                i = prices[k];
            else if (prices[k] - i > max)
                max = prices[k] - i;
            ++k;
        }
        return max;
    }
}
