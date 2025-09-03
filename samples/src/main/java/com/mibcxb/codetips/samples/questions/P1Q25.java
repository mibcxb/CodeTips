package com.mibcxb.codetips.samples.questions;

import java.util.Stack;

public class P1Q25 {
    public static void main(String[] args) {

    }

    public static int matchBrackets(String s) {
        Stack<Character> stack = new Stack<>();
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }
            if ((c == ']' && stack.peek() == '[') || (c == '}' && stack.peek() == '{')) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.size();
    }
}
