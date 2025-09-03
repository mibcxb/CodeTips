package com.mibcxb.codetips.samples.questions;

import java.util.Arrays;
import java.util.Scanner;

public class P2Q26 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[3];
        for (int i = 0; i < 3; i++) {
            array[i] = in.nextInt();
        }
        Arrays.sort(array);
        int cost = array[2] - array[1] + array[1] - array[0];
        System.out.print(cost);
    }
}
