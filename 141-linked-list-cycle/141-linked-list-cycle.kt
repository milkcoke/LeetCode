/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        var slow_ptr = head
        var fast_ptr = head

        while(slow_ptr != null && fast_ptr != null && fast_ptr.next != null) {
            slow_ptr = slow_ptr.next
            fast_ptr = fast_ptr.next!!.next
            if (slow_ptr == fast_ptr) return true
        }
        
        return false
    }
}