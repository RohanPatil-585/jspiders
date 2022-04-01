package org.jspiders.weaponApp.util;
import org.jspiders.weaponApp.dao.WeaponDAO;
import org.jspiders.weaponApp.dto.WeaponDTO;

public class ReadTester 
{
	public static void main(String[] args) 
	{
		WeaponDAO dao = new WeaponDAO();
		WeaponDTO dto = dao.fatchById(5);
		if(dto!=null)
		{
			System.out.println(dto);
			System.out.println(dto.getModel());
		}
		else
		{
			System.out.println("object is not found...");
		}
	}
}