package com.ayyovei.leetcode.solution.parttwo;

import java.util.Arrays;

/**
 * @author chenxiaobin
 * @description
 * @create 2018/11/23
 */
public class SingleNumberThree {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }

        xor = xor & -xor;

        int[] result = new int[2];
        int a = 0;
        int b = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & xor)==0){
                a = a ^ nums[i];
            }else {
                b = b^nums[i];
            }
        }
        result[0] = a;
        result[1] = b;
        return result;
    }


    public static void main(String[] args) {
        int[] ints = {1,3,2,2,5,1};

        int[] ints1 = new SingleNumberThree().singleNumber(ints);

        System.out.println(Arrays.toString(ints1));
    }
}
