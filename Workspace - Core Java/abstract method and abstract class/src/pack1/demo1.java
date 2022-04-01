package pack1;

abstract public class demo1 
{
	static int x = 12;
		   int y =34;
		public demo1()
		{
			super();
			System.out.println("running constructor...");
		}
		
		static void disp()
		{
			System.out.println("running static disp().....");
		}
		
		void view()
		{
			System.out.println("running none static view()....");
		}
		
		abstract void test();
}
