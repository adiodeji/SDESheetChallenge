import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

    class LinkedListNode {
        int data;
        LinkedListNode next;
        
        public LinkedListNode(int data) {
            this.data = data;
        }
    }

*****************************************************************/


public class Solution {
    static LinkedListNode addTwoNumbers(LinkedListNode l1, LinkedListNode l2) {
        
         int carry = 0;
        LinkedListNode result= new LinkedListNode(0);
        LinkedListNode head = result;
                
        while(l1 != null|| l2 !=null){   
           result.data = ((l1==null)? 0: l1.data ) +
                        ((l2==null)? 0: l2.data ) +
                        carry;
           carry= result.data/10;
           result.data=result.data%10;
            
           if(l1!=null)l1=l1.next;
           if(l2!=null)l2=l2.next;
           if(l1!=null || l2!=null){
               result.next = new LinkedListNode(0);
               result = result.next;
           }
        }
        
        if(carry>0){
          
          result.next = new LinkedListNode(carry);   
        }
        
        
        return head;
        // Write your code here.
    }
}
