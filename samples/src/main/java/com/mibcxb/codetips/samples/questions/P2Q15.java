package com.mibcxb.codetips.samples.questions;

import java.util.Arrays;

public class P2Q15 {
    public static void main(String[] args) {
        System.out.println(longestRedString("baab"));
    }

    public static int longestRedString(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int[] dp = new int[s.length()];
        Arrays.fill(dp, 1);
        int maxLen = 1;
        for (int i = 1; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (Math.abs(s.charAt(i) - s.charAt(j)) == 1) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLen = Math.max(dp[i], maxLen);
        }
        return maxLen;
    }
}
