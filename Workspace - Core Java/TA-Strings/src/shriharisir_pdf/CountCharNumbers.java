
// aim -- To count how many uppercase, lowercase, digit, vowels, consonants, special symbol in given sentence

package shriharisir_pdf;
  
import java.util.Scanner;
class CountCharNumbers
{
	public static void main(String[] args)
	{
		int uc=0,lc=0,dc=0,vc=0,cc=0,sc=0; 
		Scanner s=new Scanner(System.in); 
		System.out.println("Enter the String:");
		String st=s.nextLine();  
		char ch[]=st.toCharArray(); 
		for(int i=0;i<ch.length;i++)  
		{
			if(ch[i]>='A' && ch[i]<='Z')  
			{
				uc++;  
				if(ch[i]=='A' ||  ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U')
					vc++;
				else 
					cc++;
			}
			else if(ch[i]>='a' && ch[i]<='z')  
			{
				lc++;  
				if(ch[i]=='a' ||  ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')  
					vc++; 
				else 
					cc++;
			}
			else if(ch[i]>='0' && ch[i]<='9')  
				dc++;    
			else 
				sc++;
			}
		System.out.println("uppercase:"+uc);
		System.out.println("lowercase:"+lc);
		System.out.println("vowels:"+vc);
		System.out.println("consonants:"+cc);
		System.out.println("digits:"+dc);
		System.out.println("special characters:"+sc); 
		}
	} 