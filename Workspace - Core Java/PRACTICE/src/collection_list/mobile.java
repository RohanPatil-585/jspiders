package collection_list;

public class mobile 
{
	int id;
	String type;
	double prise;
	public mobile(int id, String type, double prise) 
	{
		this.id = id;
		this.type = type;
		this.prise = prise;
	}
	
	public String toString()
	{
		return "mobie[id ="+id+"type ="+type+" prise="+prise+"]";
	}
}
