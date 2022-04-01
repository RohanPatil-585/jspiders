package pack1;
import java.util.Scanner;
public class mainjspiders 
{
	public static void main(String[] args) 
	{
		int ch=1;
		int cho=1;
		int count = 0;
		int count1 = 0;
		Scanner s1 = new Scanner(System.in);
		trainers[] t1 = new trainers[100];
		students[] st1 = new students[100];
		while(ch<3)
		{
			System.out.println("\t 1. trainers \n \t 2. student \n \t 3. exit");
			System.out.println("enter your choice = ");
			ch = s1.nextInt();
			switch(ch)
			{
				case 1:
						System.out.println(" === trainers === ");
						while(ch<3)
						{
							System.out.println("\t 1. add trainer \n \t 2. display trainer \n \t 3. exit");
							System.out.println("enter your choice = ");
							ch = s1.nextInt();
							switch(ch)
							{
								case 1:
										System.out.println(" === add trainer === ");
									//	System.out.println("how many trainers you want to add ??");
									//	int number = s1.nextInt();
																				
											System.out.println("enter trainer name = ");
											String name = s1.next();
											
											System.out.println("enter branch name  = ");
											String branchname = s1.next();
											
											System.out.println("enter batch id = ");
											int batchid = s1.nextInt();
											
											System.out.println("enter subject taken by = ");
											String subject = s1.next();
											
											System.out.println("enter salary = ");
											int salary = s1.nextInt();
											t1[count] = new trainers(name, branchname, batchid, subject, salary);
											count++;
										break;
								
								case 2:
										System.out.println("=== display trainers ===");
										if(count>0)
										{	
											//System.out.println("\tname\tbranch\tbatchid\tsubject\tsalary");
											//System.out.println("\t-------------------------------------");
											System.out.format("%20s%20s%20s%20s%20s","name","branch","batchid","subject","salary \n");
											
											for(int i=0; i<count; i++)
											{
												System.out.format("%20s%20s%20d%20s%20d",t1[i].getName(),t1[i].getBranch(),t1[i].getBatchid(),t1[i].getSubject(),t1[i].getSalary());
												System.out.println();
											}
										}
										break;
										
							}//switch
						}// while
				case 2:
						System.out.println(" ==== students === ");
						while(ch<3)
						{
							System.out.println("\t 1. add students \n \t 2. display students \n \t 3. exit");
							System.out.println("enter your choice = ");
							ch = s1.nextInt();
							switch(ch)
							{
							case 1:
								System.out.println(" === add students === ");
							//	System.out.println("how many trainers you want to add ??");
							//	int number = s1.nextInt();
																		
									System.out.println("enter student name = ");
									String name = s1.next();
									
									System.out.println("enter branch name  = ");
									String branchname = s1.next();
									
									System.out.println("enter batch id = ");
									int batchid = s1.nextInt();
									
									System.out.println("enter subject = ");
									String subject = s1.next();
									
									System.out.println(" === payment method === ");
									System.out.println("enter 'c' or 'C' for cash payment...");
									System.out.println("enter 'o' or 'O' for online payment...");
									System.out.println("choose payment method = ");
									char pay = s1.next().charAt(0);
									int fees;
									if(pay == 'c' || pay == 'C')
									{										
										System.out.println("enter fees = ");
										fees = s1.nextInt();
										st1[count1] = new students(name, branchname, batchid, subject, fees);
									}
									//st1[count1] = new students(name, branchname, batchid, subject, fees);
									else if(pay == 'o' || pay == 'O')
									{
										System.out.println("enter fees = ");
										fees = s1.nextInt();
										st1[count1] = new students(name, branchname, batchid, subject, fees);
									}
									count1++;
								break;
						
						case 2:
								System.out.println("=== display student ===");
								//System.out.println("Count="+count1);
								if(count1>0)
								{	
									//System.out.println("\tname\tbranch\tbatchid\tcource\tfees");
									System.out.format("%20s%20s%20s%20s%20s","name","branch","batchid","cource","fees");
									System.out.println();
									System.out.println("\t-------------------------------------");
									for(int i=0; i<count1; i++)
									{
										System.out.format("%20s%20s%20d%20s%20d",st1[i].getName(),st1[i].getBranch(),st1[i].getBatchid(),st1[i].getCource(),st1[i].getFees());
										System.out.println();
									}
								}
								break;
				
							}//switch
						}//while
			}
		}
	}
}
