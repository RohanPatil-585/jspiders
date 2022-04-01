package rohan;

import java.awt.peer.SystemTrayPeer;
import java.util.Scanner;

public class AllInOne 
{
	public static String[] split(String str)
	{
		int k = 0;
		char[] ch = str.toCharArray();
		str = "";
		int count = 1;
		for (int i = 0; i < ch.length; i++)
		{
			if(ch[i]==' ' && ch[i-1]!=' ')
			{
				count++;
			}
		}
		
		System.out.println("count = "+count);

		String[] array = new String[count];
		for (int i = 0; i < ch.length; i++)
		{
			if(ch[i]!=' ')
			{
				str = str+ch[i];
			}
			else if(ch[i]==' ' && ch[i-1]!=' ')
			{
				array[k++]=str;
				str="";
			}
			if(i==ch.length-1)
			{
				array[k++]=str;
			}
		}
		return array;
	}
	
	public static String removeSpace(String str)
	{
		char[] ch = str.toCharArray();
		str = "";
		for (int i = 0; i < ch.length; i++)
		{
			if(ch[i]!=' ')
			{
				str=str+ch[i];
			}
		}
		return str;
	}
	
	public static String reverse(String str)
	{
		char[] ch = str.toCharArray();
		str = "";
		for (int i = ch.length-1; i >= 0; i--) 
		{
			str=str+ch[i];
		}
		return str;
	}
	
	public static String reverseWordsOnPosition(String str)
	{
		String[] splitedArray = split(str);
		str="";
		for (int i = 0; i < splitedArray.length; i++)
		{
			str = str+reverse(splitedArray[i]);
		}
		return str;
	}
	
	public static String capital(String str)
	{
		char[] ch = str.toCharArray();
		str="";
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				str = str + (char)(ch[i]-32);
			}
			else if(ch[i]==' ')
			{
				str = str + ch[i];
			}
		}
		return str;
	}
	
	public static String small(String str)
	{
		char[] ch = str.toCharArray();
		str="";
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
				str = str + (char)(ch[i]+32);
			}
			else if(ch[i]==' ')
			{
				str = str + ch[i];
			}
		}
		return str;
	}
	public static String firstAlphabetOfWordCapital(String str)
	{
		String split[] = split(str);
		str = "";
		for (int i = 0; i < split.length; i++)
		{
			char[] ch = split[i].toCharArray();
			for (int j = 0; j < ch.length; j++)
			{
				if(j==0)
				{
					if(ch[j]>='a' && ch[j]<='z')
					{						
						str = str + (char) (ch[j]-32);
					}
				}
				else
				{					
					str = str + ch[j];
				}
			}
			str = str + " ";
		}
		return str;
	}
	
	public static String firstAlphabetOfWordSmall(String str)
	{
		String split[] = split(str);
		str = "";
		for (int i = 0; i < split.length; i++)
		{
			char[] ch = split[i].toCharArray();
			for (int j = 0; j < ch.length; j++)
			{
				if(j==0)
				{
					if(ch[j]>='A' && ch[j]<='Z')
					{						
						str = str + (char) (ch[j]+32);
					}
				}
				else
				{					
					str = str + ch[j];
				}
			}
			str = str + " ";
		}
		return str;
	}

	public static String removeCharacter(String str , char ch)
	{
		char[] ch1 = str.toCharArray();
		str = "";
		for (int i = 0; i < ch1.length; i++)
		{
			if(ch1[i]==ch)
			{
				ch1[i]=' ';
				str = str + ch1[i];
			}
			str = str + ch1[i];
		}
		return str;
	}
	
	public static String encryption(String str , String EncDycKey)
	{
		char[] chStr = str.toCharArray();
		str = "";
		int encNum = 0;
		char[] chEnc = EncDycKey.toCharArray();
		EncDycKey = "";
		
		for (int j = 0; j < chEnc.length; j++) 
		{
			encNum = encNum + (int)(chEnc[j]);
		}
		System.out.println("encryption number = "+encNum);
		
		for (int i = 0; i < chStr.length; i++)
		{
			str = str + (char)(chStr[i])*encNum + " ";
		}
		
		return str;
	}
	
	public static String Decryption(String str , String DycKey)
	{
		char[] chStr = str.toCharArray();
		str = "";
		int encNum = 0;
		char[] chDyc = DycKey.toCharArray();
		DycKey = "";
		
		for (int j = 0; j < chDyc.length; j++) 
		{
			encNum = encNum + (int)(chDyc[j]);
		}
		
		for (int i = 0; i < chStr.length; i++)
		{
			int intStr = chStr[i]/(encNum); 
		}
		return str;
	}
	
	
	public static String wordSwap(String str)
	{
		String[] strarray = split(str);
		int lstStr = strarray.length;
		str = "";
		int ch = 0;
		System.out.println("===== swapping =====");
		System.out.println("1. swap all word \t 2. swap only first and last word");
		Scanner s1 = new Scanner(System.in);
		int num = s1.nextInt();
		
		switch (num) 
		{
		case 1:
			System.out.println("*************** rohan shivaji bhai patil *****************");
			for (int i = 0; i < strarray.length-1; i++)
			{
					System.out.println("###"+lstStr);
					String first1 = strarray[i];
					strarray[i] = strarray[lstStr--];
					strarray[lstStr] = first1;
					
					str = str + strarray[i];
			}
			break;
			
		case 2:
			
			break;

		default:
			break;
		}
		return str;
	}
	public static void main(String[] args)
	{
		String str = "rohan shivaji bhai patil";
		String capitalString = "ROHAN SHIVAJI BHAI PATIL";
		System.out.println("split function.........................");
		String result[] = split(str);
		for (int i = 0; i < result.length; i++)
		{
			System.out.println(result[i]);
		}
		
		System.out.println("remove space...........................");
		String removedSpace = removeSpace(str);
		System.out.println(removedSpace);
		
		System.out.println("reverse String.........................");
		String reverse = reverse(str);
		System.out.println(reverse);
		
		System.out.println("resverse words at position.............");
		String revWord = reverseWordsOnPosition(str);
		System.out.println(revWord);
		
		System.out.println("capital................................");
		String StringCapital = capital(str);
		System.out.println(StringCapital);
		
		System.out.println("small..................................");
		String StringSmall = small(capitalString);
		System.out.println(StringSmall);
		
		System.out.println("first alphabate of word Capital .......");
		String firstAlphabateCapital = firstAlphabetOfWordCapital(str);
		System.out.println(firstAlphabateCapital);
		
		System.out.println("first alphabate of word small .......");
		String firstAlphabateSmall = firstAlphabetOfWordSmall(capitalString);
		System.out.println(firstAlphabateSmall);
		
		System.out.println("remove enterd character  .......");
		String remochar = removeCharacter(str, 'h');
		System.out.println(remochar);
		
		System.out.println("encryption  .......");
		String encryptedString = encryption(str, "rohan");
		System.out.println(encryptedString);
		
//		System.out.println("decryption  .......");
//		System.out.println("encrypted string = "+encryptedString);
//		String decryptionString = Decryption(encryptedString, "rohan");
//		System.out.println(decryptionString);
		
		System.out.println("swapping ............");
		String swapping = wordSwap(str);
		System.out.println(swapping);
	}
}