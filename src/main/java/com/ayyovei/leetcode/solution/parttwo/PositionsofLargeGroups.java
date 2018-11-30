package com.ayyovei.leetcode.solution.parttwo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author chenxiaobin
 * @description
 * @create 2018/11/29
 */
public class PositionsofLargeGroups {

    public List<List<Integer>> largeGroupPositions(String S) {
        ArrayList<List<Integer>> lists = new ArrayList<>();

        char[] chars = S.toCharArray();
        int length = chars.length;
        int count = 0;
        int index = 0;
        for (int i = 0; i < length-1; i++) {
            int j = i + 1;
            if (chars[i] == chars[j]) {
                count++;
                continue;
            }
            if (count >= 2) {
                ArrayList<Integer> integers = new ArrayList<>();
                integers.add(index);
                integers.add(index + ++count);
                lists.add(integers);
                index  = i+1;
                count = 0;
            } else {
                index = i+1;
                count=0;
            }

        }
        return lists;
    }

    public static void main(String[] args) {
        String s = "abcdddeeeeaabbbcd";

        List<List<Integer>> lists = new PositionsofLargeGroups().largeGroupPositions(s);
        System.out.println(lists);
    }
}
