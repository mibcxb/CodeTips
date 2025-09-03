package com.mibcxb.codetips.samples.questions;
import java.util.HashMap;
import java.util.Scanner;

public class P1Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(minDeletion(nums, k));
    }

    public static int minDeletion(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int deletions = 0;

        // 统计每个数字出现的频率
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // 处理每个数字
        for (int num : nums) {
            if (!freq.containsKey(num)) continue;

            int complement = k - num;
            if (freq.containsKey(complement)) {
                // 处理数字对
                if (num == complement) {
                    // 相同数字的情况，需要保留最多一个
                    deletions += freq.get(num) - 1;
                    freq.remove(num);
                } else {
                    // 不同数字的情况，删除出现次数较少的那个
                    if (freq.get(num) > freq.get(complement)) {
                        deletions += freq.get(complement);
                        freq.remove(complement);
                    }
                }
            }
        }

        return deletions;
    }
}
