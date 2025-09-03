package com.mibcxb.codetips.samples.questions;

public class P2Q02 {
    public static void main(String[] args) {

    }

    private static final int MOD = 1000000007;

    public static int calcRedBlackSum(int[] nums, String colors) {
        long redSum = 0;
        long blackSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (colors.charAt(i) == 'R') {
                redSum = (redSum + nums[i]) % MOD;
            } else {
                blackSum = (blackSum + nums[i]) % MOD;
            }
        }

        long result = (redSum * blackSum) % MOD;
        return (int) ((result + MOD) % MOD);  // 确保结果为非负数
    }
}
