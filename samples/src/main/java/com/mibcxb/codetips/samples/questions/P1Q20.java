package com.mibcxb.codetips.samples.questions;

import java.util.Arrays;

public class P1Q20 {
    // 求中位数
    public static double median(int[] nums) {
        int n = nums.length;
        int[] copy = Arrays.copyOf(nums, n);
        Arrays.sort(copy);
        if (n % 2 == 0) {
            return (copy[n / 2 - 1] + copy[n / 2]) / 2.0;
        } else {
            return copy[n / 2];
        }
    }

    // 求平均数
    public static double mean(int[] nums) {
        if (nums.length == 0) return 0;
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return (double) sum / nums.length;
    }

    // 求去极平均数
    public static double trimMean(int[] nums) {
        if (nums.length <= 2) return 0; // 至少要有3个元素才能去极
        int n = nums.length;
        int[] copy = Arrays.copyOf(nums, n);
        Arrays.sort(copy); // 排序后第一个是最小，最后一个是最大
        long sum = 0;
        for (int i = 1; i < n - 1; i++) {
            sum += copy[i];
        }
        return (double) sum / (n - 2);
    }
}
