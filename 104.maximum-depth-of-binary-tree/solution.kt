import kotlin.math.max

class Solution {
    fun maxDepth(root: TreeNode?): Int {
        return when (root) {
            null -> 0
            else -> max(maxDepth(root.left), maxDepth(root.right)) + 1
        }
    }
}
