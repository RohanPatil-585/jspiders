package practice;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

class nodes
{
	private int data;
	private nodes link;
	
	public nodes(int data, nodes link) 
	{
		this.data = data;
		this.link = link;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public nodes getLink() {
		return link;
	}

	public void setLink(nodes link) {
		this.link = link;
	}
}

class SinglyLList
{
	nodes start;
	nodes end;
	int size;
	
	public SinglyLList() 
	{
		this.start = null;
		this.end = null;
		this.size = 0;
	}

	public void addFirst(int val)
	{
		nodes n1 = new nodes(val, null);
		if(start == null)
		{
			start = n1;
			end = n1;
		}
		else
		{
			nodes temp = start;
			start = n1;
			start.setLink(temp);
		}
		size++;
	}
	
	public void addEnd(int val)
	{
		nodes n1 = new nodes(val, null);
		
		if(start == null)
		{
			start = n1;
			end = n1;
		}
		else
		{
			end.setLink(n1);
			end = n1;
		}
		size++;
	}
	
	public void addAtSpacificPosition(int val, int pos)
	{
		nodes n1 = new nodes(val, null);
		if(pos == 1)
		{
			addFirst(val);
		}
		else if (pos == size)
		{
			addEnd(val);
		}
		else
		{
			pos = pos - 1;
			nodes temp = start;
			for (int i = 1; i <= size; i++) 
			{
				if(i == pos)
				{
					nodes temp1 = temp.getLink();
					temp.setLink(n1);
					n1.setLink(temp1);
					break;
				}
				start = start.getLink();
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
		nodes temp = start.getLink();
		
	}
	public void display()
	{
		nodes pos = start;
		for (int i = 0; i < size; i++) 
		{
			System.out.print(pos.getData()+" ");
			pos = pos.getLink();
		}
	}
}
public class SinglyLinkedList1 
{
	public static void main(String[] args) 
	{
		SinglyLList l1 = new SinglyLList();
		l1.addFirst(1);
		l1.addEnd(2);
		l1.addEnd(3);
		l1.addAtSpacificPosition(4, 2);
		l1.display();
		l1.addEnd(3);
		l1.display();		
	}
}