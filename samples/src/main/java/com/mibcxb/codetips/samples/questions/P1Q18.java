package com.mibcxb.codetips.samples.questions;

public class P1Q18 {
    public static void main(String[] args) {

    }

    public static int makeGoodTimes(String binStr) {
        int times = 0;
        int index = 0;
        String binSub;
        while (index < binStr.length() - 3) {
            binSub = binStr.substring(index, index + 3);
            if (binSub.equals("010") || binSub.equals("101")) {
                times++;
                index += 3;
            } else {
                index++;
            }
        }
        return times;
    }
}
