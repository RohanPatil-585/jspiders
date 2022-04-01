package maventic;

import java.util.Scanner;

public class regularExpresion 
{
	static String[] str ={"rohan","ronak","dipak","jay","divyesh","nitesh","sadab"}; 
	public static String re(String[] str,char st)
	{
		String temp = "";
		for (int i = 0; i < str.length; i++) 
		{
			char[] c = str[i].toCharArray();
			for (int j = 0; j < c.length; j++) 
			{				
				if(j==0 && c[j]==st)
				{
					
					temp = temp+str[i]+" ";
				}
			}
		}
		return temp;
	}
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter re = ");
		char restring = s1.next().charAt(0);
		String result = re(str, restring);
					
		System.out.println("result = "+result+" ");
		
	}	
}