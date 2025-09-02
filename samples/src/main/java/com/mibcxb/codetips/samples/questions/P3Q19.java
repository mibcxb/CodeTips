package com.mibcxb.codetips.samples.questions;

public class P3Q19 {
    public static void main(String[] args) {
        System.out.println(reCount("010"));
        System.out.println(reCount("0101"));
    }

    public static int reverseCount(String s) {
        int lCount = count(s);
        int rCount = count(new StringBuilder(s).reverse().toString());
        return Math.max(lCount, rCount);
    }

    public static int count(String s) {
        int res = 0;
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                res += i - cnt;
                cnt++;
            }
        }
        return res;
    }

    public static long reCount(String s) {
        int n = s.length();
        long zeros = 0;     // 扫描时统计当前已见到的 0 的数量
        long ones = 0;      // 总的 1 的数量
        long leftCost = 0;  // 把所有 1 推到最左侧的代价：每遇到 1，累加它左侧 0 的个数

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '0') {
                zeros++;
            } else if (c == '1') {
                ones++;
                leftCost += zeros; // 该 1 左边已有多少 0，需要这么多交换把它推到这些 0 的左侧
            }
        }

        long zerosTotal = n - ones;
        long rightCost = ones * zerosTotal - leftCost;
        return Math.max(leftCost, rightCost);
    }
}
