package linkedlist;

public class Reverse_An_Linkedlist 
{
	
	   /*  public class ListNode {
	       int val;
	       ListNode next;
	       ListNode() {}
	       ListNode(int val) { this.val = val; }
	       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	    }
	  */
	
	
	    public ListNode reverseList(ListNode head) 
	    {
	        ListNode previous=null;
	        ListNode current=head;
	        ListNode next=null;

	        while(current!=null)
	        {
	            
	            next=current.next;
	            current.next=previous;
	            previous=current;
	            current=next;
	        }   
	        return previous;
	    }  	
}

