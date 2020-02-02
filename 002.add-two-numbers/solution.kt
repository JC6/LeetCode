fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    val result = ListNode(l1?.`val`!! + l2?.`val`!!)
    var ln = result
    var l1Next = l1.next
    var l2Next = l2.next
    while (l1Next != null || l2Next != null) {
        if (l1Next == null) {
            l1Next = ListNode(0)
        }
        if (l2Next == null) {
            l2Next = ListNode(0)
        }
        ln.next = ListNode(l1Next.`val` + l2Next.`val`)
        ln = ln.next!!
        l1Next = l1Next.next
        l2Next = l2Next.next
    }
    ln = result
    var lnVal = result.`val`
    var lnNext = result.next
    while (lnNext != null) {
        if (lnVal > 9) {
            ln.`val` = lnVal - 10
            lnNext.`val` += 1
        }
        lnVal = lnNext.`val`
        ln = lnNext
        lnNext = lnNext.next
    }
    if (lnVal > 9) {
        ln.`val` = lnVal - 10
        ln.next = ListNode(1)
    }
    return result
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
