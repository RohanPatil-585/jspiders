package pack1;
import java.util.Scanner;
public class mainperson
{
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		int ch=1;
		int cho=1;
		int choi =1;
		int count =0;
		int count1 =0;
		
		student[] st1 = new student[100];
		employee[] emp = new employee[100];
		
		while(ch<3)
		{
			//System.out.println("enter person details....");
			System.out.println("\t 1.student \n \t 2.employee \n \t 3.exit");
			System.out.println("enter your choice = ");
			ch = s1.nextInt();
			switch(ch)
			{
				case 1:		
				while(cho<3)
				{
					System.out.println(" === student === ");
					System.out.println("\t 1.add student \n \t 2.display student \n \t 3.exit");
					System.out.println("enter your choice = ");
					cho = s1.nextInt();
					switch(cho)
					{
						case 1:
								System.out.println(" === add student === ");
								
								System.out.println("enter person name = ");
								String p_name = s1 .next();
								
								System.out.println("enter person id = ");
								int p_id = s1 .nextInt();
								
								System.out.println("enter person address = ");
								String p_address = s1 .next();
								
								System.out.println("enter person gender = ");
								String p_gender = s1 .next();
								
								System.out.println("enter person age = ");
								int p_age = s1 .nextInt();
								
								System.out.println("\t 1. student \n\t 2. employee");
								
								System.out.println("enter person type");
								ch = s1.nextInt();
								System.out.println("enter student id = ");
								int stu_id = s1.nextInt();
			
								System.out.println("enter student stream = ");
								String stu_stream = s1.next();
								
								 st1[count] = new student(p_name, p_id, p_address, p_gender, p_age, stu_id, stu_stream);
								//person p1 = new person();
								count++;
								break;
								
						case 2:
								System.out.println("=== display student details ===");
								if(count>0)
								{
									for(int i=0; i<count;i++)
									{
										System.out.println(st1[i].getName()+"\t"+st1[i].getId()+"\t"+st1[i].getAddress()+"\t"+st1[i].getGender()+"\t"+st1[i].getAge()+"\t"+st1[i].getStu_id()+"\t"+st1[i].getStream());
									}
								}
								break;
						
									
					}
						
				}
				break;
			
				case 2:
						
						
						while(choi<3)
						{
							System.out.println(" === employee === ");
							System.out.println("\t 1.add employee \n \t 2.display employee \n \t 3.exit");
							System.out.println("enter your choice = ");
							choi = s1.nextInt();
							switch(choi)
							{
								case 1:
										System.out.println(" === add employee === ");
										
										System.out.println("enter person name = ");
										String p_name = s1 .next();
										
										System.out.println("enter person id = ");
										int p_id = s1 .nextInt();
										
										System.out.println("enter person address = ");
										String p_address = s1 .next();
										
										System.out.println("enter person gender = ");
										String p_gender = s1 .next();
										
										System.out.println("enter person age = ");
										int p_age = s1 .nextInt();
										
										System.out.println("\t 1. student \n\t 2. employee");
										
										System.out.println("enter person type");
										ch = s1.nextInt();
										System.out.println("enter employee id = ");
										int emp_id = s1.nextInt();
										
										System.out.println("enter employee designetion = ");
										String emp_designetion = s1.next();
										
										System.out.println("enter employee salary = ");
										int emp_salary = s1.nextInt();
									
										emp[count1] = new employee(p_name, p_id, p_address, p_gender, p_age, emp_id, emp_designetion, emp_salary);
										count1++;
										break;
									
							case 2:
									System.out.println("=== display employee details ===");
									if(count1>0)
									{
											for(int i=0; i<count1;i++)
											{
												System.out.println(emp[i].getName()+"\t"+emp[i].getId()+"\t"+emp[i].getAddress()+"\t"+emp[i].getGender()+"\t"+emp[i].getId()+"\t"+emp[i].getEmp_id()+"\t"+emp[i].getDesignetion()+"\t"+emp[i].getSalary()+"\t");
											}
									}
								  break;
							}
							
						}
						break;
			}
		}	
	}
}
