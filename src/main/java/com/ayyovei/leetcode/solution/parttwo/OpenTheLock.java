package com.ayyovei.leetcode.solution.parttwo;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author chenxiaobin
 * @description
 * @create 2018/11/28
 */

public class OpenTheLock {
    public int openLock(String[] deadends, String target) {
        String start = "0000";
        List<String> deadendsList = Arrays.asList(deadends);
        LinkedList<String> list = new LinkedList<>();
        Set<String> set = new HashSet<>();
       // set.addAll(deadendsList);
        if(deadendsList.contains(start)){
            return -1;
        }
        int result = 0;
        list.add(start);
        set.add(start);

        while (!list.isEmpty()){
            int size = list. size();
        for (int i = 0; i < size; i++) {
            String poll = list.poll();
            boolean direction = true;
            long s2 = System.currentTimeMillis();
            for (int j = 0; j < 8; j++) {
                if(j>=4){
                    direction  =false;
                }
                String s = moveWheel(poll, j, direction);
                if(s.equals(target)){
                    result++;
                    return result;
                }

                if (deadendsList.contains(s)) {
                    continue;
                }


                if(set.contains(s)){
                    continue;
                }

                set.add(s);
                list.add(s);

            }
            long e2 = System.currentTimeMillis();
            System.out.println("222..."+(e2-s2));
        }

        result++;
        }
        return -1;
    }
    public String moveWheel(String poll,int i,boolean direction){
        char[] chars = poll.toCharArray();
        int num  = Character.getNumericValue(chars[i%4]);
        int move = -1;
        if(direction){
            move =   moveWheelUp( num);
        }else {
            move =   moveWheelDown( num);
        }
        chars[i%4] =(char)(move + '0');
        String s = String.valueOf(chars);
        return s;
    }
    public int moveWheelUp(int num){
        return (num + 1) % 10;
    }
    public int moveWheelDown(int num){
        return (num + 9) % 10;
    }


    public static void main(String[] args) {
       String [] deadends1 = {"0201","0101","0102","1212","2002"};
        String target1 = "0202";
        String [] deadends2 = {"8888"};
        String target2 = "0009";

        String [] deadends3 = {"8887","8889","8878","8898","8788","8988","7888","9888"};
        String target3 = "8888";
        System.out.println(new OpenTheLock().openLock(deadends1, target1));
    }
}
