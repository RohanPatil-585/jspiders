package pack1;
class student
{
	int rollno;
	double percentage;
	
	public student(int rollno, double marks) 
	{
		super();
		this.rollno = rollno;
		this.percentage = percentage;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public double getpercentage() {
		return percentage;
	}

	public void setMarks(double marks) {
		this.percentage = percentage;
	}
}

class government
{
		void schollership(student stu,double schamt)
		{
			if(stu.percentage > 70)
			{
				System.out.println("stundent is eligible for schollership  = "+schamt);
			}
			else
			{
				System.out.println("student is not elegible for schollershoip");
			}
		}
}
public class maingovernment1 
{
	public static void main(String[] args) 
	{		
		student s1 = new student(8,10.0);
		government g1 = new government();
		g1.schollership(s1, 5000);
		System.out.println(s1.rollno);
	}
}
