package com.mibcxb.codetips.samples.questions;

import java.util.Scanner;

public class P2Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[][] arr = new String[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.next();
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                String s = arr[i][j];
                if (s.equals("R")) {
                    int l = j - 1;
                    int r = j + 1;
                    int t = i - 1;
                    int b = i + 1;
                    if (l >= 0 && "B".equals(arr[i][l])) {
                        count++;
                        continue;
                    }
                    if (r < m && "B".equals(arr[i][r])) {
                        count++;
                        continue;
                    }
                    if (t >= 0 && "B".equals(arr[t][j])) {
                        count++;
                        continue;
                    }
                    if (b < n && "B".equals(arr[b][j])) {
                        count++;
                        continue;
                    }
                }
            }
        }
        System.out.print(count);
    }
}
