class Solution:
    def missingNumber(self, nums: list[int]) -> int:
        n = len(nums)
        s = n*(n+1)//2
        m = sum(nums)
        return s - m
