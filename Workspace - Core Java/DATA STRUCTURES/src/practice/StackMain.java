package practice;

import java.util.Scanner;

import stack.stack;

interface StackInterface
{
	public boolean isEmpty();
	public boolean isFull();
	public void push(Object obj);
	public void pop();
	public void top();
}

class Stack
{	
	int size;
	Object[] obj;
	int top;
	
	public Stack(int size) 
	{
		this.size = size;
		obj = new Object[size];
		top = -1;
	}
	
	public boolean isEmpty() 
	{
		if(top == -1)
		{
			return true;
		}
		return false;
	}
	
	public boolean isFull() 
	{
		if(top == size-1)
		{
			return true;
		}
		return false;
	}
	
	public void push(Object e) 
	{
		if(!isFull())
		{			
			obj[++top]=e;
			System.out.println("element inserted successfully...");
		}
		else
		{
			System.out.println("stack is overflow...");
		}
	}
	
	public void pop() 
	{
		if(!isEmpty())
		{			
			System.out.println(obj[top--]+"removed successfully...");
		}
		else
		{
			System.out.println("stack is empty...");
		}
	}
	
	public void top() 
	{
		if(!isEmpty())
		{			
			System.out.println("top element in the stack is = "+obj[top]);
		}
	}	
	
	public void displayElement()
	{
		for (int i = 0; i <= top; i++)
		{
			System.out.println(obj[i]);
		}
	}
}
public class StackMain
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the size of the stack...");
		int size = s1.nextInt();
		Stack st = new Stack(size);
		System.out.println("enter the object in the stack...");
		for (int i = 0; i < size; i++) 
		{			
			Object element = s1.next();
			st.push(element);
		}
		System.out.println();
		st.top();
		
		System.out.println();
		st.pop();
		
		System.out.println();
		st.top();
		
		System.out.println();
		st.displayElement();
	}
}