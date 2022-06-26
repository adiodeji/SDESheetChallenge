/**
Given the head of a linked list, remove the nth node from the end of the list and return its head.
Example 1:
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       
        ListNode res = head;
        int size=0;
        while(head!=null){
            size++;
            head=head.next;
        }
        
        
        if(size==n){
            res=res.next;
            return res;
        }
        
        int size1=0;
        head=res;
        
        while(head.next!=null){
            size1++;
            if(size1==size-n){
                head.next=head.next.next;      
                break;
            }
            head=head.next;
        }
        return res;
    }
}
