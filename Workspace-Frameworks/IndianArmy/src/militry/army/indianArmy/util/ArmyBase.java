package militry.army.indianArmy.util;

import java.util.Scanner;
import militry.army.indianArmy.dao.IndianArmyDAO;
import militry.army.indianArmy.dto.IndianArmyDTO;

public class ArmyBase 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		IndianArmyDTO dto = new IndianArmyDTO();
//		System.out.println("enter regimentid...");
//		int regimentid = s1.nextInt();
//		dto.setRegimentId(regimentid);
		System.out.println("enter regimentType...");
		String regimenttype = s1.next();
		dto.setRegimentType(regimenttype);
		System.out.println("enter batallian...");
		String battalians = s1.next();
		dto.setBattalian(battalians);
		System.out.println("enter platuns...");
		int platunNumber=s1.nextInt();
		dto.setPlatuns(platunNumber);
		System.out.println("enter name of sateliteSupport...");
		String sateliteSupport = s1.next();
		dto.setSateliteSupport(sateliteSupport);
		System.out.println("enter name of artilary support...");
		String artilary = s1.next();
		dto.setArtilarySupport(artilary);
		System.out.println("enter strength...");
		int strength = s1.nextInt();
		dto.setStrength(strength);
		IndianArmyDAO dao = new IndianArmyDAO();
		dao.save(dto);
	}
}