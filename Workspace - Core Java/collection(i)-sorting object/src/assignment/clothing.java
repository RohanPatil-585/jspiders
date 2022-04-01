package assignment;

public class clothing implements Comparable 
{

	private int cloth_id;
	private String cloth_brand;
	private double cloth_price;
	
	public clothing(int cloth_id, String cloth_brand, double cloth_price) 
	{
		this.cloth_id = cloth_id;
		this.cloth_brand = cloth_brand;
		this.cloth_price = cloth_price;
	}

	public int getCloth_id() 
	{
		return cloth_id;
	}

	public void setCloth_id(int cloth_id) 
	{
		this.cloth_id = cloth_id;
	}
	
	public String getCloth_brand() 
	{
		return cloth_brand;
	}

	public void setCloth_brand(String cloth_brand) 
	{
		this.cloth_brand = cloth_brand;
	}

	public double getCloth_price() 
	{
		return cloth_price;
	}

	public void setCloth_price(double cloth_price) 
	{
		this.cloth_price = cloth_price;
	}

	public String toString() {
		return "clothing [cloth_id=" + cloth_id + ", cloth_brand="
				+ cloth_brand + ", cloth_price=" + cloth_price + "]";
	}

	public int compareTo(Object e) 
	{
		clothing c1 = (clothing)e;
		return this.cloth_id - c1.cloth_id;
	}
}
