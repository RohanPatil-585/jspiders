package assignment;

public class household implements Comparable
{
	int item_id;
	String item_name;
	double item_price;
	
	public household(int item_id, String item_name, double item_price) 
	{
		this.item_id = item_id;
		this.item_name = item_name;
		this.item_price = item_price;
	}

	public int getItem_id() 
	{
		return item_id;
	}

	public void setItem_id(int item_id) 
	{
		this.item_id = item_id;
	}

	public String getItem_name() 
	{
		return item_name;
	}

	public void setItem_name(String item_name) 
	{
		this.item_name = item_name;
	}

	public double getItem_price() 
	{
		return item_price;
	}

	public void setItem_price(double item_price) 
	{
		this.item_price = item_price;
	}

	public int compareTo(Object e) 
	{
		household h1 = (household) e;
		return this.item_id - h1.item_id;
	}

	public String toString() {
		return "household [item_id=" + item_id + ", item_name=" + item_name
				+ ", item_price=" + item_price + "]";
	}
	
}
