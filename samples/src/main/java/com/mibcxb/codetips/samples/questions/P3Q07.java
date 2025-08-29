package com.mibcxb.codetips.samples.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P3Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 节点2~n的父节点编号
        int[] parents = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        // 节点数量（包含根节点1
        int n = parents.length + 1;
        // 树的邻接表表示
        List<List<Integer>> tree = new ArrayList<>();
        for (int i = 0; i <= n; i++) { // 这里使用 i <= n 是因为节点从1开始编号，多一个可以避免越界
            tree.add(new ArrayList<>());
        }
        for (int i = 0; i < parents.length; i++) {
            int number = i + 2; // 节点编号从2开始
            int parent = parents[i];
            tree.get(parent).add(number);
        }
        // 读取染色字符串
        String colorStr = sc.nextLine().trim();
        int[] colors = new int[colorStr.length() + 1]; // 同样为了避免越界
        for (int i = 1; i <= colorStr.length(); i++) {
            colors[i] = colorStr.charAt(i - 1) == 'R' ? 1 : 0;
        }
        // 创建答案数组并进行DFS计算
        int[] counts = new int[colors.length];
        dfs(1, tree, colors, counts);
        // 处理查询
        int q = sc.nextInt();
        while (q-- > 0) {
            System.out.println(counts[sc.nextInt()]);
        }
    }

    private static void dfs(int i, List<List<Integer>> tree, int[] colors, int[] counts) {
        int total = colors[i]; // 当前节点的红色状态
        for (int child : tree.get(i)) {
            dfs(child, tree, colors, counts); // 递归处理子节点
            total += counts[child]; // 累加子树的红色节点数量
        }
        counts[i] = total;
    }
}
