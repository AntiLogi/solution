package com.ayyovei.leetcode.solution.parttwo;

import java.util.Arrays;

/**
 * @author chenxiaobin
 * @description
 * @create 2018/11/6
 */
public class Kmp {


    public int method(String source,String pattern){
        int len = source.length();
        int[] next = getNext(pattern);
        int i = 0;
        int j = 0;
        while (i<len-1) {
            if (j==-1||source.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }else {
                j = next[j];
            }
            if (j==pattern.length()){
                return i-j;
            }
        }
        return -1;
    }

    public int [] getNext(String pattern){

        char[] chars = pattern.toCharArray();

        int len = chars.length;
        int next[] = new int[len];
        int k = -1;
        int j = 0;
        next[j] = k;
        while (j<len-1){

            if( k==-1 || chars[j]==chars[k]){
                k++;
                j++;
                next[j] = k;

            }else{
                k = next[k];
            }
        }

        return next;

    }

    public static void main(String[] args) {


        String s = "12s3";
        int i = Integer.parseInt(s);
        System.out.println(i);

    }


}
