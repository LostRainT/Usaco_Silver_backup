package leetcode;

public class Stock_II {
    public static void main(String[] args) {
        int[] prices = {1, 7, 4, 2};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int buyday = 0;
        int sellday = 0;
        int result = 0;

        if (prices.length == 1 || prices.length == 0) return 0;

        for (int i = 0; i < prices.length; i++) {
            buyday = findTheFirstSmallestPriceDay(prices, i);
            sellday = findTheNextLargestPriceDay(prices, buyday + 1);
            if (buyday + 1 >= prices.length) sellday = buyday;
            if (prices[sellday] - prices[buyday] >= 0) {
                result += prices[sellday] - prices[buyday];
                i = sellday;
            }
        }

        return result;
    }

    private static int findTheFirstSmallestPriceDay(int[] prices, int currentDay) {
        if (currentDay == 0 && prices[currentDay + 1] > prices[currentDay]) {
            return 0;
        }

        for (int i = currentDay; i < prices.length; i++) {
            if (i + 1 >= prices.length) return currentDay;
            if (i - 1 < 0) continue;
            if (prices[i] <= prices[i - 1] && prices[i] < prices[i + 1]) {
                return i;
            }
        }
        return currentDay;
    }

    private static int findTheNextLargestPriceDay(int[] prices, int currentDay) {
        for (int i = currentDay; i < prices.length; i++) {
            if (i + 1 >= prices.length) return i;
            if (i - 1 < 0) continue;
            if (prices[i] >= prices[i - 1] && prices[i] > prices[i + 1]) {
                return i;
            }
        }
        return currentDay;
    }

}