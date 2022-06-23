import java.util.* ;
import java.io.*; 
/*
	Following is the structure of the Singly Linked List.	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}

*/
public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        
        if(head==null || head.next == null )return head;
     
    
        LinkedListNode<Integer> temp;
        LinkedListNode<Integer> prev= null;
        while(head.next !=null){
            temp = head.next;
            head.next= prev;
            prev = head;
            head=temp;  
        }
        
        head.next=prev;
        return head;
        // Write your code here!
    }
}
