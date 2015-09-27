/*Question: Find the length of the loop in a linkedList
Answer: After finding if the loop exist, keep the slowptr as it is and
let fastptr move. Keep a counter to count the number of places fastptr has 
moved until it meets slowptr.
*/
public class LengthOfLoop 
{
		int FindLoopLength(node head)
		{
			node slowptr=head,fastptr=head;
			boolean loopexist=false;
			int counter=0;
			if(head==null)
				return 0;
			while(fastptr.next!=null && fastptr.next.next!=null)
			{
				slowptr=slowptr.next;
				fastptr=fastptr.next.next;
				if(slowptr==fastptr)
				{
					loopexist=true;
					break;
				}
			}
			if(loopexist)
			{
				fastptr=fastptr.next;
				while(slowptr!=fastptr)
				{
					fastptr=fastptr.next;
					counter++;
				}
				return counter;
			}
			return 0;
		}
}
