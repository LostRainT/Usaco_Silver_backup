package leetcode;

public class ClimbStairs{
    public static void main(String[] args) {
        System.out.println(climbStairs(10));
    }
    public static int climbStairs(int N){
        int[] dp = new int[N+1];
        dp[1] = 1;
        dp[2] = 2;

        if(N == 1) return 1;
        else if ( N == 2) return 2;

        for(int i = 3; i <= N ; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[N];
    }
}