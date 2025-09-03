package com.mibcxb.codetips.samples.questions;

import java.util.HashMap;
import java.util.Map;

public class P1Q16 {
    public static void main(String[] args) {

    }

    public static int maxFreq(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int val;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            val = num + 1;
            map.put(val, map.getOrDefault(val, 0) + 1);
            val = num - 1;
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        for (int freq : map.values()) {
            max = Math.max(max, freq);
        }
        return max;
    }
}
