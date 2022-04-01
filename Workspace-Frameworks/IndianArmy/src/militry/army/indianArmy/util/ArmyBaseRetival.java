package militry.army.indianArmy.util;

import java.util.Scanner;

import militry.army.indianArmy.dao.IndianArmyDAO;
import militry.army.indianArmy.dto.IndianArmyDTO;

public class ArmyBaseRetival 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		IndianArmyDAO dao = new IndianArmyDAO();
		System.out.println("enter id to update record...");
		int id = s1.nextInt();
		IndianArmyDTO dto = dao.retriveData(id);
		if(dto!=null)
		{
			System.out.println(dto);
			System.out.println(dto.getSateliteSupport());
		}
		else
		{
			System.out.println("data is highly confidential...");
		}
	}
}
