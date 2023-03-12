package org.example.hw04;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Вывести список на экран в перевернутом виде (без массивов и ArrayList)
 * Пример:
 * 1 -> 2 -> 3 -> 4
 * Вывод:
 * 4 -> 3 -> 2 -> 1
 */

public class Task01 {
    public static void main(String[] args) {
        LinkedList<Integer> lt01 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        for (int i = 0; i < lt01.size() - 1; i++) {
            int trans = lt01.pollLast();
            lt01.add(i, trans);
        }
        System.out.println(lt01);
    }
}