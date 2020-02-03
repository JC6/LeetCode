fun removeDuplicates(nums: IntArray): Int {
    var i = 0
    nums.forEach {
        if (it != nums[i]) {
            i++
            nums[i] = it
        }
    }
    return i + 1
}
