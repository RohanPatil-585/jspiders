package collection_list;

import java.util.ArrayList;

public class arraylist 
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add(new student(01, "rohan", 90));
		a1.add(new employee(123, "ronak", 50000.00));
		a1.add(new pen("cello", "red", 10.00));
		a1.add(new mobile(3255, "smart", 30000.00));
		
		System.out.println("size = "+a1.size());
		System.out.println("is arraylist empty ?? "+a1.isEmpty());
		
		
	}
}
