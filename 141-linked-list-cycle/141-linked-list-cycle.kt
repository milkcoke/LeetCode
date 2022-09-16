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
        var nextNode: ListNode? = head
        val hashSet: MutableSet<ListNode> = mutableSetOf()
        
        while(nextNode != null) {
            if(hashSet.contains(nextNode)) return true
            hashSet.add(nextNode)
            nextNode = nextNode.next
        }
        
        return false
    }
}