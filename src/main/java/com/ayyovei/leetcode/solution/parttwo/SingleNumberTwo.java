package com.ayyovei.leetcode.solution.parttwo;

/**
 * @author chenxiaobin
 * @description
 * @create 2018/11/22
 */
public class SingleNumberTwo {

    public int solution(int[] nums) {

        int a = 0,b=0;
        for (int i = 0; i <nums.length ; i++) {
            a = a^nums[i] & ~b;
            b = b^nums[i] & ~a;
        }

        return a;

    }

    public static void main(String[] args) {

        int[] ints = {0,1,0,1,0,1,99};

        System.out.println(new SingleNumberTwo().solution(ints));


    }
}
