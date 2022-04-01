package shriharisir_pdf;

import java.util.Scanner; 
class WordCount 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter your sentence:");  
		String st=sc.nextLine();  
		char ch[]=st.toCharArray(); 
		int count=0;  
		for (int i=0;i<ch.length ;i++ )
		{    
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ') 
				count++;
		}
		System.out.println("Number of words in sentence:"+count); 
	}
} 