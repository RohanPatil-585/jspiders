package typecast_override_generalization;


class person
{
	int age;
	String name;
	public person(int age, String name)
	{
		super();
		this.age = age;
		this.name = name;
	}
	
	void details()
	{
		System.out.println("person name = "+name);
		System.out.println("person age = "+age);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

class student extends person
{
	int rollno;
	double marks;
	
	public student(int age, String name, int rollno, double marks) 
	{
		super(age, name);
		this.rollno = rollno;
		this.marks = marks;
	}
	void details()
	{
		System.out.println("student name = "+name);
		System.out.println("student age = "+age);
		System.out.println("student rollno = "+rollno);
		System.out.println("student marks = "+marks);
	}

	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
}

class employee extends person
{
	int id;
	double salary;
	
	public employee(int age, String name, int id, double salary)
	{
		super(age, name);
		this.id = id;
		this.salary = salary;
	}
	
	void details()
	{
		System.out.println("employee name = "+name);
		System.out.println("employee age = "+age);
		System.out.println("employee id = "+id);
		System.out.println("employee salary = "+salary);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}

class government
{
	
	void schollership(student arg1)
	{
		
		if(arg1.marks > 70)
		{
			System.out.println("award schollership to "+arg1.name);
		}
		else
		{
			System.out.println(arg1.name +" not eligible for schollership");
		}
	}
	
	void tax(employee arg1)
	{
		if(arg1.salary > 50000.00)
		{
			System.out.println(arg1.name +" eligible for tax");
		}
		else
		{
			System.out.println(arg1.name +" not eligible for tax");
		}
	}
	
	void enrollaadhar(person arg1)
	{
		System.out.println(arg1.name +" enrolled for aadhar");
		
		if(arg1 instanceof student) 
		{
			System.out.println("passed object is student1");
			student st1 = (student)arg1;
			System.out.println(st1.rollno);
			System.out.println(st1.marks);
		}
		else if(arg1 instanceof employee)
		{
			System.out.println("passed object is employee");
			employee emp1 = (employee)arg1;
			System.out.println(emp1.id);
			System.out.println(emp1.salary);

		}
		else if(arg1 instanceof person)
		{
			System.out.println("passed object is person1");
			
		}
	}
}

public class maingovernment2 
{
	public static void main(String[] args) 
	{
		government g1 = new government();
		
		person p1 = new person(22,"rohan");
		
		employee e1 = new employee(18,"ronak",007,60000.00);
		student s1 = new student(19,"jay",18,75.50);
		
		g1.schollership(s1);
		System.out.println();
		
		g1.tax(e1);
		System.out.println();
		
		g1.enrollaadhar(p1);
		p1.details();
		System.out.println();
		
		g1.enrollaadhar(s1);
		s1.details();
		System.out.println();
		
		g1.enrollaadhar(e1);
		e1.details();
	}
}
