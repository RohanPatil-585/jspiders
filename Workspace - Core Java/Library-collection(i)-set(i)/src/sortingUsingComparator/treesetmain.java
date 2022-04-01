package sortingUsingComparator;

import java.util.Iterator;
import java.util.TreeSet;

public class treesetmain 
{
	public static void main(String[] args) 
	{
		byName namewise = new byName();
		byid byid = new byid();
		bySalary salarywise = new bySalary();
		TreeSet t1 = new TreeSet(namewise);
	//	TreeSet t1 = new TreeSet();
		t1.add(new employee(001, "ronak", 70000.00));
		t1.add(new employee(007, "rohan", 100000.00));
		t1.add(new employee(001, "ronak", 70000.00));
		t1.add(new employee(006, "jay", 80000.00));
		t1.add(new employee(004, "dipak", 600000.00));
		t1.add(new employee(001, "ronak", 70000.00));
		
		System.out.println("is treeset empty?? "+t1.isEmpty());
		System.out.println("size of the treeset = "+t1.size());
		
		System.out.println(t1);
		
		Iterator i1 = t1.iterator();
		while(i1.hasNext())
		{
			Object o1 = i1.next();
			System.out.println(o1);
		}
		
		Iterator i2 = t1.iterator();
		while(i2.hasNext())
		{
			employee e1 = (employee)i2.next();
			System.out.println(e1.id +"\t"+ e1.name+"\t"+e1.salary);
		}

	}
}
