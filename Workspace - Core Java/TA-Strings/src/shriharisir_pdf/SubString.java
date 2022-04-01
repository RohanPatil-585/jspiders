
// aim -- Find the substring in the given sentence

package shriharisir_pdf;

 import java.util.Scanner;
 class SubString
 {
	 static boolean check(String st1,String st2) 
	 {
		 char[] c1=st1.toCharArray();  
		 char[] c2=st2.toCharArray(); 
		 for(int i=0;i<c1.length;i++)
		 {
			 int k=i;
			 //int i++;
			 int j=0;
			 	while(k<c1.length && j<c2.length && c1[k]==c2[j])
				 //while(i<c1.length && j<c2.length && c1[i]==c2[j])  
				 {
				 k++;    
				 //i++;
				 j++;
				 } 
			 	if(j==c2.length && (i==0 || c1[i-1]==' ') && (k==c1.length || c1[k]==' '))
			 		return true; 
			 	//i--;  
		}
		 return false;
	}
	 public static void main(String[] args)
	 {
		 Scanner sc = new Scanner(System.in);  
		 System.out.println("Enter the main string:");
		 String ms=sc.nextLine();
		 System.out.println("Enter the sub string:"); 
		 String ss=sc.nextLine();
		 boolean rs=check(ms,ss);
		 if(rs)   
			 System.out.println("yes");   
		 else  
			 System.out.println("no");
	 }
 }