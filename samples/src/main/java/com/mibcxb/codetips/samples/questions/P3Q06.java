package com.mibcxb.codetips.samples.questions;

public class P3Q06 {
    public static void main(String[] args) {

    }

    public static long numberPairCount(long a, long b) {
        final long limit = 1L << 31; // 2^31
        // 范围检查：x,y <= 2^(31-1) -> A,B 也必须在此范围内且非负
        if (a < 0 || b < 0 || a >= limit || b >= limit) {
            return 0;
        }
        // 合法性检查：A 的 1 位不能出现在 B 的 0 位上
        if ((a & ~b) != 0) {
            return 0;
        }
        // 自由位个数：A 与 B 不同的位（在合法时即 A=0,B=1 的位）
        int k = Long.bitCount(a ^ b);
        // k=0 => x=y=A，唯一解；k>0 -> 2^(k-1)
        return k == 0 ? 1L : 1L << (k - 1);
    }
}
