package EqualsWithoutOverriding;

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
}
