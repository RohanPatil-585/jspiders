package practice;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

class node
{
	private int data;
	private node link;
	public node(int data, node link) 
	{
		this.data = data;
		this.link = link;
	}
	public int getData() 
	{
		return data;
	}
	public void setData(int data) 
	{
		this.data = data;
	}
	public node getLink() 
	{
		return link;
	}
	public void setLink(node link) 
	{
		this.link = link;
	}
}

class linkedList
{
	node start;
	node end;
	int size;
	public linkedList() 
	{
		this.start = null;
		this.end = null;
		this.size = 0;
	}
	
	public void addStart(int val)
	{
		node n1 = new node(val, null);
		if(start == null)
		{
			start = n1;
			end = n1;
		}
		else
		{
			node temp = start;
			start = n1;
			start.setLink(temp);
		}
		size++;
	}
	
	public void addEnd(int val)
	{
		node n1 = new node(val, null);
		if(start == null)
		{
			start = n1;
			end = start;
		}
		else
		{
			end.setLink(n1);
			end = n1;
		}
		size++;
	}
	
	public void addAtSpacificPosition(int val,int pos)
	{
		node n1 = new node(val, null);
		if(pos == 1)
		{
			addStart(val);
		}
		else if(pos == size)
		{
			addEnd(val);
		}
		else
		{
			pos = pos - 1;
			node temp = start;
			for (int i = 1; i <=size; i++) 
			{
				if(i == pos)
				{
					
					node temp1 = temp.getLink();
					temp.setLink(n1);
					n1.setLink(temp1);
					break;
				}
				temp = temp.getLink();
			}
			size++;
		}
	}
	
	public void deleteFirst()
	{
		start = start.getLink();
		size--;
	}
	
	public void deleteEnd()
	{
		int pos = size-1;
		node temp = start;
		for (int i = 1; i <= size; i++) 
		{
			if(i==pos)
			{
				temp.setLink(null);
				end = temp;
				break;
			}
			temp = temp.getLink();
		}
		size--;
	}
	
	public void deleteAtSpacificPosition(int pos)
	{
		node temp = start;
		if(pos == 1)
		{
			deleteFirst();
		}
		else if(pos == size)
		{
			deleteEnd();
		}
		else
		{
			pos = pos - 1;
			for (int i = 1; i <= size; i++) 
			{
				if(i==pos)
				{
					node temp1 = temp.getLink().getLink();
					temp.setLink(temp1);
					break;
				}
				temp = temp.getLink();
			}size--;
		}
		
	}
	
	public void updateAtSpacificPosition(int val,int pos)
	{
		node temp = start;
		for (int i = 1; i <= size; i++) 
		{
			if(pos == i)
			{
				temp.setData(val);
			}
			temp = temp.getLink();
		}
	}
	public void display()
	{
		node pos = start;
		for (int i = 1; i <=size; i++) 
		{
			System.out.print(pos.getData()+" ");
			pos = pos.getLink();
		}
	}
}
public class SinglyLinkedList 
{
	public static void main(String[] args) 
	{
		linkedList l1 = new linkedList();
		l1.addStart(1);
		l1.addStart(2);
		l1.addEnd(3);
		l1.addAtSpacificPosition(4, 2);
		l1.addAtSpacificPosition(5, 3);
		l1.display();
		l1.deleteFirst();
		System.out.println();
		l1.display();
		
		l1.deleteEnd();
		System.out.println();
		l1.display();
		
		l1.deleteEnd();
		System.out.println();
		l1.display();
		
		l1.addEnd(12);
		System.out.println();
		l1.display();
		
		l1.addEnd(13);
		System.out.println();
		l1.display();
		
		l1.addEnd(14);
		System.out.println();
		l1.display();
		
		l1.deleteAtSpacificPosition(2);
		System.out.println();
		l1.display();

		l1.deleteAtSpacificPosition(1);
		System.out.println();
		l1.display();
		
//		l1.updateAtSpacificPosition(15, 3);
//		System.out.println();
//		l1.display();
//		
//		l1.updateAtSpacificPosition(20, 1);
//		System.out.println();
//		l1.display();

	}
}