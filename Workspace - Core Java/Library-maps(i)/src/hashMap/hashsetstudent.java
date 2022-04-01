package hashMap;

import java.util.HashSet;

import java.util.Iterator;

public class hashsetstudent 
{
	public static void main(String[] args) 
	{
		HashSet s1 = new HashSet();
		
		s1.add(new student(215,"ramesh",65.25));
		s1.add(new student(214,"suresh",85.25));
		s1.add(new student(212,"jageesh",95.25));
		s1.add(new student(211,"mahesh",75.25));
		s1.add(new student(214,"pragnesh",55.25));
		
		System.out.println("set size is = "+s1.size());
		System.out.println("rollno \t name \t marks");
		System.out.println("------------------------");
		
		Iterator i1 = s1.iterator();
		while(i1.hasNext())
		{
			student st1 = (student) i1.next();
			System.out.println(st1.rollno +"\t"+ st1.name +"\t"+ st1.marks);
		}
		
//		for(Object e: s1)
//		{
//			System.out.println(e);
//		}
	}
}
