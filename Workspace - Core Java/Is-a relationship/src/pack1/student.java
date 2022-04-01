package pack1;

public class student extends person
{
	int rollno;
	int marks;
	public student(String name, int age, int rollno, int marks) {
		super(name, age);
		this.rollno = rollno;
		this.marks = marks;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}
