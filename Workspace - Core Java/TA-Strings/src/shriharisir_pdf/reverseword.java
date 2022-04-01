package shriharisir_pdf;

import java.util.Scanner;
class ReverseWord
{  
	public static void main(String[] args)
	{ 
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter your sentence:"); 
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		st=""; 
		for (int i=0;i<ch.length ;i++ )
		{    int k=i;  
		while (i<ch.length && ch[i]!=' ')  
		{  
			i++; 
		}  
		int j=i-1; 
		while (j>=k) 
		{ 
			st=st+ch[j];  
			j--;  
		}    
		if (i<ch.length)  
		{    
			st=st+ch[i];
		} 
		} 
		System.out.println(st);
		} 
	} 