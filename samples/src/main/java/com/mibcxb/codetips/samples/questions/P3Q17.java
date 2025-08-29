package com.mibcxb.codetips.samples.questions;

public class P3Q17 {
    public static void main(String[] args) {
        System.out.println(createMultiples3("666"));
        System.out.println(createMultiples3("8914151"));
    }

    public static String createMultiples3(String str) {
        int[] cnt = new int[10]; // 统计0-9在字符串中出现的次数
        long sum = 0;
        int num;
        for (char ch : str.toCharArray()) {
            num = ch - '0';
            cnt[num]++;
            sum += num;
        }

        int mod = (int) (sum % 3);
        if (mod == 1) {
            if (!removeNum(cnt, new int[]{1, 4, 7}, 1)) {
                if (!removeNum(cnt, new int[]{2, 5, 8}, 2)) {
                    return "-1";
                }
            }
        } else if (mod == 2) {
            if (!removeNum(cnt, new int[]{2, 5, 8}, 1)) {
                if (!removeNum(cnt, new int[]{1, 4, 7}, 2)) {
                    return "-1";
                }
            }
        }

        int total = 0;
        StringBuilder sb = new StringBuilder();
        for (int d = 9; d >= 0; d--) {
            total += cnt[d];
            for (int k = 0; k < cnt[d]; k++) {
                sb.append((char) ('0' + d));
            }
        }
        if (total == 0) {
            return "-1";
        }
        if (sb.charAt(0) == '0') { // 若全为 0，输出单个 "0"
            return "0";
        } else {
            return sb.toString();
        }
    }

    private static boolean removeNum(int[] cnt, int[] choices, int need) {
        for (int choice : choices) {
            while (need > 0 && cnt[choice] > 0) {
                cnt[choice]--;
                need--;
            }
            if (need == 0) return true;
        }
        return false;
    }
}
