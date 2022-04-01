package pack1;
import java.io.ObjectInputStream.GetField;
import java.util.Scanner;
public class mainpackage {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		//System.out.println("enter the size of array = ");
		//int length = s1.nextInt();
		int length = 100;
		shop[] a1 = new shop[length];
		
		System.out.println("\t 1.add product to cart\n \t 2.show product details ");
		int ch = 1;
		int count =0;
			while(ch<3)
			{
				System.out.println("Enetr your choice = ");
				ch = s1.nextInt();
				switch(ch)
				{
				case 1:
					System.out.println("enter product name = ");
					String name = s1.next();
					
					System.out.println("enter product id = ");
					int id = s1.nextInt();
					
					System.out.println("enter product price = ");
					double pri = s1.nextDouble();
					
					System.out.println("enter product quantity = ");
					double quan = s1.nextDouble();
					
					a1[count] = new shop(name,id,pri,quan);
					count++;
					break;
					
				case 2:
					System.out.println("display product details...");
					System.out.println();
					
					System.out.println("\t name \t id \t price \t quantity");
					System.out.println("\t------------------------------------");
					for(int j=0; j<count; j++)
					{
						System.out.println("\t\t"+a1[j].getProduct_name()+"\t"+a1[j].getProduct_id()+"\t"+a1[j].getPrice()+"\t"+a1[j].getQuantity());
					}
					break;
				}
			}
		
	}

}
