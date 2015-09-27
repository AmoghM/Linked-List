
public class demolinkedlist 
{
		protected node spawn()//creating a sample linkedlist
		{
			node head=null;
			int length=10;
		
			while(length>0)
			{   
				node t=new node();
				t.info=(int) Math.random();
				t.next=null;
				if(head==null)
					head=t;
				else
				{
					node p=head;
					while(p.next!=null)
					{ p=p.next;}
					p.next=t;
				}
			}
			return head;
		}
}
