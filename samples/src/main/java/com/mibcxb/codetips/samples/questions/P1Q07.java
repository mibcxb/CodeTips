package com.mibcxb.codetips.samples.questions;

import java.util.Arrays;

public class P1Q07 {
    public static void main(String[] args) {

    }

    public static void maxDiscount(int[] prices, double[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double result = 0;
        for (int i = 0; i < prices.length; i++) {
            result += prices[i] * discounts[prices.length - i - 1];
        }
        System.out.printf("%.3f", result);
    }
}
