package listexamples;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class arraylistdemo1 
{
	public static void main(String[] args) 
	{
		ArrayList l1 = new ArrayList();
		System.out.println(l1.size());
		System.out.println("is list empty? "+l1.isEmpty());
		
		l1.add(new employee(07, "dipak", 90000.00));
		l1.add(new employee(02, "rohan", 90000.00));
		l1.add(new employee(03, "jay", 90000.00));
//		l1.add(new student(001, "rohan", 60.50));
//		l1.add("jspiders");
//		l1.add(null);
//		l1.add(new pen("cello", "blue", 15.00));
//		l1.add("jspiders");
//		l1.add(null);
		Collections.sort(l1);
		Iterator i1 = l1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println(l1.size());
		System.out.println("is list empty? "+l1.isEmpty());
	}
}
