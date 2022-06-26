import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> list1, LinkedListNode<Integer> list2) {
        
        LinkedListNode head = list1;
        LinkedListNode temp1;
        int temp;
        
        if(list1==null && list2==null)return list1;
        else if(list1==null)return list2;
        else if(list2==null)return list1;
        
        while(list1 != null && list2 != null ){
            
            if(list2.data < list1.data){
               
                temp = list1.data;
                list1.data = list2.data;
                temp1= list1.next;
                list1.next = new LinkedListNode(temp);
                list1.next.next=temp1;
                if(list1.next==null)break;
                list1 = list1.next;
                list2 = list2.next;
                
            }else {
                if(list1.next==null)break;
                list1=list1.next;
            }
        }

        if(list2!=null)list1.next=list2;
        
        return head; 
       
	}
}
