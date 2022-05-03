class Solution:
    def balancedStringSplit(self, s: str) -> int:
        answer = 0
        bias = 0

        for letter in s:
            if letter == 'L':
                bias -= 1
            else:
                bias += 1

            if bias == 0:
                answer += 1

        return answer
