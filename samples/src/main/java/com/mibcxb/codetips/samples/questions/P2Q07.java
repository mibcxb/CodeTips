package com.mibcxb.codetips.samples.questions;

import java.util.Arrays;

public class P2Q07 {
    public static void main(String[] args) {

    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int gcdExOne(int[] nums) {
        // 先过滤出非1元素
        int[] filtered = Arrays.stream(nums).filter(x -> x != 1).toArray();
        if (filtered.length == 0) return 1;
        // 计算最大公约数GCD
        int result = filtered[0];
        for (int i = 1; i < filtered.length; i++) {
            result = gcd(result, filtered[i]);
            if (result == 1) {
                break;
            }
        }
        if (result == 1) return -1;
        // 找出最小质因数
        for (int i = 2; i * i <= result; i++) {
            if (result % i == 0) return i;
        }
        return result;
    }
}
