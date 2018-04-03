class Solution:
    def countSmaller(self, nums):
        counts = []
        for i in range(0, len(nums)):
            right = nums[i: len(nums)]
            right.sort()
            counts.append(right.index(nums[i]))
        return counts
