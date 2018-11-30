package com.ayyovei.leetcode.solution.parttwo;

import java.util.*;

/**
 * @author chenxiaobin
 * @description
 * @create 2018/11/23
 */
public class LetterCasePermutation {
    public List<String> letterCasePermutation(String S) {
        if(S==null){
            return new LinkedList<>();
        }
        String s = S.toLowerCase();
        LinkedList<String> strings = new LinkedList<>();
        strings.offer(s);
        for (int i = 0; i <S.length() ; i++) {
            if (Character.isDigit(S.charAt(i))){
                continue;
            }
            int size = strings.size();
            for (int j = 0; j <size; j++) {
                String pop = strings.poll();
                char[] chars = pop.toCharArray();
                String s1 = String.valueOf(chars);
                strings.offer(s1);
                chars[i] = Character.toUpperCase(chars[i]);
                String s2 = String.valueOf(chars);
                strings.offer(s2);


            }


        }

        return strings;
    }

    public static void main(String[] args) {
        String s = "";
        List<String> strings = new LetterCasePermutation().letterCasePermutation(s);
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

    }
}
