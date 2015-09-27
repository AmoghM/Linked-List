//Implementation of Stack in linked list
public class StackImplementation 
{
		private node top;
		StackImplementation()
		{
			top=null;
		}
		
		void push(int ele)
		{
			node p;
			p=new node();
			p.info=ele;
			p.next=top;
			top=p;
		}
		
		int pop()
		{
			int t=top.info;
			top=top.next;
			return t;
		}
		boolean isEmpty()
		{
			return top==null;
		}
		
		void display()
		{   
			if(top==null)
				System.out.println("Stack is Empty");
			else
			{
				node t=top;
				while(t!=top)
				{
					System.out.println(t.info);
					t=t.next;
				}
			}
		}
}
