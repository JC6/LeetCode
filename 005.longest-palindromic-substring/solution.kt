fun longestPalindrome(s: String): String {
    var max = ""
    for (i in s.indices) {
        for (j in i..s.lastIndex) {
            if (j - i + 1 > max.length) {
                val substring = s.substring(i..j)
                if (substring == substring.reversed()) {
                    max = substring
                }
            }
        }
    }
    return max
}
