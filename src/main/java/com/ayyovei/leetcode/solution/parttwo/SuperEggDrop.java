package com.ayyovei.leetcode.solution.parttwo;

/**
 * @author chenxiaobin
 * @description
 * @create 2018/11/8
 *
 * You are given K eggs, and you have access to a building with N floors from 1 to N.
 *
 * Each egg is identical in function, and if an egg breaks, you cannot drop it again.
 *
 * You know that there exists a floor F with 0 <= F <= N such that any egg dropped at a floor higher than F will break, and any egg dropped at or below floor F will not break.
 *
 * Each move, you may take an egg (if you have an unbroken one) and drop it from any floor X (with 1 <= X <= N).
 *
 * Your goal is to know with certainty what the value of F is.
 *
 * What is the minimum number of moves that you need to know with certainty what F is, regardless of the initial value of F?
 *
 *
 *
 * Example 1:
 *
 * Input: K = 1, N = 2
 * Output: 2
 * Explanation:
 * Drop the egg from floor 1.  If it breaks, we know with certainty that F = 0.
 * Otherwise, drop the egg from floor 2.  If it breaks, we know with certainty that F = 1.
 * If it didn't break, then we know with certainty F = 2.
 * Hence, we needed 2 moves in the worst case to know what F is with certainty.
 * Example 2:
 *
 * Input: K = 2, N = 6
 * Output: 3
 * Example 3:
 *
 * Input: K = 3, N = 14
 * Output: 4
 *
 *
 * Note:
 *
 * 1 <= K <= 100
 * 1 <= N <= 10000
 */
public class SuperEggDrop {
    //k eggs  n floor
    public int superEggDrop(int K, int N) {

        int [][] arr  = new int[K+1][N+1];
        int t = 0;

        while (arr[K][t]<N){
            t++;
            for (int i = 1; i <=K ; i++) {
            arr[i][t] = arr[i-1][t-1] + arr[i][t-1] + 1;
            }

        }

        return t;
     /*   int[][] dp = new int[N + 1][K + 1];
        int m = 0;
        while (dp[m][K] < N) {
            ++m;
            for (int k = 1; k <= K; ++k)
                dp[m][k] = dp[m - 1][k - 1] + dp[m - 1][k] + 1;
        }
        return m;
*/
    }


    public static void main(String[] args) {

        int k = 2;
        boolean source = true;
        System.out.println(source);
        int n = 100;

        int i = new SuperEggDrop().superEggDrop(k, n);
        System.out.println(i);
    }
}
