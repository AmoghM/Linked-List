/* Question: Insert a node in a sorted linked list
   Answer: traverse the list and the find the position for the element and insert it.
 */
public class InsertionNode 
{
		private node insertion(node head, int element)
		{
			node temp=head;
			node t=new node();
			t.info=element;
			if(head==null)
			{   t.next=null;
				return t;
			}
			while(temp!=null && temp.info<t.info)
			{
				node prev=temp;
				temp=temp.next;
			}
			t.next=temp;
			temp.next=t;
			return head;
		}
}
