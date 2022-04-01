package pack1;
class employee
{
	int id;
	String name;
	double salary;
	
	public employee(int id, String name, double salary)
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}

class finance
{
	void addbonus(employee emp, double bonus_rate)
	{
		System.out.println("update bonus to "+emp.name);
		emp.salary = emp.salary+(emp.salary * bonus_rate)/100;
	}
}
public class mainorganization 
{
	public static void main(String[] args) 
	{
		employee e1 = new employee(123,"rohan",20000);
		finance f1 = new finance();
		f1.addbonus(e1,5.0);
		
		System.out.println("employee salary = "+e1.salary);
	}
}
