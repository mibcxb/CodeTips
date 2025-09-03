package com.mibcxb.codetips.samples.questions;

import java.util.Stack;

public class P1Q13 {
    public static void main(String[] args) {
        System.out.println(maxMatchBrackets("()())"));
    }

    public static String maxMatchBrackets(String str) {
        Stack<Character> stack = new Stack<>();
        int maxIdx = -1;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    maxIdx = i + 1;
                    stack.pop();
                } else {
                    break;
                }
            }
        }
        return maxIdx == -1 ? "" : str.substring(0, maxIdx);
    }
}
