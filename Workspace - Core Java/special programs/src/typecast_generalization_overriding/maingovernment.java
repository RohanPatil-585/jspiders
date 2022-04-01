package typecast_generalization_overriding;
import java.util.Scanner;
class person
{
	private int age;
	private String name;
	static int count=0;
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
	
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		person.count = count;
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
	private int rollno;
	private double marks;
	static int count=0;	
	private String student_status = "no";
	public student(int age, String name, int rollno, double marks) 
	{
		super(age, name);
		this.rollno = rollno;
		this.marks = marks;
	}
	void details()
	{
	//	System.out.println("student name = "+name+student age = "+age+student rollno = "+rollno+student marks = "+marks);
	//	System.out.println("student age = "+age);
	//	System.out.println("student rollno = "+rollno);
	//	System.out.println("student marks = "+marks);
	}
	
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		student.count = count;
	}
	public String getStudent_status() {
		return student_status;
	}
	public void setStudent_status(String student_status) {
		this.student_status = student_status;
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
	private int id;
	private double salary;
	static int count=0;
	public employee(int age, String name, int id, double salary)
	{
		super(age, name);
		this.id = id;
		this.salary = salary;
	}
	
	void details()
	{
		System.out.println("employee name = "+getName());
		System.out.println("employee age = "+getAge());
		System.out.println("employee id = "+getId());
		System.out.println("employee salary = "+getSalary());
	}
	
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		employee.count = count;
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
	
	void schollership(student[] arg1, double arg2)
	{
		for(int i=0; i<student.getCount(); i++)
		{			
			if( arg1[i].getMarks() >= arg2)
			{
				System.out.println("award schollership to "+arg1[i].getName());
				arg1[i].setStudent_status("yes");
			}
			else
			{
				System.out.println(arg1[i].getName() +" not eligible for schollership");
				arg1[i].setStudent_status("no");
			}
		}
	}
	
	void tax(employee[] arg1, int arg2)
	{
		for(int i=0; i<employee.count; i++)
		{	
			if(arg1[i].getSalary() > 50000)
			{
				System.out.println(arg1[i].getName() +" eligible for tax");
				//arg1[i].("Yes");
				arg1[i].setSalary(arg1[i].getSalary()-(arg1[i].getSalary()*arg2)/100);
			}
			else
			{
				System.out.println(arg1[i].getName() +" not eligible for tax");
			}
		}
	}
	
	void enrollaadhar(person[] arg1)
	{
		//System.out.println(arg1[i].name +" enrolled for aadhar");
			if(arg1[0] instanceof student) 
			{
				System.out.println("passed object is student1");
			for(int i=0;i<student.getCount();i++)
			{
				System.out.println(arg1[i].getName() +" enrolled for aadhar");
				student st1 = (student)arg1[i];
				System.out.println(st1.getRollno());
				System.out.println(st1.getMarks());
			}
			}
			else if(arg1[0] instanceof employee)
			{
				System.out.println("passed object is employee");
				for(int i=0;i<employee.getCount();i++)
				{
					System.out.println(arg1[i].getName() +" enrolled for aadhar");
					employee emplo1 = (employee)arg1[i];
					System.out.println(emplo1.getId());
					System.out.println(emplo1.getSalary());
				}
			}
			else if(arg1[0] instanceof person)
			{
				System.out.println("passed object is person1");
			}
		}
	}

