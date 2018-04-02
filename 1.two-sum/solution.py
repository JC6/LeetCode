class Solution:
    def twoSum(self, nums, target):
        di = dict()
        for i, v in enumerate(nums):
            if target - v not in di:
                di[v] = i
            else:
                return di[target - v], i
