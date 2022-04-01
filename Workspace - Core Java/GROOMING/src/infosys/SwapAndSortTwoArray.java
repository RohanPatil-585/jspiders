package infosys;
//hackker rank
public class SwapAndSortTwoArray 
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
		String[] str = {"gh","ij","that","be","to","be"};
		//String[] splitarray = split(str);
		int[] intarray = {6,0,4,3,0,1};
		
		for (int i = 0; i < str.length/2; i++) 
		{
			str[i]="-";
		}
		
		for (int i = 0; i < intarray.length-1; i++) 
		{ 
			// ab ef ab ef
			int temp = 0;
			for (int j = i+1; j < intarray.length; j++) 
			{
				if(intarray[i]>intarray[j])				//54321
				{
					temp = intarray[i];
					intarray[i] = intarray[j];
					intarray[j]=temp;
					String tempstr = str[i];
					str[i] = str[j];
					str[j] = tempstr;
				}
			}
		}
		
		for (int i = 0;i<str.length; i++)
		{
			System.out.println(intarray[i]+" "+str[i]);
		}
	}
}