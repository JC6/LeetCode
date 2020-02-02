import java.util.*

fun isValid(s: String): Boolean {
    val stack = Stack<Char>()
    s.forEach {
        when (it) {
            '(', '{', '[' -> stack.push(it)
            ')' -> if (stack.empty() || stack.pop() != '(') return false
            '}' -> if (stack.empty() || stack.pop() != '{') return false
            ']' -> if (stack.empty() || stack.pop() != '[') return false
        }
    }
    return stack.empty()
}
