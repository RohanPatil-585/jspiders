package militry.army.indianArmy.util;

import java.util.Scanner;

import militry.army.indianArmy.dao.IndianArmyDAO;

public class ArmyBaseUpdate 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		IndianArmyDAO dao = new IndianArmyDAO();
		System.out.println("enter id to update delete...");
		int id = s1.nextInt();
		System.out.println("enter regiment type...");
		String type = s1.next();
		dao.update(id, type);
	}
}