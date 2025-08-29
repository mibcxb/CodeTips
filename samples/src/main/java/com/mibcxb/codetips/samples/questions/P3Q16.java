package com.mibcxb.codetips.samples.questions;

import java.util.ArrayList;
import java.util.List;

public class P3Q16 {
    public static void main(String[] args) {
        listNums(10);
    }

    public static void listNums(int n) {
        List<Integer> list = new ArrayList<>();
        for (int k = 1; k < n; k++) {
            if ((n - k) % 4 != 0) {
                list.add(k);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(list.get(i));
        }
        System.out.println();
    }
}
