package com.mibcxb.codetips.samples.questions;

import java.util.Arrays;
import java.util.Scanner;

public class P2Q29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        int[] vec = new int[n];
        int li, ri, vi;
        for (int i = 0; i < q; i++) {
            li = in.nextInt();
            ri = in.nextInt();
            vi = in.nextInt();
            for (int j = li; j <= ri; j++) {
                if (j % vi == 0) vec[j]++;
            }
        }
        Arrays.stream(vec).forEach(a -> System.out.print(a + " "));
    }
}
