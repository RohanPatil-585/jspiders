package org.interView.sarthaaApp;

public class MaventicProgram {
	public static void main(String[] args) 
	{
		String str="I love My Mom";
		int sum=0;
		char ch[]=str.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
				sum=sum+ch[i]-64;
			}
			else if(ch[i]>='a' && ch[i]<='z')
			{
				sum=sum +ch[i]-70;
			}
			else
			{
				System.out.print(sum+" ");
				sum=0;
			}
		
			if(i==ch.length-1)
			{
				System.out.print(sum+" ");
			}
		
			
		}
		System.out.println(str);
	}

}
