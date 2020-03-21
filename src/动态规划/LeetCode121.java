package 动态规划;

public class LeetCode121 {
    public int maxProfit(int[] prices) {
        int maxCur = 0, maxSofar = 0;
        for (int i = 1; i < prices.length; i++) {
            maxCur = Math.max(0, maxCur += prices[i] - prices[i - 1]);
            maxSofar = Math.max(maxCur, maxSofar);
        }
        return maxSofar;
    }

}
