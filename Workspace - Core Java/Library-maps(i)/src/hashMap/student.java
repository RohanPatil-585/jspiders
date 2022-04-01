package hashMap;

public class student 
{
	int rollno;
	String name;
	double marks;
	
	public student(int rollno, String name, double marks) 
	{
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	public int hashCode()
	{
		return rollno;
	}
	
	public boolean equals(Object arg)
	{
		student s1 = (student) arg;
		return this.hashCode()==this.hashCode();
	}
	
	public String toString()
	{
		return "student[rollno="+rollno+",name="+name+",marks="+marks+"]";
	}
}