package collection_list;

public class pen 
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
}
