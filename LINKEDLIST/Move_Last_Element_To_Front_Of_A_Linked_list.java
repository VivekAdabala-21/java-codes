package linkedlist;

public class Move_Last_Element_To_Front_Of_A_Linked_list 
{
 /* class Node
	{
	    int data;
	    Node next;

	    Node(int x)
		{
	        data = x;
	        next = null;
	    }
	}
  */
	    public static Node moveToFront(Node head) {
	        
	        Node newNode=null;
	        Node prev=null;
	        Node temp=head;
	        Node last=null;
	        while(temp!=null &&temp.next!=null)
	        {
	            prev=temp;
	            temp=temp.next;     
	        }
	        prev.next=last;
	        newNode= temp;
	        newNode.next=head;
	        head=newNode;
	        return head;
	        
	    }
	}

}

