package com.ayyovei.leetcode.solution.partone;

import java.util.HashMap;

/**
 * @author chenxiaobin
 * @description
 * Given a string, find the length of the longest substring without repeating characters.
 * Examples:
 *
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 *M
 * Given "bbbbb", the answer is "b", with the length of 1.
 *
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring,
 *
 * "pwke" is a subsequence and not a substring.
 * @create 2018/8/14
 */
public class LongestSubstring {
    /**
     * Runtime: 28 ms
     * beats 83.58% permissions of java
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int length = s.length();
        int maxLength = 0;
        int index = 0;
        int tempLength  = 0;
        for (int i = 0; i <length ; i++) {
            char c = s.charAt(i);
            Integer indexOfC;
            if ((indexOfC=map.get(c))==null||indexOfC<index){
                map.put(c,i);
                tempLength++;
                if(tempLength > maxLength){
                    maxLength = tempLength;
                }
                continue;
            }

            index = indexOfC+1;
            tempLength = i - indexOfC;
            map.put(c,i);
        }


        return maxLength;
    }


    public static void main(String[] args) {
       // String s = "tmmzuxt";
        String s = "abcabcaa";
        int i = new LongestSubstring().lengthOfLongestSubstring(s);
        System.out.println(i);
    }
}
