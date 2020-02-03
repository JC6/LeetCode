fun mergeTrees(t1: TreeNode?, t2: TreeNode?): TreeNode? {
    return when {
        t1 == null -> t2
        t2 == null -> t1
        else -> TreeNode(t1.`val` + t2.`val`).apply {
            left = mergeTrees(t1.left, t2.left)
            right = mergeTrees(t1.right, t2.right)
        }
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}
