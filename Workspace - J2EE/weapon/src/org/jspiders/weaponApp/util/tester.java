package org.jspiders.weaponApp.util;

import org.jspiders.weaponApp.dao.WeaponDAO;
import org.jspiders.weaponApp.dto.WeaponDTO;

public class tester 
{
	public static void main(String[] args) 
	{
		WeaponDTO dto = new WeaponDTO();
		dto.setId(5);
		dto.setType("pistol");
		dto.setPrice(50.00);
		dto.setModel("eagle");
		dto.setRange(4444.99);
		WeaponDAO dao = new WeaponDAO();
		dao.save(dto);
	}
}