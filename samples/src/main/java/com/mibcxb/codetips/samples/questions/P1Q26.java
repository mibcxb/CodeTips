package com.mibcxb.codetips.samples.questions;

public class P1Q26 {
    public static void main(String[] args) {

    }

    public static int countSub(String s) {
        int count = 0;
        int start = 0;
        int lastR = -1;
        int lastE = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'd') {
                start = i + 1;
                lastR = -1;
                lastE = -1;
            } else {
                if (c == 'e') {
                    lastE = i;
                }
                if (c == 'r') {
                    lastR = i;
                }
                if (lastE != -1 && lastR != -1) {
                    int valid = Math.max(start, Math.min(lastR, lastE));
                    count += valid - start + 1;
                }
            }
        }
        return count;
    }
}
