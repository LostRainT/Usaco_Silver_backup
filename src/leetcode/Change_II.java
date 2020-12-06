package leetcode;

public class Change_II {
    public static void main(String[] args) {
        int amount = 5;
        int[] coins = {};
        System.out.println(change(amount, coins));
    }

    public static int change(int amount, int[] coins) {
        int[] dp_arr = new int[amount + 1];
        dp_arr[0] = 1;
        for (int i = 1; i < dp_arr.length; i++) {
            dp_arr[i] = 0;
        }
        return dp(coins, amount, dp_arr)[amount];

    }

    public static int[] dp(int coins[], int amount, int[] dp_arr) {
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j < dp_arr.length; j++) {
                dp_arr[j] += dp_arr[j - coins[i]];
            }
        }
        return dp_arr;
    }
}
