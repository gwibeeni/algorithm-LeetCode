class Solution:
    def getDescentPeriods(self, prices: List[int]) -> int:
        price_count = len(prices)
        dp = [1] * price_count

        for index in range(1, price_count):
            if prices[index - 1] - prices[index] == 1:
                dp[index] += dp[index - 1]

        return sum(dp)
