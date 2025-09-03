package com.mibcxb.codetips.samples.questions;

public class P1Q08 {
    public static void main(String[] args) {

    }

    public static int firstNonZeroBinary(int n) {
        String binStr = Integer.toBinaryString(n); // 转换为二进制字符串
        for (int i = binStr.length() - 1; i >= 0; i--) { // 从后往前找第一个 '1'
            if (binStr.charAt(i) == '1') {
                //从第 i 个位置开始，一直到最后一个字符，提取出一个新的子字符串
                String subStr = binStr.substring(i);
                //字符串解析成整数，2，表示按二进制解析
                return Integer.parseInt(subStr, 2);
            }
        }
        return 0; // 如果没找到（比如 n == 0），返回 0
    }
}
