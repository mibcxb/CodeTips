package com.mibcxb.codetips.samples.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P2Q20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] array = new Integer[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        Arrays.sort(array, Collections.reverseOrder());
        int maxSide = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= i + 1) maxSide = i + 1;
        }
        System.out.print(maxSide);
    }
}
