/*Question: Program to find if a LinkedList contains a loop
Answer: This is a famous Floyd cycle finding algorithm. We use two pointers,
one is fast pointer(fastptr) and the other is slowpointer(slowptr). If ever these pointer points to 
the same node then the linked list contains a loop. */
public class LinkedListContainsLoop 
{
		private boolean loopexist(node head)
		{
			if(head==null)
				return false;
			node slowptr=head,fastptr=head;
			while(fastptr.next!=null && fastptr.next.next!=null)
			{
				slowptr=slowptr.next;
				fastptr=fastptr.next.next;
				if(slowptr==fastptr)
					return true;
			}
			return false;
		}
}
