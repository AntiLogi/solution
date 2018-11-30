package com.ayyovei.leetcode.solution.partone;

import java.util.HashMap;

/**
 * @author chenxiaobin
 * @description
 *  The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 *  (you may want to display this pattern in a fixed font for better legibility)
 *  P   A   H   N
 *  A P L S I I G
 *  Y   I   R
 *And then read line by line: "PAHNAPLSIIGYIR"
 *
 * Write the code that will take a string and make this conversion given a number of rows:
 * string convert(string s, int numRows);
 *Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 * @create 2018/8/15
 */
public class ZigZagConversion {
    /**
     * Runtime: 37 ms
     * beats 40.22% permissions of Java
     * @param s
     * @param numRows
     * @return
     */
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows >= s.length()){
            return s;
        }
        HashMap<Integer, StringBuffer> map = new HashMap<>();
        for (int i = 0; i < numRows; i++) {
            map.put(i,new StringBuffer());
        }
        int numRow = 0;
        boolean down = true;
        for (char c: s.toCharArray()
             ) {
            map.get(numRow).append(c);
            if (numRow==0){
                down = true;
            }else if(numRow == numRows-1){
                down =false;
            }
            numRow+=down==true?1:-1;
        }
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < numRows; i++) {
            result.append(map.get(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        String convert = new ZigZagConversion().convert(s, numRows);
        System.out.println(convert);
    }


}
