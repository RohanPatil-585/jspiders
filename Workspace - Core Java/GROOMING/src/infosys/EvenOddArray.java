package infosys;

public class EvenOddArray 
{
	public static String[] split(String str)
	{
		char[] ch = str.toCharArray();
		str = "";
		int count = 1;
		int k = 0;
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]==' ' && ch[i-1]!=' ')
			{
				count++;
			}
		}
		
		String[] array = new String[count];
		
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]!=' ')
			{
				str = str + ch[i];
			}
			else if(ch[i]==' ' && ch[i-1]!=' ')
			{
				array[k++]=str;
				str = "";
			}
			if(i==ch.length-1)
			{
				array[k++]=str;
			}
		}
		return array;
	}
	
	public static void main(String[] args) 
	{
		String str = "rohan dipak ronak divyesh jay nitesh";
		String[] splitarray = split(str);
		for (int i = 0; i < splitarray.length; i++) 
		{
			System.out.print(splitarray[i]+" ");
		}
		str = "";
		for (int i = 0; i < splitarray.length; i++) 
		{
			if(i%2==0)
			{
				str = str + splitarray[i]+" ";
			}
		}
		for (int i = 0; i < splitarray.length; i++) 
		{
			if(i%2!=0)
			{
				str = str + splitarray[i]+" ";
			}
		}
		System.out.println();
//		for (int i = 0; i < splitarray.length; i++) 
//		{
//			System.out.print(splitarray[i]+" ");
//		}
		System.out.println();
		System.out.println(str);
	}
}
