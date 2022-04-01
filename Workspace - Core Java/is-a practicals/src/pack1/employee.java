package pack1;

public class employee extends person
{
	int emp_id;
	String designetion;
	int salary;
	
	public employee(String name, int id, String address, String gender, int age, int emp_id, String designetion, int salary)
	{
		super(name, id, address, gender, age);
		this.emp_id = emp_id;
		this.designetion = designetion;
		this.salary = salary;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getDesignetion() {
		return designetion;
	}

	public void setDesignetion(String designetion) {
		this.designetion = designetion;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}	
}
