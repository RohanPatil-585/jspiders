package queueExample;

public class mobile implements Comparable
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

	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
