package linkedlist;
import java.util.LinkedList;
public class LinkCreation 
{
   Node head;
  
   //INSERTION
   public void insert(int data)
   {
	   Node node = new Node(data);
	   
	   if(head==null)
	   {
		   head=node;
	   }
	   else
	   {
		   Node n=head; 
		   while(n.next!=null)
		   {
			   n=n.next;
		   }
		   n.next= node;
	   }   
	   
   }
   
   //ADD ELEMENT IN FIRST
   public void addFirst(int data)
   {
	   Node node = new Node(data);
	  
	   node.next=head;
	   head=node;
   }
   
   
   //DELETION ELEMENT IN LIST
   public void delete(int data)
   {
	// Case 1: list is empty
	    if (head == null) 
	    {
	    	System.out.println("head can't be null");
	    	return;
	    }

	    // Case 2: first node contains the data
	    if (head.data == data) {
	        head = head.next;   // delete first node
	        
	    }
	   
	   //deletion in middle and end
	   Node node = new Node(data);
	   Node current=head;
	  while(current.next!=null && current.next.data!=data)
	  {
		  current = current.next;
	  }
	  if(current.next!=null && current.next.next!=null)
	  {
		  current.next= current.next.next;
	  }
   }
   
   //INSERTION IN BETWEEN
   
   public void insertionbetween(int a,int b,int data)
   {
	   Node node= new Node(data);
	   Node current = head;
	   
	   while(current!=null && current.next!=null)
	   {
		   if(current.data==a && current.next.data==b )
		   {
			   break;
		   }
		   current=current.next;
	   }
	   node.next=current.next;
	   current.next=node;
   }
   
   public void show()
   {
	
	   Node node=head;
	   while(node.next!=null)
	   {
		   System.out.println(node.data);
		   node=node.next;
	   }
	  System.out.println(node.data);
   }
   
   
   
   
   
}
