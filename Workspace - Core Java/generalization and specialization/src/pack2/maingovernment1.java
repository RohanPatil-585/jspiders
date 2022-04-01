package pack2;

class person1
{
	int age;
	String name;
	public person1(int age, String name)
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

class student1 extends person1
{
	int rollno;
	double marks;
	
	public student1(int age, String name, int rollno, double marks) 
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

class employee1 extends person1
{
	int id;
	double salary;
	
	public employee1(int age, String name, int id, double salary)
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

class government1
{
	
	void schollership(student1 arg1)
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
	
	void tax(employee1 arg1)
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
	
	void enrollaadhar(person1 arg1)
	{
		System.out.println(arg1.name +" enrolled for aadhar");
		
		if(arg1 instanceof student1) 
		{
			System.out.println("passed object is student1");
			student1 st1 = (student1)arg1;
			System.out.println(st1.rollno);
			System.out.println(st1.marks);
		}
		else if(arg1 instanceof employee1)
		{
			System.out.println("passed object is employee");
			employee1 emp1 = (employee1)arg1;
			System.out.println(emp1.id);
			System.out.println(emp1.salary);

		}
		else if(arg1 instanceof person1)
		{
			System.out.println("passed object is person1");
			
		}
	}
}

public class maingovernment1 
{
	public static void main(String[] args) 
	{
		government1 g1 = new government1();
		
		person1 p1 = new person1(22,"rohan");
		
		employee1 e1 = new employee1(18,"ronak",007,60000.00);
		student1 s1 = new student1(19,"jay",18,75.50);
		
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
