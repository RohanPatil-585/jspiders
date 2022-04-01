package listexamples2;
import java.util.ArrayList;
import java.util.List;
public class arraylistdemo2 
{
	public static void main(String[] args) 
	{
		ArrayList l1 = new ArrayList();
		
		l1.add(new student(001, "rohan", 99.99));
		l1.add(new employee(007, "rohan", 50000.00));
		l1.add(new mobile(1234, "android", 20000.00));
		l1.add(new pen("cello", "blue", 15.00));
		
		System.out.println(l1.size());
		
		System.out.println("list elements are :");
		for(int i=0; i<l1.size(); i++)
		{
			System.out.println(l1.get(i));
		}
		System.out.println();
		
		//update the marks of student to 75.00
		student s1 = (student)l1.get(0);
		s1.marks=75.00;
		//((student)l1.get(0)).marks=75.00;
		
		//update the salary of employee to 75000
		employee e1 = (employee)l1.get(1);
		e1.salary=90000.00;
		//((employee)l1.get(1)).salary=75000;
		
		System.out.println("list elements are :");
		for(int i=0; i<l1.size(); i++)
		{
			System.out.println(l1.get(i));
		}
		System.out.println();
		
		((student)l1.get(0)).marks=80.00;
		((employee)l1.get(1)).salary=75000.00;
		((mobile)l1.get(2)).prise=35000;
		System.out.println("list elements are :");
		for(int i=0; i<l1.size(); i++)
		{
			System.out.println(l1.get(i));
		}
		System.out.println();
	}
}
