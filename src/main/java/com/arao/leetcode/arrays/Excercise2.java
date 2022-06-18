package com.arao.leetcode.arrays;

import java.util.Arrays;

public class Excercise2 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        // since youcan buy and sell same day, the comparation will be if next day price is greater than last day
        for(int i=1; i<prices.length; i++) {
            if(prices[i] > prices[i-1]) {
                maxProfit += prices[i] - prices[i-1];
            }
        }
        return maxProfit;
    }
}
