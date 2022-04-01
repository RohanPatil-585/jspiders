package equalsWithOverriding;

public class student 
{
	String name;
	int id;
	
	public student(String name, int id) 
	{
		this.name = name;
		this.id = id;
	}
	
	public String toString()
	{
		return "student["+this.name+","+this.id+"]";
	}
	
	public boolean equals(Object arg1)
	{
		student s1 = (student) arg1;//down casting   
		System.out.println("student class "+s1.name+" , "+s1.id);
		System.out.println("student class "+this.name+" , "+this.id);
		return this.id == s1.id && this.name == s1.name;		
	}
}
