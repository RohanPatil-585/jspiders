package pack1;

public class student extends person 
{
	int stu_id;
	String stream;
	
	public student(String name, int id, String address, String gender, int age, int stu_id, String stream)
	{
		super(name, id, address, gender, age);
		this.stu_id = stu_id;
		this.stream = stream;
	}

	public int getStu_id() {
		return stu_id;
	}

	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}	
}
