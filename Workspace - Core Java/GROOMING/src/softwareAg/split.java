package softwareAg;

public class split
{
	public static String[] split(String str)
	{
		int cn=0;
		char[] ch=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]==' ' && ch[i-1]!=' ')
				cn++;
		}
		String[] st=new String[cn+1];
		int k=0;
		String temp="";
		for (int i = 0; i < ch.length; i++)
			if(ch[i]!=' ')
				temp=temp+ch[i];
			else if(ch[i]==' ' && ch[i-1]!=' ')
			{
				st[k++]=temp;
				temp="";
			}
		st[k++]=temp;
		return st;
	}
	public static void main(String[] args) {
		String str="rohan rohan    patil     rohan";
		String[] ch=split(str);
		for (int i = 0; i < ch.length; i++)
			System.out.print(ch[i]+" ");
		System.out.println(ch.length);
	}

}
