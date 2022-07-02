/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        ListNode a= headA;
        ListNode b= headB;
        
        while( a!=b){
            a=a==null?headB:a.next;
            b=b==null?headA:b.next;
        }
   
        
        
        return a;
        
        
        /*O(n) space
        HashSet<ListNode> l = new HashSet<ListNode>();
        while(headA!=null){
            l.add(headA);
            headA=headA.next;
        }
        
        while(headB!=null){
            if(l.contains(headB))return headB;
            headB=headB.next;
        }
        
        return null;
        */
    }
}
