class Solution:
    def repeatedNTimes(self, nums: List[int]) -> int:
        checked_nums = set()

        for num in nums:
            if num in checked_nums:
                return num

            checked_nums.add(num)

        return -1
