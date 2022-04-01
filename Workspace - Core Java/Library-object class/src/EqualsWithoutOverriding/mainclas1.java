package EqualsWithoutOverriding;

import hashcode.student;

public class mainclas1 
{
	public static void main(String[] args) 
	{
		student st1 = new student("rohan", 007);
		student st2 = new student("rohan", 007);
		
		int n1 = st1.hashCode();
		System.out.println("n1 = "+n1);
		System.out.println("st1 ="+st1);
		
		System.out.println();
		
		int n2 = st2.hashCode();
		System.out.println("n2 = "+n2);
		System.out.println("st2 = "+st2);
		
		System.out.println();
		System.out.println(st1==st2);// compairs values of st1 with value of st2
		System.out.println();
		System.out.println(st1.equals(st2));// compares hashcode of st1 object with hashcode of st2 object.
		System.out.println();
		System.out.println(n1 == n2);// compairs hashcode of n1 object with hashcode of n2 object.
	}
}
