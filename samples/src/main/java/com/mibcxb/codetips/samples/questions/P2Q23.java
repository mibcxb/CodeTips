package com.mibcxb.codetips.samples.questions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class P2Q23 {
    public static void main(String[] args) {

    }

    public static int maxCount(int n, int k, String s) {
        Map<Character, Integer> map = new HashMap<>();
        char c;
        for (int i = 0; i <= n - k; ) {
            boolean isGood = true;
            c = s.charAt(i);
            for (int j = 1; j < k; j++) {
                if (c != s.charAt(i + j)) {
                    isGood = false;
                    break;
                }
            }
            if (isGood) {
                map.put(c, map.getOrDefault(c, 0) + 1);
                i += k;
            } else {
                i++;
            }
        }
        return Collections.max(map.values());
    }
}
