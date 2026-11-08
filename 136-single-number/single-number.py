class Solution:
    def singleNumber(self, nums: list[int]) -> int:
        for number in nums:
            if nums.count(number) == 1:
                return number
        return -1