package queueExample;

public class pen implements Comparable
{
	String name;
	String color;
	double prise;
	public pen(String name, String color, double prise)
	{
		this.name = name;
		this.color = color;
		this.prise = prise;
	}
	
	public String toString()
	{
		return "pen[name ="+name+"color ="+color+"prise ="+prise+"]";
	}

	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
