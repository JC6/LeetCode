fun rotate(nums: IntArray, k: Int): Unit {
    val realK = k % nums.size
    val kk = mutableListOf<Int>()
    for (i in realK - 1 downTo 0) {
        kk.add(nums[nums.lastIndex - i])
    }
    for (i in nums.lastIndex downTo realK) {
        nums[i] = nums[i - realK]
    }
    for (i in 0 until realK) {
        nums[i] = kk[i]
    }
}
