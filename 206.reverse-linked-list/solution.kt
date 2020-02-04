fun reverseList(head: ListNode?): ListNode? {
    var prev: ListNode? = null
    var next = head
    while (next != null) {
        val temp = next.next
        next.next = prev
        prev = next
        next = temp
    }
    return prev
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
