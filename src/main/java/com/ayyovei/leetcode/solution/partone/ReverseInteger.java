package com.ayyovei.leetcode.solution.partone;

/**
 * @author chenxiaobin
 * @description
 * @create 2018/8/16
 */
public class ReverseInteger {
    public int reverse(int x) {
        int num = x;
        if (num>Integer.MAX_VALUE||num<Integer.MIN_VALUE){
            return 0;
        }
        boolean isMinus = false;
        if (x<0){
            num = -x;
            isMinus = true;
        }
        StringBuffer s = new StringBuffer().append(num);
        StringBuffer reverse = s.reverse();
        long i = Long.parseLong(reverse.toString());
        if (i>Integer.MAX_VALUE||i<Integer.MIN_VALUE){
            return 0;
        }
       long result =  isMinus==true?-i:i;
        return  (int)result;
    }

    public static void main(String[] args) {
        int x = 1534236469;
        System.out.println(new ReverseInteger().reverse(x));

    }
}
