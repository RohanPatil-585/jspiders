
// aim -- Finding how many times each sub string is present

package shriharisir_pdf;
 import java.util.Scanner; 
 class SubStringRepeat
 {
	 static int countWord(String st1,String st2)
	 {
		 char[] c1=st1.toCharArray();
		 char[] c2=st2.toCharArray(); 
		 int count=0;  
		 for(int i=0;i<c1.length;i++)   
		 {
			 int in=-1; 
			 int k=i;  
			 int j=0;   
			 while(k<c1.length && j<c2.length && c1[k]==c2[j])
				 //while(i<c1.length && j<c2.length && c1[i]==c2[j])
				 {
				 k++;  
				 //i++; 
				 j++; 
				 }
			 if(j==c2.length && (i==0 || c1[i-1]==' ') && (k==c1.length || c1[k]==' '))
			 { 
				 count++;  
			 }
			 //i--;  
		 }
		 return count;
		 //return in;
	 }
	 public static void main(String[] args)
	 {  
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the main string:");
		 String ms=sc.nextLine();
		 System.out.println("Enter the sub string:"); 
		 String ss=sc.nextLine(); 
		 int rs=countWord(ms,ss);  
		 if(rs>0) 
			 System.out.println("yes found "+rs+" times");   
		 else
			 System.out.println("not found");
	}
} 