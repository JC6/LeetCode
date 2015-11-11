class Solution(object):
    def twoSum(self, nums, target):
        map = {}
        for i, v in enumerate(nums):
            if target - v in map:
                return map[target - v] + 1, i + 1
            map[v] = i
