package org.jspiders.weaponApp.util;

import java.util.List;

import org.jspiders.weaponApp.dao.WeaponHQLDAO;
import org.jspiders.weaponApp.dto.WeaponDTO;

public class HqlFatchDataTesters 
{
	public static void main(String[] args) 
	{
		WeaponHQLDAO hqldao = new WeaponHQLDAO();
		List<WeaponDTO> list = hqldao.fatchAll();
		System.out.println(list.size());
		list.forEach(dto->{System.out.println(dto.getModel());});
		
		System.out.println();
		hqldao.fatchAll().forEach(dto->{System.out.println(dto);});
		
		System.out.println("===========================================");
		System.out.println();
		List<String> list2 = hqldao.allTypeByModel("minimi");
		list2.forEach(dto->{System.out.println(dto);});
		System.out.println();
		hqldao.allTypeByModel("mk196A").forEach(dto->{System.out.println(dto);});
		
		System.out.println("=========");
		long count = hqldao.fatchAllCount();
//		list.forEach(dto->{System.out.println(dto);});
		System.out.println(count);
		
	}
}
