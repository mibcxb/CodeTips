package com.mibcxb.codetips.samples.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P3Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int count = sc.nextInt();
            int price = sc.nextInt();
            for (int j = 0; j < count; j++) {
                list.add(count);
            }
        }
        Collections.sort(list);
        int total = 0;
        for (int i = 0; i < m; i++) {
            total += list.get(i);
        }
        System.out.println(total);
    }
}
