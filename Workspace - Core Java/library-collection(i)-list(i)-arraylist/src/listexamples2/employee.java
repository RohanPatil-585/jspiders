package listexamples2;

public class employee 
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
		return "employee[id ="+id+",name ="+name+",salary ="+salary+"]";
	}
}
