package queue;

import java.util.Scanner;

class cqueue
{
	Scanner s1 = new Scanner(System.in);
	int size;
	Object[] obj;
	int front;
	int rear;
	
	public cqueue(int size) 
	{
		this.size = size;
		obj = new Object[size];
		front = -1;
		rear = -1;
	}
	
	public void enqueue()
	{
		if(front == rear+1 || rear == size-1)
		{
			System.out.println("queue is full...");
		}
		else if(front == -1 && rear == -1)
		{
			front = 0;
			rear = 0;
			System.out.println("enter the element...");
			Object element = s1.next();
			obj[rear]= element;
			System.out.println("element " +obj[rear] +" entered successfully....");
		}
		else if(rear == size-1)
		{
			rear = 0;
			System.out.println("enter the element...");
			Object element = s1.next();
			obj[rear] = element;
			System.out.println("element " +obj[rear] +" entered successfully....");
		}
		else
		{
			rear++;
			System.out.println("enter the element...");
			Object element = s1.next();
			obj[rear] = element;
			System.out.println("element " +obj[rear] +" entered successfully....");
		}
	}
	
	public void dequeue()
	{
		if(front == -1 && rear == -1)
		{
			System.out.println("queue is Empty...");
		}
		else if(front == rear)
		{
			System.out.println("element removed is" +obj[front]);
			front = -1;
			rear = -1;
		}
		else if(front == size-1)
		{
			System.out.println("element removed is" +obj[front]);
			front = 0;
		}
		else
		{
			System.out.println("element removed is" +obj[front]);
			front++;
		}
	}
	
	public void traverse()
	{
		if(front == -1 && rear == -1)
		{
			System.out.println("queue is empty...");
		}
		else
		{
			for(int i = 0; i<=rear; i++)
			{
				System.out.println(obj[i]);
			}
			System.out.println();
			
			for(int i = front; i<size-1; i++)
			{
				System.out.println(obj[i]);
			}
			System.out.println();
			
			for(int i = 0; i<=size-1;i++)
			{
				System.out.println(obj[i]);
			}
		}
	}
}
public class circularQueue 
{
	public static void main(String[] args) 
	{
		cqueue c1 = new cqueue(5);
		c1.enqueue();
		c1.enqueue();
		c1.enqueue();
		c1.enqueue();
		c1.enqueue();
		
		System.out.println("traversing the array...");
		c1.traverse();
		
		c1.dequeue();
		System.out.println("traversing the array after dequeue...");
		c1.traverse();
		
		c1.dequeue();
		System.out.println("traversing the array after dequeue...");
		c1.traverse();
	}
}