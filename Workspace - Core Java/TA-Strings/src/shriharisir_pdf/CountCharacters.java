
//aim -- Count of each character in the given sentence

package shriharisir_pdf;
   
class CountCharacters 
{
	public static void main(String[] args)
	{
		String st="we are reading occurrences of characters"; 
		char ch[]=st.toCharArray();
		int n=ch.length; 
		for(int i=0;i<n;i++)  
		{
			int count=1;
			for(int j=i+1;j<n;j++) 
			{
				if(ch[i]==ch[j])  
				{
					count++;   
					int k=j;    
					while(k<n-1)  
					{
						ch[k]=ch[k+1];   
						k++;
					}
					n--; 
					j--; 
				}
			} 
			System.out.println(ch[i]+" occurred "+count+" times");  
		}
	}
} 