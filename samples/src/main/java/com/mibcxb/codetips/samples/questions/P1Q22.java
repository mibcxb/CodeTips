package com.mibcxb.codetips.samples.questions;

import java.util.Arrays;

public class P1Q22 {
    public static void main(String[] args) {
        System.out.println(maxRangeSum(new int[]{1, 2, 3, 4, 5, 6}, 3));
        System.out.println(maxRangeSum(new int[]{1, 5, 3, 2, 4}, 3));
    }

    public static long maxRangeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int t = Math.min(k, n >> 1);
        long sum = 0L;
        for (int i = 0; i < t; i++) {
            sum += nums[n - 1 - i] - nums[i];
        }
        return sum;
    }
}
