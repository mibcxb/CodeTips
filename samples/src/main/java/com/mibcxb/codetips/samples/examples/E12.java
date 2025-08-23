package com.mibcxb.codetips.samples.examples;

public class E12 {
    public static void main(String[] args) {
        System.out.println(isConsecutiveStrictly("6532y"));
    }

    public static boolean isConsecutive(String str) {
        if (str == null || str.length() < 2) {
            return false;
        }
        return isConsecutive(str.toCharArray());
    }

    /**
     * 判断数字字符串是否单调（连续递增或连续递减）
     *
     * @param chars 纯数字组成的字符串（不能包含非数字字符）
     * @return true-递增/递减；false-非单调或无效输入
     */
    public static boolean isConsecutive(char[] chars) {
        int trend = 0; // 0:未定义, 1:递增, -1:递减
        for (int i = 1; i < chars.length; i++) {
            char prev = chars[i - 1];
            char curr = chars[i];
            if (prev == curr) { // 检查数字连续性
                return false; // 相邻相等立即失败
            }
            if (trend == 0) { // 首次确定趋势
                trend = (prev < curr) ? 1 : -1;
            } else if ((trend == 1 && prev >= curr) || (trend == -1 && prev <= curr)) { // 校验趋势一致性
                return false;
            }
        }
        return true;
    }

    public static boolean isConsecutiveStrictly(String str) {
        if (str == null || str.length() < 2) {
            return false;
        }
        return isConsecutiveStrictly(str.toCharArray());
    }

    /**
     * 判断数字字符串是否严格单调
     *
     * @param chars 纯数字组成的字符串（不能包含非数字字符）
     * @return true-递增/递减；false-非单调或无效输入
     */
    public static boolean isConsecutiveStrictly(char[] chars) {
        int trend = 0;
        for (int i = 1; i < chars.length; i++) {
            char prev = chars[i - 1];
            char curr = chars[i];
            if (prev == curr) {
                return false;
            }
            if (trend == 0) {
                trend = curr - prev;
                if (Math.abs(trend) != 1) {
                    return false;
                }
            } else {
                if (curr - prev != trend) {
                    return false;
                }
            }
        }
        return true;
    }
}
