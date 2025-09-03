package com.mibcxb.codetips.samples.questions;

import java.util.Stack;

public class P1Q28 {
    public static void main(String[] args) {

    }

    public static int countBrackets(String s) {
        int count = 0;
        Stack<Character> stack = new Stack<>();
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == '[' || c == '{') {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                if ((c == ']' && stack.peek() == '{') || (c == '}' && stack.peek() == '[')) {
                    count++;
                }
                stack.pop();
            }
        }
        return count;
    }
}
