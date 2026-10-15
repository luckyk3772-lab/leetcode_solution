class Solution(object):
    def sortArrayByParityII(self, nums):
        even=[x for x in nums if x % 2 == 0]
        odd=[x for x in nums if x % 2 !=0]
        nums[::2]=even
        nums[1::2]=odd
        return nums
        