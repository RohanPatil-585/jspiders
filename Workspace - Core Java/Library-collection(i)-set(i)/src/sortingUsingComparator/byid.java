package sortingUsingComparator;

import java.util.Comparator;
import java.util.TreeSet;

public class byid implements Comparator
{
	
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		employee e1 = (employee)arg0;
		employee e2 = (employee)arg1;
		return (int) (e1.salary - e2.salary);
	}
	
}
