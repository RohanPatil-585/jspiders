package pack1;

public class trainers extends jspiders
{
	String subject;
	int salary;
	public trainers(String name, String branch, int branchid, String subject,int salary)
	{
		super(name, branch, branchid);
		this.subject = subject;
		this.salary = salary;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
