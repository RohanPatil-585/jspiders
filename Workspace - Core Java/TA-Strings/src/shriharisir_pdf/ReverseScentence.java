package shriharisir_pdf;

import java.util.Scanner;
class ReverseScentence 
{
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your sentence:");
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		st="";
		for (int i=ch.length-1 ; i>=0 ; i-- )
		{
			int k=i; 
			while (i>=0 && ch[i]!=' ') 
			{
				i--;   
			}
			int j=i+1; 
			while (j<=k) 
			{
				st=st+ch[j]; 
				j++;
			} 
			if(i>=0)
				st=st+ch[i]; 
		}
		System.out.println(st);
	}
} 