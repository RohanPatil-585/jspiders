package iteretorOnArraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class iteretorDemo1 
{
	public static void main(String[] args) 
	{
		ArrayList l1 = new ArrayList();
		l1.add(new student(3245,"rohan",65.80));
		l1.add("jspders");
		l1.add(null);
		l1.add(new pen("cello","blue",15.00));
		l1.add("jspders");
		
//		traversing the list elements using iterator methods
		
		Iterator li = l1.iterator(); //return the object of iteretor type
		
		while(li.hasNext())
		{
			Object o1 = li.next();
			System.out.println(o1);
		}
		
		ListIterator LI = l1.listIterator();
		
//		trversing the list element using list iteretor method
		
		System.out.println("forword direction");
		System.out.println("------------------");
		while(LI.hasNext())
		{
			Object o1 = LI.next();
			System.out.println(o1);
		}
		
		System.out.println("reverse direction");
		System.out.println("------------------");
		while(LI.hasPrevious())
		{
			Object o1 = LI.previous();
			System.out.println(o1);
		}
		
		System.out.println("using foreach");
		System.out.println("------------------");
		for(Object e: l1)
		{
			System.out.println(e);
		}
	}
}
