package com.mibcxb.codetips.samples.questions;

public class P1Q24 {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5};
        int[] b = {1, 2, 3, 6};
        System.out.println(countSteps(4, a, b));
    }

    public static int countSteps(int n, int[] a, int[] b) {
        int result = -1;
        int da = 0;
        int db = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > b[i]) {
                da = a[i] - b[i];
            } else if (a[i] < b[i]) {
                db = b[i] - a[i];
            }
        }
        if (da == db) {
            result = da;
        }
        return result;
    }
}
