package com.ayyovei.leetcode.solution.parttwo;

/**
 * @author chenxiaobin
 * @description
 * @create 2018/11/23
 */
public class SingleNumberOne {
    public int solution(int[] nums) {
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            a = a ^ nums[i];
        }
        return a;
    }


    public static void main(String[] args) {
        int[] a = {1,9,3,6,9,8,7,4,0,1,3,9,7,0,6,8,4,2};
        int solution = new SingleNumberOne().solution(a);
        int s = ~solution;
        System.out.println(s);

    }
}
