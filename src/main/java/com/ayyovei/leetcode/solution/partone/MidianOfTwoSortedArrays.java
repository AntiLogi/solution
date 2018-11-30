package com.ayyovei.leetcode.solution.partone;

/**
 * @author chenxiaobin
 * @description
 *
    There are two sorted arrays nums1 and nums2 of size m and n respectively.

    Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

    You may assume nums1 and nums2 cannot be both empty.
    nums1 = [1, 3]
    nums2 = [2]

    The median is 2.0
    nums1 = [1, 2]
    nums2 = [3, 4]

    The median is (2 + 3)/2 = 2.5
 * @create 2018/8/14
 */
public class MidianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1==null){
            return getMedian(nums2);
        }
        if (nums2==null){
            return getMedian(nums1);
        }
        int len1 = nums1.length;
        int len2 = nums2.length;
        int i=0,j=0;
        int newLen = len1 + len2;
        int[] ints = new int[newLen];
        for (int k=0;k<newLen;k++) {
            if(i<len1&&j>=len2){
                ints[k] = nums1[i];
                i++;
            }else  if (i>=len1&&j<len2){
                ints[k] = nums2[j];
                j++;
            }else if (nums1[i]<nums2[j]){
                ints[k]=nums1[i];
                i++;
            }else{
                ints[k]=nums2[j];
                j++;
            }
        }
       return getMedian(ints);
       /* if (newLen%2==1) {
            return ints[newLen/2];
        }else {
            return (ints[newLen/2-1]+ints[newLen/2])/2.0;
        }*/
    }

    public double getMedian(int[] num){
        int len = num.length;
        if (len%2==1) {
            return num[len/2];
        }else {
            return (num[len/2-1]+num[len/2])/2.0;
        }
    }

    public static void main(String[] args) {
        int[]num1 = {1,3,5};
        int[]num2 = {2,4,5};
        double medianSortedArrays = new MidianOfTwoSortedArrays().findMedianSortedArrays(null, num2);
        System.out.println(medianSortedArrays);
    }
}
