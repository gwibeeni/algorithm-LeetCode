class Solution:
    def countOdds(self, low: int, high: int) -> int:
        numCount = high - low + 1
        oddCount = numCount // 2

        if (
            numCount % 2 != 0 and
            low % 2 != 0
        ):
            oddCount += 1

        return oddCount
