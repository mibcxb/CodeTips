package com.mibcxb.codetips.samples.questions;

public class P1Q10 {
    public static void main(String[] args) {

    }

    public static boolean checkFlipAnswers(char[] source, char[] target) {
        int sourceCount = 0;
        int flipCount = 0;
        if (source != null && target != null && source.length == target.length) {
            for (int i = 0; i < source.length; i++) {
                if (source[i] == target[i]) {
                    sourceCount++;
                }
                if ((source[i] == 'A' ? 'B' : 'A') == target[i]) {
                    flipCount++;
                }
            }
        }
        return flipCount > sourceCount;
    }
}
