package practice;

import java.util.Scanner;

interface QueueInterface
{
	public void enque();
	public void deque();
	public boolean isEmpty();
	public  boolean isFull();
	public void traverse();
}

class circularQueueMain implements QueueInterface
{
	Scanner s1 = new Scanner(System.in);
	int size;
	int front;
	int rear;
	Object[] obj;

	public circularQueueMain(int size) 
	{
		
		this.size = size;
		this.front = -1;
		this.rear = -1;
		obj = new Object[size];
	}

	public void enque()
	{
		if(front == rear+1  || rear==size-1)
		{
			System.out.println("queue is full...");
		}
		else if(rear == -1 && front == -1)
		{
			rear = 0;
			front = 0;
			System.out.println("insert element...");
			Object element = s1.next();
			obj[rear]=element;
			System.out.println("element "+ element +" inserted successfully...");
		}
		else if(rear==size-1)
		{
			rear=0;
			Object element = s1.next();
			obj[rear]=element;
			System.out.println("element "+ element +" inserted successfully...");
		}
		else
		{
			rear++;
			Object element = s1.next();
			obj[rear]=element;
			System.out.println("element "+ element +" inserted successfully...");
		}
	}
	
	public void deque() 
	{
		if(rear == -1 && front == -1)
		{
			System.out.println("queue is empty...");
		}
		else if(front == rear)
		{
			rear = -1;
			front = -1;
			System.out.println("element"+ obj[front] +"deleted successfully...");
		}
		else if(front == size-1)
		{
			System.out.println("element"+ obj[front] +"deleted successfully...");
			front = 0;
		}
		else
		{
			System.out.println("element"+ obj[front] +"deleted successfully...");
			front++;
		}
	}

	public boolean isEmpty() 
	{
		if(front == -1 && rear == -1)
		{
			return true;
		}
		return false;
	}

	public boolean isFull() 
	{
		if(rear == size-1)
		{
			return true;
		}
		return false;
	}

	public void traverse() 
	{
		if(front == -1 && rear == -1)
		{
			System.out.println("queue is empty...");
		}
		else
		{ 
//			for (int i = 0; i <= size-1; i++) 
//			{
//				System.out.println(obj[i]);
//			}
//			System.out.println();
//			for (int i = front; i <=rear ; i++) 
//			{
//				System.out.println(obj[i]);
//			}
			System.out.println();
			for (int i = front; i <= size-1; i++) 
			{
				System.out.println(obj[i]);
			}
		}
	}
	
}
public class CircularQueue 
{
	public static void main(String[] args) 
	{
		circularQueueMain c1 = new circularQueueMain(5);
		c1.enque();
		c1.enque();
		c1.enque();
		c1.enque();
		c1.enque();
		System.out.println();
		c1.traverse();
		System.out.println();
		c1.deque();
		c1.traverse();
		System.out.println();
		c1.deque();
		c1.traverse();
	}
}