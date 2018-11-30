package com.ayyovei.leetcode.solution.partone;

import java.util.ArrayList;

/**
 * @author chenxiaobin
 * @description
 * @create 2018/9/30
 */
public class PalindromeNumber {

    public boolean isPalindromeFirst(int x) {
        if (x < 0) {
            return false;
        }
        ArrayList<Integer> integers = new ArrayList<>();
        int sourse = x;
        for (; ; ) {
            int remain = sourse % 10;
            integers.add(remain);
            sourse = sourse / 10;
            if (sourse == 0) {
                break;
            }
        }
        boolean result = true;
        for (int i = 0, j = integers.size() - 1; i < j; i++, j--) {
            int head = integers.get(i);
            int tail = integers.get(j);
            if (head != tail) {
                result = false;
                break;
            }
        }
        return result;

    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int sourse = x;
        int palindrome = 0;
        for (; ; ) {
            palindrome = palindrome * 10 + sourse % 10;
            if ((sourse /= 10) == 0) {
                break;
            }
        }
        return palindrome == x;

    }

    public static void main(String[] args) {
        int x = 1236321;
        boolean palindrome = new PalindromeNumber().isPalindrome(x);
        System.out.println(palindrome);
    }

}
