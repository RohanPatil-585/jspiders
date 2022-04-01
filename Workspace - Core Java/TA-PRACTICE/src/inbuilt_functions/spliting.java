package inbuilt_functions;

public class spliting
{
	public String[] split(String sentence)
	{
		int count = 1;
		int k = 0;		
		char[] ch = sentence.toCharArray();
		sentence = "";
		
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]==' ')
			{
				count++;
			}
		}
		String[] array = new String[count];
		for (int i = 0; i < ch.length; i++)
		{
			if(ch[i]==' ')
			{
				array[k++]=sentence;
				sentence = "";
			}
			else
			{
				sentence = sentence + ch[i];
			}
			if(i == ch.length-1)
			{
				array[k] = sentence; 
			}
		}
		System.out.println("count is = "+count);
		return array;
	}
	public static void main(String[] args) 
	{
		spliting s1 = new spliting();
		String str = "rohan shiivaji bhai patil";
		String[] result = s1.split(str);
		for (int i = 0; i < result.length; i++) 
		{
			System.out.println(result[i]);
		}
	}
}