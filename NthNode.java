/*Question: find nth node from the end of a linked list.
Answer: Use two pointers p and t which will initially point to the head. 
Let the pointer t move only after p pointer has made "nth" moves. Then let both
move until the end of the list. What we'll have is the node "t" pointing to the nth
node from the end. */
public class NthNode 
{
		private node nthNode(node head, int nth)
		{
			   node p=head, t=null;
			   for(int count=1;count<nth;count++)
			   {
				   if(p.next!=null)
					   p=p.next;
			   }
			   
			   while(p!=null)
			   {
				   if(t==null)
					   t=head;
				   else
					   t=t.next;
				   p=p.next;
			   }
			   if(p!=null)
				   return p;
			return null;
		}
}
