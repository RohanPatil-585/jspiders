package sortingUsingComparator;

import java.util.Comparator;

public class byName implements Comparator
{

	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		employee e1 = (employee)arg0;
		employee e2 = (employee)arg1;
		return e1.name.compareTo(e2.name);
	}
	
}
