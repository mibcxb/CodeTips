package com.mibcxb.codetips.samples.questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class P1Q29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 读取棋子数量
        Map<Integer, Integer> map = new HashMap<>(); // 棋子编号->位置
        Set<Integer> set = new HashSet<>();          // 所有被占据的位置
        for (int i = 1; i <= n; i++) {
            int pos = scanner.nextInt();
            map.put(i, pos);
            set.add(pos);
        }

        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            int num = scanner.nextInt();  // 要操作的棋子编号
            int pos = map.get(num);       // 获取棋子当前位置
            if (pos >= 2019) continue;    // 超出棋盘范围，则不操作

            if (!set.contains(pos + 1)) { // 目标位置没有被占
                set.remove(pos);          // 移除当前位置
                set.add(pos + 1);         // 添加新位置
                map.put(num, pos);        // 更新棋子索引
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(map.get(i)).append(' ');
        }
        System.out.println(sb.toString().trim());
    }
}
