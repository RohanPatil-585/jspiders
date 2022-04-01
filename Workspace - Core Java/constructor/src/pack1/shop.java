package pack1;
import java.util.Scanner;
public class shop 
{
	private String product_name;
	private int product_id;
	private double price;
	private double quantity;
	
	public shop(String product_name, int product_id, double price,
			double quantity) {
		super();
		this.product_name = product_name;
		this.product_id = product_id;
		this.price = price;
		this.quantity = quantity;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
}
