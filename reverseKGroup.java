/**



Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

You may not alter the values in the list's nodes, only nodes themselves may be changed.





 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        
        if(head == null||head.next == null) return head;
        
     
        
    ListNode dummyHead = new ListNode(0);
    dummyHead.next = head;
    
    ListNode pre;
    ListNode cur;
    ListNode nex;
    
    int length=0;
    pre=head;
    while(pre!=null){
        length++;
        pre=pre.next;
    }
    pre = dummyHead;
        
    while(length >= k) {
        cur = pre.next;
        nex = cur.next;
        for(int i=1;i<k;i++) {
            cur.next = nex.next;
            nex.next = pre.next;
            pre.next = nex;
            nex = cur.next;
        }
        pre = cur;
        length -= k;
    }
        
    return dummyHead.next;
        
    }
}
