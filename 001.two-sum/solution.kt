fun twoSum(nums: IntArray, target: Int): IntArray {
    for (i in nums.indices) {
        for (j in nums.indices) {
            if (nums[i] + nums[j] == target && i != j) {
                return intArrayOf(i, j)
            }
        }
    }
    return intArrayOf()
}
