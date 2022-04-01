package queueExample;

import java.util.PriorityQueue;

public class priorityqueuedemo1 
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
		
		//dequeueing the queue
		Object o1 = q1.poll();
		while(o1 != null)
		{
			System.out.println(o1);
			o1 = q1.poll();
		}
		
		System.out.println();
		
		System.out.println(q1);
	}
}
