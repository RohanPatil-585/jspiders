package linkedList;

class node<T>
{
	private T data;
	private node<?> link;
	public node(T data, node<?> link) {
		this.data = data;
		this.link = link;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public node<?> getLink() {
		return link;
	}
	public void setLink(node<?> link) {
		this.link = link;
	}
}

class linkedlist
{
	node start;
	node end;
	int size;
	 
	public linkedlist()
	{
		this.start = null;
		this.end = null;
		this.size = 0;	
	}
	
	public  <T> void addend(T val)
	{
		node<T> n1 = new node<T>(val,null);
		if(start == null)
		{
			start = n1;
			end = start;
		}
		else
		{
			end.setLink(n1);
			end=n1;
			
		}
		size++;
	}
	public void display()
	{
		node pos=start;
		for(int i=1;i<=size;i++)
		{
			System.out.print(pos.getData());
			pos=pos.getLink();
		}
	}
	
	public void addfirst(int val)
	{
		node n1=new node(val,null);
		if(start==null)
		{
			start=n1;
			end=n1;
		}
		else
		{
				node temp=start;
				start=n1;
				start.setLink(temp);
		}
		size++;
	}
	
	public void addSpacificPosition(int val,int pos)
	{
		node n1=new node(val,null);
		if(pos==1)
		{
			addfirst(val);
		}
		else if(pos==size)
		{
			addend(val);
		}
		else 
		{
			pos=pos-1;
			node temp=start;
			for (int i = 1; i < size; i++) 
			{
				if(i==pos)
				{
					node temp1=temp.getLink();
					temp.setLink(n1);
		 			n1.setLink(temp1);
					break;
				}
				  temp=temp.getLink();
			}
		}
		size++;
		
	}
}
public class SinglyLinkedList 
{
	public static void main(String[] args) 
	{
		linkedlist l1 = new linkedlist();
		l1.addend(1);
		l1.addend(2);
		l1.addend("DSD");
		l1.addend('a');
		l1.addfirst(4);
		l1.addSpacificPosition(5, 3);
		l1.display();
	}
}
