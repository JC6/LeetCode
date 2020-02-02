import kotlin.math.max

fun lengthOfLongestSubstring(s: String): Int {
    var result = 0
    for (i in s.indices) {
        val list = mutableListOf<Char>()
        for (j in i until s.length) {
            if (list.contains(s[j])) {
                break
            } else {
                list.add(s[j])
                result = max(result, list.size)
            }
        }
    }
    return result
}
