package org.jspiders.computerApp.util;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.jspiders.computerApp.dao.ComputerDAO;
import org.jspiders.computerApp.dto.ComputerDTO;
import org.jspiders.computerApp.services.InsertDataToDatabase;

public class databaseTester 
{
	public static void main(String[] args) throws Exception 
	{
		InsertDataToDatabase idb = new InsertDataToDatabase();
		Set<ComputerDTO> set = idb.fatchDataFromFile("computerdetails.txt");
		Iterator<ComputerDTO> i1 = set.iterator();
		ComputerDAO dao = new ComputerDAO();
		while(i1.hasNext())
		{
			dao.insertData(i1.next());
		}
	}
}