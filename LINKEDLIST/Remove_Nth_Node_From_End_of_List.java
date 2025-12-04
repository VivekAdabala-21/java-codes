package linkedlist;

public class Remove_Nth_Node_From_End_of_List 
{
	
	   public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	   }
	 
	  
	    public ListNode removeNthFromEnd(ListNode head, int n) {

	        //reversing
	        ListNode prev = null;
	        ListNode current = head;

	        while (current != null) 
	        {
	            ListNode next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	        }
	        
	        //deletion
	        ListNode temp = prev;
	 
	        if (n == 1) 
	        {
	            temp = temp.next;  
	        } 
	        else 
	        {
	            ListNode curr = temp;  
	            int i = 1;

	            while (curr != null && i < n - 1) 
	            {
	                curr = curr.next;
	                i++;
	            }

	            if (curr != null && curr.next != null) 
	            {
	                curr.next = curr.next.next;
	            }
	        }

	        //reversing
	        
	        ListNode prev2 = null;
	        current = temp;

	        while (current != null) 
	        {
	            ListNode next = current.next;
	            current.next = prev2;
	            prev2 = current;
	            current = next;
	        }

	        return prev2;

	        
	    }
	
}
