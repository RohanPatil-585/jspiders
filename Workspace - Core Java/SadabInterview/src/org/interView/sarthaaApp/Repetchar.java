package org.interView.sarthaaApp;

public class Repetchar 
{
	 public static void main(String[] args)
	 {
	    String	 str="ABCD";
	    char ch[]=str.toCharArray();
	    for (int i = 0; i < ch.length; i++) 
	    {
	    	if(ch[i]>='A' && ch[i]<='Z')
	    	{
	    		System.out.print(ch[i]);
	    	}
	    	for (int j = 0; j < 3; j++) 
	    	{
				System.out.print((char)(ch[i]+32));
			}
			
		}

	}
	

}
