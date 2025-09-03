package com.mibcxb.codetips.samples.questions;

import java.util.Arrays;

public class P2Q10 {
    public static void main(String[] args) {
        System.out.println(maxSum(154937));
    }

    public static int maxSum(int n) {
        char[] digits = String.valueOf(n).toCharArray();
        Arrays.sort(digits);

        int l = 0;
        int r = digits.length - 1;
        int sum = 0;
        while (l < r) {
            sum += digits[r] - digits[l];
            l++;
            r--;
        }
        return sum;
    }
}
