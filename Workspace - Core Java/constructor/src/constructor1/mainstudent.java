package constructor1;

import java.util.Scanner;

class mainstudent 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the size of array");
		int length = s1.nextInt();
		student[] st1 = new student[length];

		for(int i=0; i<st1.length; i++)
		{
			System.out.println("enter student name = ");
			String sname = s1.next();

			System.out.println("enter student rollno = ");
			int sroll = s1.nextInt();

			System.out.println("enter student marks = ");
			int smarks = s1.nextInt();
			
			//st[i] = new student(sname, sid, sroll);
			st1[i] = new student();
			st1[i].setname(sname);
			st1[i].setrollno(sroll);
			st1[i].setmarks(smarks);
		}
		
		System.out.println("name"+"\t"+"rollno"+"\t"+"marks");
		System.out.println("-------------------------------");
		for(int i=0; i<st1.length; i++)
		{
			System.out.println(st1[i].getname()+"\t"+st1[i].getrollno()+"\t"+st1[i].getmarks());
		}
	}
}