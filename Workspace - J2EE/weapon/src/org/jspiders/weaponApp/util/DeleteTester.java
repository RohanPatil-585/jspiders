package org.jspiders.weaponApp.util;

import org.jspiders.weaponApp.dao.WeaponDAO;
import org.jspiders.weaponApp.dto.WeaponDTO;

public class DeleteTester 
{
	public static void main(String[] args) 
	{
		WeaponDAO dao = new WeaponDAO();
		dao.delete(4);
	}
}
