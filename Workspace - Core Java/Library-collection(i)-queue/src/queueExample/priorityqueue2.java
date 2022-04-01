package queueExample;

import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityqueue2 
{
	public static void main(String[] args) 
	{
		PriorityQueue q2 = new PriorityQueue();
		System.out.println("size = "+q2.size());
		System.out.println("is queue empty = "+q2.isEmpty());
		
		q2.add("dolu");
		q2.add(new employee(007,"rohan",99.99));
		q2.add(new pen("cell","red",20.00));
		q2.add(new employee(006,"ashish",99.99));
		q2.add(new student(006, "divyesh", 99.90));
		q2.add(new employee(003,"jay",99.90));
		q2.add(new mobile(002, "smart", 35000.00));
		
		System.out.println("size = "+q2.size());
		System.out.println("is queue empty = "+q2.isEmpty());
		
		//if we use poll, it will remove the elements from the queue so after the execution there is no any - 
		// element so we cant display elements after that
		Object o1 = q2.poll();
		while(o1 != null)
		{
			System.out.println(o1);
			o1 = q2.poll();
		}
		
		System.out.println();
		
		Iterator i1 = q2.iterator();
		while(i1.hasNext())
		{
			Object o3 = i1.next();
			System.out.println(o3);
		}
		
		System.out.println();
		
		for (Object e : q2) 
		{
			System.out.println(e);
		}
		System.out.println(q2+"now the queue is empty...");

	}
}
