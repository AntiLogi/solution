package com.ayyovei.leetcode.solution.partone;

/**
 * @author chenxiaobin
 * @description
 * @create 2018/10/22
 */
public class StringsToInteger {

    public int myAtoi(String str) {
        boolean isMinus = false;

        char[] chars = str.toCharArray();
        int i = 0;
        int result = 0;
        while (true){
            char aChar = chars[i];
            i++;
            if(aChar==' '){
                continue;
            }
            if(aChar=='+'){
            break;
            }
            if(aChar == '-'){
                isMinus = true;
                break;
            }
            if(aChar==0){
                continue;
            }
            if(aChar<=9){
            result = aChar;
            break;
            }
            return 0;
        }
        for (; i <chars.length ; i++) {

            char aChar = chars[i];
            if (aChar>9){
            break;
            }
            if(result==0){
                continue;
            }
            if(result<=9){
                if (isMinus){

                   int s =  (Integer.MIN_VALUE+aChar)/ result;
                   if(Math.abs(s)<result){
                       return Integer.MIN_VALUE;
                   }else {
                       result = result*10 + aChar;
                   }
                }else{
                    int s = (Integer.MAX_VALUE-aChar)/10;
                    if(s<result){
                        return Integer.MAX_VALUE;
                    }else {
                        result = result * 10 + aChar;
                    }
                }

            }else {
                break;
            }


        }
        if(result == 0){
            return result;
        }
        if (isMinus){
            result= result - 2*result;
        }

        return result;
    }
}


/**
 Input: "-91283472332"
 Output: -2147483648
         -2147483649

 */