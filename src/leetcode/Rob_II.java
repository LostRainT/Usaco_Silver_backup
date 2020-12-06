package leetcode;

public class Rob_II {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 1};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {
        //特殊情况
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int[] dp = new int[nums.length];

        //只抢第0家到倒数第二家
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length - 1; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }

        int dp1 = dp[nums.length - 2];

        //只抢第1家到最后一家
        dp[0] = 0;
        dp[1] = nums[1];

        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }

        int dp2 = dp[nums.length - 1];

        return Math.max(dp1, dp2);
    }
}
