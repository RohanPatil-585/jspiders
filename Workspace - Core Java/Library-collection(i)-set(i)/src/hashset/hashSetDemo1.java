package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetDemo1 
{
	public static void main(String[] args) 
	{
		HashSet s1 = new HashSet();
		
		s1.add("computer");
		s1.add("robot");
		s1.add("drone");
		s1.add("army");
		s1.add("technology");
		s1.add(null);
		s1.add("army");
		s1.add("technology");
		s1.add(null);
		
		System.out.println("set size = "+s1.size());
		System.out.println("set elements ");
		System.out.println("is set empty?? -->"+s1.isEmpty());
		System.out.println(s1);
		
		System.out.println("iterating each element");
		Iterator i1 = s1.iterator();
		while(i1.hasNext())
		{
			Object o1 = i1.next();
			System.out.println(o1);
		}
		
		System.out.println();
		System.out.println("displaying using foreach...");
		System.out.println("-------------------");
		for(Object e : s1)
		{
			System.out.println(e);
		}
	}
}
