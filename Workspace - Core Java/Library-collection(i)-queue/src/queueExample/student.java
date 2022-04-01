package queueExample;

public class student implements Comparable
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
	
	public String toString()
	{
		return "student[rollno ="+rollno+","+"name ="+name+","+"marks ="+marks+"]";
	}

	public int compareTo(Object arg0) 
	{
		// TODO Auto-generated method stub
		return 0;
	}

}
