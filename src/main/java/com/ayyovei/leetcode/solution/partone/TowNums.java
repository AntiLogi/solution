package com.ayyovei.leetcode.solution.partone;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author chenxiaobin
 * @description
 * @create 2018/8/3
 */
public class TowNums {

    /**
     * Given an array of integers, return indices of the two numbers such that they add up to a specific
     * target.
     *You may assume that each input would have exactly one solution, and you may not use the
     * same element twice.
     *
     * Runtime: 5 ms
     * beats 61.04% of java submissions
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer result = map.get(nums[i]);
            if (result !=null){
                int [] found = new int[2];
                found[0] = result;
                found[1] = i;
                return found;
            }else {
                int need = target - nums[i];
                map.put(need,i);
            }

        }
        return null;
    }

    public static void main(String[] args) {
        int[]  nums = {2, 7, 11, 15};
        int target = 6;
        int[] ints = new TowNums().twoSum(nums, target);

        System.out.println(Arrays.toString(ints));
    }
}
