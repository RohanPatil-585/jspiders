package ctsSunilsir;

import jdk.nashorn.internal.runtime.FindProperty;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

import com.sun.org.apache.xpath.internal.axes.ReverseAxesWalker;

class SLL
{
	private node head = null;
	private int size = 0;
	
	private class node
	{
		Object data;
		node next;
		
		public node(Object data)
		{
			super();
			this.data = data;
		}
	}
	
	public void addLast(Object data)
	{
		node n1 = new node(data);
		if(head == null)
		{			
			head = n1;
			size++;
			return;
		}
		node t = head;
		while(t.next!=null)
		{
			t = t.next;
		}
		t.next = n1;
		size++;
	}
	
	public void addFirst(Object data)
	{
		node n1 = new node(data);
		n1.next = head;
		head = n1;
		size++;
	}
	
	public void addAtSpacificPosition(int pos , Object data)
	{
		node n1 = new node(data);
		if(pos == 0)
		{
			addFirst(data);
			return;
		}
		if(pos > size)
		{
			System.out.println("cant add element...");
			return;
		}
		node t = head;
		int count=1;
		while(count<pos-1)
		{
			t = t.next;
			count++;
		}
		n1.next = t.next;
		t.next = n1;
		size++;
	}
	
	@Override
	public String toString() 
	{
		node t = head;
		String s = "";
		while(t!=null)
		{
			s = s + t.data+"->";
			t = t.next;
		}
		return "[" +s+ "]";
	}
	
	private void reverse(node start)
	{
		if(start!=null)
		{
			reverse(start.next);
			System.out.print(start.data+"<-");
		}
	}
	
	public void reverse()
	{
		reverse(head);
	}
	
	public Object remove(int pos)
	{
		if(pos == 0)
		{
			Object value = head.data;
			head = head.next;
			size--;
			return value;
		}
		if(pos >= size)
		{
			return null;
		}
		
		node t= head;
		int count = 0;
		while(count<pos-1)
		{
			t = t.next;
			count++;
		}
		Object value = t.next.data;
		t.next = t.next.next;
		size--;
		return value;
	}
	
	public boolean isLoop()
	{
		node slownode = null;
		node fastnode = null;
		node t = head;
			slownode = slownode.next;
			fastnode = fastnode.next.next;
		if(slownode.data == fastnode.data)
		{
			return true;
		}
		return false;
	}
	
	private Object findMid(node head)
	{
		if(head == null)
		{
			return null;
		}
		
		node snode = null;
		node fnode = null;
		
		while(fnode!=null && fnode.next!=null)
		{
			snode = snode.next;
			fnode = fnode.next.next;
		}
		return snode.data;
	}
	
	public Object findMid()
	{
		return findMid(head);
	}
}

public class SinglyLinkedList
{
	public static void main(String[] args) 
	{
		SLL s1 = new SLL();
		s1.addFirst(10);
		s1.addFirst(20);
		s1.addFirst(30);
		s1.addLast(40);
		s1.addAtSpacificPosition(3, 50);
		s1.addAtSpacificPosition(3, 60);
		System.out.println(s1);
		
		System.out.println();
		s1.reverse();
		
		System.out.println();
		System.out.println(s1.remove(3));
		
		System.out.println();
		System.out.println(s1);
		
//		System.out.println();
//		if(s1.isLoop())
//		{
//			System.out.println("loop");
//		}
//		else
//		{
//			System.out.println("no loop");
//		}
//		System.out.println();
//		System.out.println(s1.findMid());
	}
}