package org.example.hw04;

import java.util.Deque;
import java.util.LinkedList;

/**
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 */

public class Task02 {
    public static void main(String[] args) {
        String txt = "()";
        System.out.println(check(txt));
    }

    public static boolean check(String st01) {
        Deque<Character> lt01 = new LinkedList<>();
        for (int i = 0; i < st01.length(); i++) {
            if (st01.charAt(i) == '(' ||
                st01.charAt(i) == '{' ||
                st01.charAt(i) == '[') lt01.add(st01.charAt(i));
            else {
                if (lt01.isEmpty()) return false;
                else if (st01.charAt(i) == ')' && lt01.getLast().equals('(')) lt01.pollLast();
                else if (st01.charAt(i) == '}' && lt01.getLast().equals('{')) lt01.pollLast();
                else if (st01.charAt(i) == ']' && lt01.getLast().equals('[')) lt01.pollLast();
                else return false;
            }
        }
        return lt01.isEmpty();
    }
}