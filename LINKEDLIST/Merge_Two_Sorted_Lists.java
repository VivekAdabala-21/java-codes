package linkedlist;

public class Merge_Two_Sorted_Lists 
{
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
		 
	
		    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
		    {
		        // if any list is empty
		        if (list1 == null)
		        { 
		            return list2;
		        }    
		        if (list2 == null)
		        {
		            return list1;
		        } 

		        ListNode first = list1;
		        ListNode second = list2;

		        ListNode head = null;   // result head
		        ListNode prev = null;   // last added node

		        while (first != null && second != null) {

		            ListNode curr;

		            if (first.val <= second.val) 
		            {
		                curr = first;
		                first = first.next;
		            } 
		            else 
		            {
		                curr = second;
		                second = second.next;
		            }

		            // set head for first time
		            if (head == null) {
		                head = curr;
		                prev = curr;
		            } 
		            else 
		            {
		                prev.next = curr;
		                prev = curr;
		            }
		        }

		        
		        if (first != null)
		        {
		            prev.next = first;
		        }
		        else
		        {
		           prev.next = second;
		        }
		        return head;


		    }
		
}
