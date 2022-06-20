/**
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
        
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode result= new ListNode(0);
        ListNode head = result;
                
        while(l1 != null|| l2 !=null){   
           result.val = ((l1==null)? 0: l1.val ) +
                        ((l2==null)? 0: l2.val ) +
                        carry;
           carry= result.val/10;
           result.val=result.val%10;
            
           if(l1!=null)l1=l1.next;
           if(l2!=null)l2=l2.next;
           if(l1!=null || l2!=null){
               result.next = new ListNode();
               result = result.next;
           }
        }
        
        if(carry>0){
          
          result.next = new ListNode(carry);   
        }
        
        
        return head;
    }
}
