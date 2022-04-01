package militry.army.indianArmy.util;

import java.util.Scanner;

import militry.army.indianArmy.dao.IndianArmyDAO;

public class ArmyBaseDelete 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		IndianArmyDAO armyDAO = new IndianArmyDAO();
		System.out.println("enter id to delete record...");
		int id = s1.nextInt();
		armyDAO.delete(id);
	}
}
