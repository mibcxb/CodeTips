package com.mibcxb.codetips.samples.questions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class P1Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Map<String, List<String>> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ", 2);
            if (parts.length != 2) {
                continue;
            }
            String user = parts[0];
            String game = parts[1];
            List<String> list = map.computeIfAbsent(user, u -> new ArrayList<>());
            if (!list.contains(game)) {
                list.add(game);
            }
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + String.join(" ", entry.getValue()));
        }
    }
}
