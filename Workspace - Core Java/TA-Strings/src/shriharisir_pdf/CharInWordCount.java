
//aim --  To print number of characters in each word in sentence

package shriharisir_pdf;

import java.util.Scanner;
class CharInWordCount
{
	public static void main(String[] args)
	{   
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your sentence:"); 
		String st=sc.nextLine();  
		char ch[]=st.toCharArray();
		st="";
		for (int i=0;i<ch.length ;i++ )
		{
			int c=0; 
			while (i<ch.length && ch[i]!=' ')    
			{
				st=st+ch[i]; 
				i++; 
				c++;
			} 
			st=st+c; 
			//System.out.println(st);  
		}
			System.out.println(st); 
	}
} 	

