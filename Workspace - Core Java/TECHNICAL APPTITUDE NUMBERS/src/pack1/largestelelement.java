package pack1;
public class largestelelement 
{
	public static void main(String[] args) 
	{
		//int a1[]=new int[6];
		//int a1[]={12,17,2,3,15,1};
		int a1[]={34,12,111,13,23,19,45};
		int fbig=0,sbig=a1[0],thlarge=0;
		for(int i=0;i<a1.length;i++)
		{
			if(fbig<a1[i])
			{
				sbig=fbig;
				fbig=a1[i];
			}
			
			if(a1[i]>sbig && a1[i]<fbig)
			{
				thlarge=sbig;
				sbig=a1[i];
			}
			if(a1[i]>thlarge && a1[i]<fbig && a1[i]<sbig)
			{
				thlarge=a1[i];
			}
			//System.out.println(key);
		}
		System.out.println("first large "+fbig);
		System.out.println("second larg "+sbig);
		System.out.println("thrid larg "+thlarge);
	}
}