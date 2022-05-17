import re

class Solution:
    def sumGame(self, num: str) -> bool:
        blank_count = num.count('?')

        if blank_count % 2 != 0:
            return True

        leftNum = num[:len(num)//2]
        rightNum = num[len(num)//2:]

        return self.isNotMatchable(leftNum, rightNum);

    def isNotMatchable(self, num1: str, num2: str) -> bool:
        return self.digitOnlySum(self.replaceTwoBlankWithNine(num1)) != self.digitOnlySum(self.replaceTwoBlankWithNine(num2));

    def digitOnlySum(self, num: str) -> int:
        digit_sum = 0

        for char in num:
            if char.isdigit():
                digit_sum += int(char)

        return digit_sum

    def replaceTwoBlankWithNine(self, num: str) -> str:
        return re.sub(r"\?(\d*)\?", r"9\1", num)
