package pack1;

public class employee extends person
{
	int id;
	int salary;
	
	public employee(String name, int age, int id, int salary) {
		super(name, age);
		this.id = id;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
