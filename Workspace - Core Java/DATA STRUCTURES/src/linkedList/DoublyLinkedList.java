package linkedList;

class nodes
{
	private int data;
	private nodes previouslink;
	private nodes nextlink;
	public nodes(int data, nodes previouslink, nodes nextlink) 
	{
		this.data = data;
		this.previouslink = previouslink;
		this.nextlink = nextlink;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public nodes getPreviouslink() {
		return previouslink;
	}
	public void setPreviouslink(nodes previouslink) {
		this.previouslink = previouslink;
	}
	public nodes getNextlink() {
		return nextlink;
	}
	public void setNextlink(nodes nextlink) {
		this.nextlink = nextlink;
	}
}

class DoublyList
{
	nodes start;
	nodes end;
	int size;
	
	DoublyList()
	{
		this.start = null;
		this.end = null;
		this.size = 0;
	}
	
	public void addStart(int val)
	{
		nodes n1 = new nodes(val, null, null);
		if(start == null)
		{
			start = n1;
			end = n1;
		}
		else
		{
			n1.setNextlink(start); 
			start.setPreviouslink(n1);
			start=n1;
		}
		size++;
	}
	
	public void addEnd(int val)
	{
		nodes n1 = new nodes(val, null, null);
		if(start == null)
		{
			start = n1;
			end = start;
		}
		else
		{
			end.setNextlink(n1);
			n1.setPreviouslink(end);
			end = n1;
		}
		size++;
	}
	
	public void addAtSpacificPosition(int val, int pos)
	{
		nodes n1 = new nodes(val, null, null);
		
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
			pos = pos - 1 ;
			nodes temp = start;
			
			for (int i = 1; i <=size; i++) 
			{
				if(pos == i)
				{
					nodes temp1 = temp.getNextlink();
					n1.setNextlink(temp1);
					n1.setPreviouslink(temp);
					temp.setNextlink(n1);
					temp1.setPreviouslink(n1);
					break;
				}
				temp = temp.getNextlink();
			}
			size++;
		}		
	}
	
	public void deleteFirst()
	{
		start = start.getNextlink();
		size--;
	}
	
	public void deleteEnd()
	{
		int pos = size-1;
		nodes temp = start;
		
		for (int i = 1; i <= size; i++) 
		{
			if(pos == i)
			{
				temp.setNextlink(null);
				end = temp;
				break;
			}
			temp = temp.getNextlink();
		}
		size--;
	}
	
	public void deleteAtSpacificPosition(int pos)
	{
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
			pos = pos-1;
			nodes temp = start;
			
			for (int i = 1; i <=size; i++) 
			{
				if(pos == i)
				{
					nodes temp1 = temp.getNextlink().getNextlink();
					temp.setNextlink(temp1);
					temp1.setPreviouslink(temp);
					break;
				}
				temp = temp.getNextlink();
			}
			size--;
		}
	}
	public void display()
	{
		nodes pos = start;
		for (int i = 1; i <= size; i++) 
		{
			System.out.print(pos.getData()+" ");
			pos = pos.getNextlink();
		}
	}
}

public class DoublyLinkedList 
{
	public static void main(String[] args) 
	{	
		DoublyList d1 = new DoublyList();
		d1.addStart(1);
		d1.addStart(2);
		d1.addStart(3);
		d1.addEnd(4);
		d1.addEnd(5);
		d1.display();
		
		d1.addAtSpacificPosition(6, 3);
		System.out.println();
		d1.display();
		
		d1.deleteFirst();
		System.out.println();
		d1.display();
		
		d1.deleteEnd();
		System.out.println();
		d1.display();
		
		d1.deleteAtSpacificPosition(3);
		System.out.println();
		d1.display();
		
		d1.addEnd(7);
		System.out.println();
		d1.display();
	}
}