import kotlin.math.max
import kotlin.math.min

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val size = nums1.size + nums2.size
    return if (size % 2 == 0) {
        (findK(nums1, nums2, size / 2) + findK(nums1, nums2, size / 2 + 1)) / 2.0
    } else {
        findK(nums1, nums2, size / 2 + 1).toDouble()
    }
}

fun findK(nums1: IntArray, nums2: IntArray, k: Int): Int {
    var i = max(0, k - nums2.size)
    var j = min(k, nums1.size)
    while (i < j) {
        val m = (i + j) / 2
        if (nums1[m] < nums2[k - m - 1]) {
            i = m + 1
        } else {
            j = m
        }
    }
    return when (i) {
        0 -> nums2[k - i - 1]
        k -> nums1[i - 1]
        else -> max(nums1[i - 1], nums2[k - i - 1])
    }
}
