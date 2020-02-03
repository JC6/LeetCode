fun hammingDistance(x: Int, y: Int): Int {
    var i = x xor y
    var sum = 0
    while (i > 0) {
        if (i % 2 != 0) {
            sum++
        }
        i /= 2
    }
    return sum
}