public class maingovernment 
{
	public static void main(String[] args) 
	{
		int ch=1;
		int ch1 = 1;
		int ch2 = 1;
		//int count = 0;
		Scanner sc = new Scanner(System.in);
		person[] pa1 = new person[100];
		student[] stu1 = new student[100];
		employee[] emp1 = new employee[100];
		government g1 = new government();
		while(ch<5)
		{
			System.out.println("\t 1. person \n\t 2. student \n\t 3. employee \n\t 4. extra operations \n\t 5. exit");
			System.out.println("enter your choice ... ");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1:
						System.out.println("=== person ===");
						while(ch<3)
						{
							System.out.println("\t 1.add person \n\t 2.display person \n\t 3.exit");
							System.out.println("enter your choice ... ");
							ch = sc.nextInt();
							switch(ch)
							{
								case 1:
										System.out.println("=== add person ===");
										System.out.println("enter person name = ");
										String name = sc.next();
										System.out.println("enter person age = ");
										int age = sc.nextInt();
										pa1[person.getCount()] = new person(age,name);
										person.count++;
										System.out.println();
										break;
								case 2:
										System.out.println(" === display person ===");
										if(person.getCount()==0)
										{
											System.out.println("please enter records first .... ");
										}
										else
										{
											if(person.getCount()>0)
											{											
												for(int i=0; i<person.getCount(); i++)
												{	
													g1.enrollaadhar(pa1);
													pa1[i].details();
													System.out.println();
													//	System.out.println("\t"+pa1[i].getName()+"\t"+pa1[i].getAge());
												}
											}
										}
										break;
							}
						}
					break;
				case 2:
						System.out.println(" === student ===");
						while(ch<3)
						{
							System.out.println("\t 1.add student \n\t 2.display student \n\t 3.exit");
							System.out.println("enter your choice ... ");
							ch = sc.nextInt();
							switch(ch)
							{
								case 1:
										System.out.println("=== add student ===");
										System.out.println("enter student name = ");
										String name = sc.next();
										System.out.println("enter student age = ");
										int age = sc.nextInt();
									
										System.out.println("enter student rollno = ");
										int rollno = sc.nextInt();
										System.out.println("enter student marks = ");
										double marks = sc.nextDouble();

										stu1[student.getCount()] = new student(age,name, rollno, marks);
										student.count++;
										System.out.println();
										break;
								case 2:
										System.out.println(" === display student ===");
										if(student.getCount()==0)
										{
											System.out.println("please enter records first .... ");
										}
										else
										{											
											if(student.getCount()>0)
											{		
												g1.enrollaadhar(stu1);
												System.out.println("\t name\tage\trollno\tmarks\tstatus ");
												System.out.println(" \t ===================================== ");
												for(int i=0; i<student.getCount(); i++)
												{	
													//stu1[i].details();
													System.out.println("\t"+stu1[i].getName()+"\t"+stu1[i].getAge()+"\t"+stu1[i].getRollno()+"\t"+stu1[i].getMarks()+"\t"+stu1[i].getStudent_status());
													System.out.println();
													//	System.out.println("\t"+pa1[i].getName()+"\t"+pa1[i].getAge());
												}
											}
										}
										break;
							}
						}

					break;
						
				case 3:
						System.out.println(" === employee === ");
						while(ch1<3)
						{
							System.out.println("\t 1.add employee \n\t 2.display employee \n\t 3.exit");
							System.out.println("enter your choice ... ");
							ch1 = sc.nextInt();
							switch(ch1)
							{
								case 1:
										System.out.println("=== add employee ===");
										System.out.println("enter employee name = ");
										String name = sc.next();
										System.out.println("enter employee age = ");
										int age = sc.nextInt();
									
										System.out.println("enter employee id = ");
										int id = sc.nextInt();
										System.out.println("enter employee salary = ");
										double salary = sc.nextDouble();

										emp1[employee.getCount()] = new employee(age,name, id, salary);
										employee.count++;
										System.out.println();
										break;
								case 2:
										System.out.println(" === display employee ===");
										if(employee.getCount()==0)
										{
											System.out.println("please enter records first ... ");
										}
										else
										{											
											if(employee.getCount()>0)
											{	
												System.out.println("\t name \t age \t id \t salary");
												System.out.println("\t ==============================");
												for(int i=0; i<employee.getCount(); i++)
												{	
													//g1.enrollaadhar(emp1);
												//	emp1[i].details();
													System.out.println("\t"+emp1[i].getName()+"\t"+emp1[i].getAge()+"\t"+emp1[i].getId()+"\t"+emp1[i].getSalary());
													System.out.println();
													
													//	System.out.println("\t"+pa1[i].getName()+"\t"+pa1[i].getAge());
												}
												g1.enrollaadhar(emp1);
											}
										}
										break;
							}
						}

					break;
						
				case 4:
						System.out.println("=== extra options ===");
					//	int ch1=1;
						while(ch2<4)
						{
							System.out.println("\t 1. schollership \n\t 2. tax \n\t 3. enroll aadhar \n\t 4.exit");
							System.out.println("enter your choice = ");
							ch2 = sc.nextInt();
							switch(ch2)
							{
								case 1:
										System.out.println("=== Schollership ===");
										System.out.println("enter student marks = ");
										double marks = sc.nextDouble();
										g1.schollership(stu1, marks);
									
											if(student.getCount()>0)
											{		
												for(int i=0; i<student.getCount(); i++)
												{	
													stu1[i].details();
													System.out.println();
													//	System.out.println("\t"+pa1[i].getName()+"\t"+pa1[i].getAge());
												}
											}
										

										break;
										
								case 2:
										System.out.println("=== tax ===");
							
										System.out.println("enter tax in [%] = ");
										int percentage = sc.nextInt();
										g1.tax(emp1 , percentage);
										break;
									
								case 3:
										System.out.println("=== enroll for aadhar ===");
										break;	
							}
						}
						break;
			}
		}
		//government g1 = new government();
		
		//person p1 = new person(22,"rohan");
		
		//employee e1 = new employee(18,"ronak",007,60000.00);
		//student s1 = new student(19,"jay",18,75.50);
		
	//	g1.schollership(s1);
	//	System.out.println();
		
	//	g1.tax(e1);
	//	System.out.println();
		
		//g1.enrollaadhar(p1);
		//p1.details();
		//System.out.println();
		
		//g1.enrollaadhar(s1);
		//s1.details();
		//System.out.println();
		
		//g1.enrollaadhar(e1);
		//e1.details();
		sc.close();
	}
}
