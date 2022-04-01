package pack1;
class multileveldemo1
{
	int x = 12;
	void test()
	{
		System.out.println("running test()...");
	}
}
class multileveldemo2 extends multileveldemo1
{
	double y = 12.34;
	void disp()
	{
		System.out.println("running disp()...");
	}
}
class multileveldemo3 extends multileveldemo2
{
	char z = 'a';
	void view()
	{
		System.out.println("runiing view()...");
	}
}
public class multilevel_class_type 
{
	public static void main(String[] args) {
		
		multileveldemo2 d1 = (multileveldemo2) new multileveldemo3();
		System.out.println("using d1 object we can access multileveldemo1, multileveldemo2 properties");
		System.out.println(d1.x);
		System.out.println(d1.y);
		d1.test();
		d1.disp();
		System.out.println();
		
		System.out.println("using d2 object we can access multileveldemo1 properties");
		multileveldemo1 d2 = (multileveldemo1)new multileveldemo3();
		System.out.println("d1.x");
		d1.test();
		System.out.println();
		
		System.out.println("using d1 object we can access multileveldemo1, multileveldemo2, multileveldemo3 properties");
		multileveldemo3 d3 = new multileveldemo3();
		System.out.println(d3.x);
		System.out.println(d3.y);
		System.out.println(d3.z);
		d3.test();
		d3.disp();
		d3.view();
		System.out.println();
		
		System.out.println("using d2 object we can access multileveldemo1, multileveldemo2 properties");
		multileveldemo2 d4 = (multileveldemo2)d3;
		System.out.println(d4.x);
		System.out.println(d4.y);
		d1.test();
		d1.disp();
		System.out.println();
		
		System.out.println("using d5 object we can access multileveldemo1 properties");
		multileveldemo1 d5 = (multileveldemo1)d3;
		System.out.println(d5.x);
	//	System.out.println(d5.y);
		d5.test();
	//	d5.disp();
		System.out.println();


	}
}
