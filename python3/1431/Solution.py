class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        answer = []

        min_required_candy = max(candies) - extraCandies

        for candy in candies:
            answer.append(candy >= min_required_candy)

        return answer
