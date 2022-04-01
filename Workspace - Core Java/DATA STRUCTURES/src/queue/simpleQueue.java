package queue;

import java.util.Scanner;

class queue
{
	Scanner s1 = new Scanner(System.in);
	int size;
	Object[] obj;
	int front;
	int rear;
	
	queue(int size)
	{
		this.size = size;
		obj = new Object[size];
		front = 0;
		rear = -1;
	}
	public void enqueue()
	{
		if(rear == size-1)// && front == -1)
		{
			System.out.println("queue is full...");
		}
		else
		{
			System.out.println("enter the element..");
			rear++;
			Object element = s1.next();
			obj[rear] = element;
			System.out.println("element "+ element +"is inserted successfully...");
		}
	}
	
	public void dequeue()
	{
		if(rear == -1)// || rear == front)
		{
			System.out.println("queue is empty...");
		}
		else
		{
			System.out.println("deleted "+obj[front]);
			for (int i = 0; i <= rear-1; i++) 
			{
					obj[i] = obj[i+1];
			}
		}
		rear--;
	}
	
	public void traverse()
	{
		//if(front == rear || 
		if(rear == -1)
		{
			System.out.println("queue is empty...");
		}
		else
		{
			System.out.println("queue elements are...");
			for (int i = 0; i <=rear; i++) 
			{
				System.out.println(obj[i]);
			}
		}
	}
}
public class simpleQueue 
{
	public static void main(String[] args) 
	{
		queue q1 = new queue(5);
		q1.enqueue();
		q1.enqueue();
		q1.enqueue();
		q1.enqueue();
		q1.enqueue();
		q1.traverse();
		q1.dequeue();
		q1.traverse();
		q1.dequeue();
		q1.traverse();
	}
}
