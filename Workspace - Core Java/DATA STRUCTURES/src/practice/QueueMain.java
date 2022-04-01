package practice;

import java.util.Scanner;

class queue
{
	static Scanner s1 = new Scanner(System.in);
	int size;
	Object[] obj;
	int front;
	int rear;

	public queue(int size) 
	{
		this.size = size;
		obj = new Object[size];
		this.front = 0;
		this.rear = -1;
	}
	
	public void enque()
	{
		if(rear == size-1)
		{
			System.out.println("queue is full...");
		}
		else
		{
			System.out.println("enter the element...");
			rear++;
			Object element = s1.next();
			obj[rear]=element;
			System.out.println("element "+ element +"inserted successfully...");
		}
	}
	
	public void dequeue()
	{
		if(rear == -1)
		{
			System.out.println("stack is empty...");
		}
		else
		{
			System.out.println(obj[front]+" deleted successfully...");
			for (int i = 0; i <= rear-1 ; i++) 
			{
				obj[i]=obj[i+1];
			}
		}
		rear--;
	}
	
	public void traverse()
	{
		if(rear == -1)
		{
			System.out.println("queue is empty...");
		}
		else
		{
			for (int i = 0; i <=rear; i++) 
			{
				System.out.print(obj[i]);
			}
		}
	}
	
	public void displayElement(int index)
	{
		for (int i = 0; i < obj.length; i++) 
		{
//			System.out.print(obj[index]);
//			break;
		}
		System.out.println(obj[index]);
	}
}
public class QueueMain 
{
	static Scanner s2 = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter the size of the queue...");
		int size = s2.nextInt();
		queue q1 = new queue(size);
		q1.enque();
		q1.enque();
		q1.enque();
		q1.enque();
		q1.enque();
		System.out.println();
		q1.dequeue();		
		System.out.println();
		q1.traverse();
		System.out.println();
		q1.dequeue();		
		System.out.println();
		q1.traverse();
		System.out.println();
		q1.displayElement(1);
	}
}
