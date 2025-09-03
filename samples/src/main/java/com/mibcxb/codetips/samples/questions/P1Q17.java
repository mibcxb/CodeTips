package com.mibcxb.codetips.samples.questions;

public class P1Q17 {
    public static void main(String[] args) {
        System.out.println("PrimeSum: " + calcPrimeSum("1234"));
    }

    public static int calcPrimeSum(String numStr) {
        int primeSum = 0;
        // 比如 "1_2_3_4" 有 3 个空格可以插入 '+'，所以共有 2^3 = 8 种情况
        int l = numStr.length();
        int n = 1 << (l - 1);
        for (int mask = 1; mask <= n; mask++) {
            StringBuilder exp = new StringBuilder();
            int val = 0;
            int sum = 0;
            for (int i = 0; i < l; i++) {
                exp.append(numStr.charAt(i));
                val = val * 10 + (numStr.charAt(i) - '0');
                if (i < l - 1 && (mask & (1 << i)) != 0) {
                    exp.append('+');
                    sum += val;
                    val = 0;
                }
            }
            sum += val;
            System.out.println("EXP: " + exp + " = " + sum);
            if (isPrimeNum(sum)) {
                primeSum += sum;
            }
        }
        return primeSum;
    }

    public static boolean isPrimeNum(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        double sqrt = Math.sqrt(num);
        for (int i = 5; i * i <= sqrt; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
