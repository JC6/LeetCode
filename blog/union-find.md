# 并查集练习

[最长连续序列](https://leetcode-cn.com/problems/longest-consecutive-sequence)(LeetCode 128)

给定一个未排序的整数数组，找出最长连续序列的长度。

例如，

给出 [100, 4, 200, 1, 3, 2]，

这个最长的连续序列是 [1, 2, 3, 4]。返回所求长度： 4。

要求你的算法复杂度为 O(n)。

### 初步实现

```python
class Solution:
    def longestConsecutive(self, nums):
        if len(nums)<1:
            return 0
        nums.sort()
        nl=[]
        nl.append([nums[0]])
        for i in range(1, len(nums)):
            if nums[i]==nums[i-1]:
                continue
            elif nums[i]!=nums[i-1]+1:
                nl.append([nums[i]])
            else:
                nl[len(nl)-1].append(nums[i])
        max = 0
        for nn in nl:
            if len(nn)>max:
                max = len(nn)
        return max
```
