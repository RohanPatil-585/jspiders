package org.jspiders.weaponApp.util;

import org.jspiders.weaponApp.dao.WeaponDAO;
import org.jspiders.weaponApp.dto.WeaponDTO;

public class tester 
{
	public static void main(String[] args) 
	{
		WeaponDTO dto = new WeaponDTO();
		dto.setId(1);
		dto.setType("machingun");
		dto.setPrice(90.00);
		dto.setModel("minimi");
		dto.setRange(9999.99);
		WeaponDAO dao = new WeaponDAO();
		dao.save(dto);
	}
}