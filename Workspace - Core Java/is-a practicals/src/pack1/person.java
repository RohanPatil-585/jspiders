package pack1;

public class person 
{
	private String name;
	private int id;
	private String address;
	private String gender;
	private int age;
	
	
	
	public person(String name, int id, String address, String gender, int age)
	{
		//super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.gender = gender;
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
