class Solution:
    def findMedianSortedArrays(self, nums1, nums2):
        nums1 = nums1 + nums2
        nums1.sort()
        nums_len = len(nums1)
        if nums_len % 2 == 0:
            return (nums1[nums_len // 2] + nums1[(nums_len - 1) // 2]) / 2
        else:
            return nums1[(nums_len - 1) // 2]
