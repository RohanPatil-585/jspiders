package assignment;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
public class flipcart 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		
		TreeSet tree1 = new TreeSet();
		
		tree1.add(new electornics(01, "mobile - mi4", 10999));
		tree1.add(new electornics(07, "mobile - mi4 a",9999));
		tree1.add(new electornics(05, "laptop - compaq620", 45999));
		tree1.add(new electornics(03, "laptop - dell notebook", 35999));
		tree1.add(new electornics(02, "tv - bravia", 70999));
		tree1.add(new electornics(04, "tv - QHD",99999));
	
		Iterator i1 = tree1.iterator();
		while(i1.hasNext())
		{
			Object o1=i1.next();
			System.out.println(o1);
		}
		
		System.out.println();
		
		TreeSet tree2 = new TreeSet();
		
		tree2.add(new clothing(03, "jeans - denim", 2222));
		tree2.add(new clothing(07, "jeans - levies",2300));
		tree2.add(new clothing(02, "t-shirt -denim", 3000));
		tree2.add(new clothing(01, "t-shirt - levies", 2500));
		tree2.add(new clothing(06, "shirt - hillfiger", 6000));
		tree2.add(new clothing(05, "shirt - hillfiger",1800));
		
		Iterator i2 = tree2.iterator();
		while(i2.hasNext())
		{
			Object o2 = i2.next();
			System.out.println(o2);
		}
		

		System.out.println();
		
		TreeSet tree3 = new TreeSet();
		
		tree3.add(new household(07, "mixer", 4000));
		tree3.add(new household(01, "grinder",3000));
		tree3.add(new household(03, "fan", 6000));
		tree3.add(new household(04, "owen", 2000));
		tree3.add(new household(02, "table", 3500));
		tree3.add(new household(05, "ion",1000));
		
		Iterator i3 = tree3.iterator();
		while(i3.hasNext())
		{
			Object o3 = i3.next();
			System.out.println(o3);
		}
	}
}