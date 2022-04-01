package stack;

import java.time.chrono.IsoChronology;
import java.util.Scanner;

interface stackin
{
	public boolean isEmpty();
	public boolean isFull();
	public void push(Object obj);
	public void pop();
	public void top();
}
class mainstack implements stackin
{
	int size;
	Object[] obj;
	int top;
	
	public mainstack(int size)
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
//		else
//		{
//			System.out.println("stack is full...");
//		}
		return false;
	}

	public boolean isFull() 
	{
		if(top == size-1)
		{
			return true;
		}
//		else
//		{
//			System.out.println("stack is empty...");
//		}
		return false;
	}

	public void push(Object e) 
	{
		obj[++top]=e;
		System.out.println("element entered successfully...");
	}

	public void pop() 
	{
		System.out.println(obj[top--]+"element deleted successfully...");
	}
	
	public void top()
	{
		if(top != -1)
		{
			System.out.println("top of the stack = "+obj[top]);
		}
		else
		{
			System.out.println("stack is empty..");
		}
	}
}

public class stack 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the size of the stack ... ");
		int size = s1.nextInt();
		mainstack m1 = new mainstack(5);
		int ch = 1;
		
		while(ch<4)
		{
			System.out.println("1. push()- insert element \n 2. pop()- delete element \n 3. top of the stack \n 4. exit");
			System.out.println("enter your choice...");
			ch = s1.nextInt();
			
			switch (ch)
			{
				case 1:
						System.out.println("enter element on top of the stack...");
						Object  element = s1.next();
						if(!m1.isFull())
						{
							m1.push(element);
						}
						else
						{
							System.out.println("stack is overflow");
						}
						break;
				case 2:
						System.out.println("delete element from top of the stack...");
						System.out.println("do you want to remove the element form top, (Y/N)");
						char cha = s1.next().charAt(0);
						if(!m1.isEmpty() && cha == 'Y')
						{
							m1.pop();
						}
						else if(m1.isEmpty())
						{
							System.out.println("stack is empty....");
						}
						else
						{
							System.out.println("plese enter valid input...");
						}
				
				case 3:
						m1.top();
				default:
				break;
			}
		}
		System.out.println("exit");
	}
}