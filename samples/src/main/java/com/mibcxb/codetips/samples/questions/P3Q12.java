package com.mibcxb.codetips.samples.questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P3Q12 {
    public static void main(String[] args) {
        System.out.println(splitNum("123"));
    }

    public static int splitNum(String numStr) {
        int length = numStr.length();
        int size = 1 << (length - 1);
        Set<Integer> result = new HashSet<>();
        StringBuilder builder;
        for (int mark = 0; mark < size; mark++) {
            builder = new StringBuilder();
            for (int i = 0; i < length; i++) {
                builder.append(numStr.charAt(i));
                if (i < size && (mark >> i & 1) == 1) {
                    builder.append('+');
                }
            }
            int sum = Arrays.stream(builder.toString().split("\\+")).mapToInt(Integer::parseInt).sum();
            result.add(sum);
        }
        return result.size();
    }
}
