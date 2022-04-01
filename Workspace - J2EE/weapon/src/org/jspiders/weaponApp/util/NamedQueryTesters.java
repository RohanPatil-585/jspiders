package org.jspiders.weaponApp.util;

import java.util.List;

import org.jspiders.weaponApp.dao.WeaponDAONamedQueries;
import org.jspiders.weaponApp.dto.WeaponDTO;

public class NamedQueryTesters 
{
	public static void main(String[] args) 
	{
		WeaponDAONamedQueries nq = new WeaponDAONamedQueries();
		List<WeaponDTO> list = nq.fatchAllByNamedQuery();
		list.forEach(dto->{System.out.println(dto);});
		
		System.out.println();
		new WeaponDAONamedQueries().fatchRangeByModel("minimi").forEach(dto->{System.out.println(dto);});
		
		System.out.println();
		System.out.println(new WeaponDAONamedQueries().countAll());
		
		System.out.println();
		new WeaponDAONamedQueries().sortingRecord().forEach(dto->{System.out.println(dto);});
	}
}
