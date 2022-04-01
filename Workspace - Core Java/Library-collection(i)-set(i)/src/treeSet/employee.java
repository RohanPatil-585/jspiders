package treeSet;

public class employee implements Comparable
{
	int id;
	String name;
	double salary;
	
	public employee(int id, String name, double salary) 
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString()
	{
		return "employee[id = "+id+ "," + "name = "+name+ "," + "salary = "+salary+"]";
	}

	public int compareTo(Object arg0) 
	{
		// TODO Auto-generated method stub
		employee e1 = (employee)arg0;
		return this.name.compareTo(e1.name);
	}
}
