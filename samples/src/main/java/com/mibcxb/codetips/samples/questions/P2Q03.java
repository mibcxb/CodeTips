package com.mibcxb.codetips.samples.questions;

import java.util.Arrays;
import java.util.Scanner;

public class P2Q03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] triangle1 = new double[3];
        double[] triangle2 = new double[3];
        for (int i = 0; i < 3; i++) {
            triangle1[i] = scanner.nextDouble();
        }
        for (int i = 0; i < 3; i++) {
            triangle2[i] = scanner.nextDouble();
        }
        Arrays.sort(triangle1);
        Arrays.sort(triangle2);

        if (!isTriangle(triangle1)) {
            System.out.println("第一个三角形不合法，不是三角形");
        } else if (!isSimilar(triangle1, triangle2)) {
            System.out.println("两个三角形不相似");
        } else {
            System.out.println("两个三角形是相似三角形");
        }
    }

    // 判断三边能否组成三角形
    public static boolean isTriangle(double[] sides) {
        return sides[0] + sides[1] > sides[2] &&
                sides[0] + sides[2] > sides[1] &&
                sides[1] + sides[2] > sides[0];
    }

    // 判断两个三角形是否相似（对应边成比例）
    public static boolean isSimilar(double[] triangle1, double[] triangle2) {
        double ratio1 = triangle1[0] / triangle2[0];
        double ratio2 = triangle1[1] / triangle2[1];
        double ratio3 = triangle1[2] / triangle2[2];
        // 使用一个精度范围判断比例是否相等（避免浮点误差）
        return Math.abs(ratio1 - ratio2) < 1e-9 && Math.abs(ratio2 - ratio3) < 1e-9;
    }
}
