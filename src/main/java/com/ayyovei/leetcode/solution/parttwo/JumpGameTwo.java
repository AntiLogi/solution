package com.ayyovei.leetcode.solution.parttwo;

import org.springframework.util.Assert;

import java.util.LinkedList;

/**
 * @author chenxiaobin
 * @description
 * @create 2018/11/27
 */
public class JumpGameTwo {

    public int jump(int[] nums) {
        int jumps = 0, curEnd = 0, curFarthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {

            curFarthest = Math.max(curFarthest, i + nums[i]);
            if(nums[i]==0&&curFarthest==i){
                jumps=0;
                break;
            }
            if (i == curEnd) {

                jumps++;
                curEnd = curFarthest;
            }
        }
        return jumps;
    }


    public static void main(String[] args) {
        int [] test = {2,3,1,0,4};
        System.out.println(new JumpGameTwo().jump(test));
    }
}
