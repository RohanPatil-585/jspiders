package specialPrograms;

import java.util.Scanner;

public class Mapping_string2 
{
	public static String mapping(int number)
	{
		String str = "";
		String strarray[][]={{"zero","one","two","three","four","five","six","seven","eight","nine"},
				{"zero","ten","twenty","therty","fourty","fifty","sixty","seventy","eighty","ninty"},
				{"zero","hundred","two hundred","three hundred","four hundred","five hundred","six hundred","seven hundred","eight hundred","nine hundred"}};
		String[] strarray2 = {"zero","eleven","twelve","therteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
		int i=0,p=0;
		if(number==0)
		{
			str = strarray2[0];
		}
		else
		{
			while(number>0)
			{
				int temp = number%10;
				number = number/10;
				if(i==0 && temp==0)
				{
					number = number / 10;
					temp = number%10;
					if(temp!=0)
					{
						str = strarray[1][temp];
						break;
					}
					else if(temp == 0)
					{
						number = number / 10;
						temp = number %10;
						if(temp!=0)
						{
							str = strarray[2][temp];
							break;
						}
					}
				}
				else
				{
					if(i==0)
					{
						p = temp;
					}
					if(i==1 && temp==1)
					{
						number = number/10;
						temp = number %10;
						str = strarray2[p];
						if(temp<0)
						{
							break;
						}
						else
						{
							str = strarray[2][temp]+" "+str;
						}
						break;
					}
				}
				str = strarray[i++][temp]+" "+str;
			}
		}
		return str;
	}
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the number...");
		int num = s1.nextInt();
		String result = mapping(num);
		System.out.println(result);
	}
}