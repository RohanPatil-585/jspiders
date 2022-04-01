package org.jspiders.weaponApp.util;

import org.jspiders.weaponApp.dao.WeaponDAO;

public class updateTester 
{
	public static void main(String[] args) 
	{
		WeaponDAO dao = new WeaponDAO();
		dao.update(4, "rocketLauncher");
	}
}
