package com.crack_byte;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedBrackets {
    public static Map<Character, Character> map = new HashMap<>(4);

    static {
        map.put('[', ']');
        map.put('(', ')');
        map.put('<', '>');
        map.put('{', '}');
    }

    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        System.out.println(isBalanced("({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])" +
                "({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])" +
                "({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])" +
                "({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])" +
                "({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])" +
                "({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])" +
                "({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])" +
                "({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])" +
                "({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])" +
                "({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])" +
                "({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])" +
                "({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])" +
                "({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])({[])" +
                "({[])({[])"));
        System.out.println(System.currentTimeMillis() - l);
    }

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (stack.empty()) {
                stack.push(c);
            } else {
                if (isOpen(c)) {
                    stack.push(c);
                } else {
                    Character character = map.get(stack.peek());
                    if (character != null && character.equals(c)) {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                }
            }
        }
        return stack.empty();
    }

    public static boolean isOpen(char c) {
        return map.containsKey(c);
    }
}
