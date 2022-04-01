package iteratorOnQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class queueIteretor 
{
	public static void main(String[] args) 
	{
		PriorityQueue q1 = new PriorityQueue();
		System.out.println("is queue empty ? ="+q1.isEmpty());
		q1.add("kalia");
		q1.add("chutki");
		q1.add("bheem");
		q1.add("raju");
		q1.add("dolu");
		
		System.out.println("queue size = "+q1.size());
		System.out.println(q1);
		
		Iterator i1 = q1.iterator();
		while(i1.hasNext())
		{
			Object o1 = i1.next();
			System.out.println(o1);
		}
		
		System.out.println();
		
		for (Object e : q1) 
		{
			System.out.println(e);
		}
	}
}
