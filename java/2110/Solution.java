import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public long getDescentPeriods(int[] prices) {
        int priceCount = prices.length;
        long[] dp = new long[priceCount];
        Arrays.fill(dp, 1);

        IntStream.range(1, priceCount)
            .forEach(index -> {
                if (prices[index - 1] - prices[index] == 1) {
                    dp[index] += dp[index - 1];
                }
            });

        return Arrays.stream(dp).sum();
    }
}
