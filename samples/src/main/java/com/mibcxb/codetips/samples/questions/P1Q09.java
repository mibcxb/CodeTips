package com.mibcxb.codetips.samples.questions;

public class P1Q09 {
    public static void main(String[] args) {
        System.out.println(minOps(new int[]{1,5,2,4,1}));
    }

    public static int minOps(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return 0;
        }
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] >= nums[i]) {
                count += nums[i - 1] - nums[i] + 1;
                nums[i] = nums[i - 1] + 1;
            }
        }
        return count;
    }
}
