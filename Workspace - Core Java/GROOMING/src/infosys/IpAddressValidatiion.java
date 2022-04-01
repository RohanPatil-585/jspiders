package infosys;

public class IpAddressValidatiion 
{
	public static String[] split(String str)
	{
		
		//hackerrank
		char[] ch = str.toCharArray();
		str = "";
		int count = 1;
		int k = 0;
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]=='.' && ch[i-1]!='.')
			{
				count++;
			}
		}
		
		String[] array = new String[count];
		
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]!='.')
			{
				str = str + ch[i];
			}
			else if(ch[i]=='.' && ch[i-1]!='.')
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
	
	public static boolean nonAlpha(String str)
	{
		char[] ch = str.toCharArray();
		str = "";
		boolean flag = false;
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>='0' && ch[i]<='9' || ch[i]=='.')
			{
				flag = true;
			}
			else
			{
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	public static void main(String[] args) 
	{
		//String ipaddress = "192.168.100.1";
		String ipaddress = "192.168.A00.1";
		String[] splitarray = split(ipaddress);
		boolean b = nonAlpha(ipaddress);
		int flag = 0;
		for (int i = 0; i < splitarray.length-1; i++) 
		{
			char[] ch = splitarray[i].toCharArray();
			if(splitarray.length==4 && b)
			{
				
				if(splitarray[0].length()==3 && splitarray[1].length()==3 && splitarray[2].length()<=3 && splitarray[3].length()==1)
				{				
					if(ch[i]>='0'&&ch[i]<='9')
					{						
						flag = 0;	
					}
					else
					{
						flag = 1;
						break;
					}
				}
				else
				{
					flag = 1;
				}
			}
			else
			{
				flag = 1;
			}
		}
		if(flag == 0)
		{
			System.out.println("valid ipaddress...");
		}
		else
		{
			System.out.println("invalid ipaddress...");
		}
	}
}