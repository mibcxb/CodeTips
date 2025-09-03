package com.mibcxb.codetips.samples.questions;

public class P1Q05 {
    public static void main(String[] args) {
        int[] nums = {6, 15, 21};
        System.out.println(minNum(nums));
    }

    public static int minNum(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result = gcd(result, nums[i]);
            if (result == 1) {
                break;
            }
        }
        return result;
    }

    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
