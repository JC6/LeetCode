fun invertTree(root: TreeNode?): TreeNode? {
    return root?.apply {
        val tmp = left
        left = invertTree(right)
        right = invertTree(tmp)
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}
