package com.mibcxb.codetips.samples.questions;

public class P3Q18 {
    public static void main(String[] args) {
        System.out.println(palindrome2(new int[]{0, 1, 3, 2, 1}));
        System.out.println(palindrome2(new int[]{1, 2, 3, 4, 5}));
    }

    public static int palindrome(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int l = 0, r = n - 1; l < r; l++, r--) {
            if (nums[l] != nums[r]) {
                if (nums[l] - nums[r] != nums[l + 1] - nums[r - 1]) {
                    return -1;
                }
                int diff = nums[l] - nums[r];
                if (diff < 0) {
                    nums[l] -= diff;
                    nums[l + 1] -= diff;
                } else {
                    nums[r] += diff;
                    nums[r - 1] += diff;
                }
                count += Math.abs(diff);
            }
        }
        return count;
    }

    public static long palindrome2(int[] nums) {
        int n = nums.length;
        int m = n / 2;
        long yPrev = 0;
        long count = 0;

        for (int i = 1; i <= m; i++) {
            long gi = nums[i - 1] - nums[n - i]; // g_i
            long yi = -gi - yPrev;               // y_i = -g_i - y_{i-1}
            if ((n % 2 == 0) && i == m) {
                if (yi != 0) { // 偶数长度的中间边需满足 y_m == 0 才可行
                    return -1;
                }
            } else {
                count += Math.abs(yi);
            }
            yPrev = yi;
        }
        return count;
    }
}
