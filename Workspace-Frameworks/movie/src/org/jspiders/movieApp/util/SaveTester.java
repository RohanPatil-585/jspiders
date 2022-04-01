package org.jspiders.movieApp.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jspiders.hibernateSingleton.SessionFactoryUtil;
import org.jspiders.movieApp.dao.MovieHqlDAO;
import org.jspiders.movieApp.dto.MovieDTO;
import org.omg.CORBA.PRIVATE_MEMBER;

public class SaveTester 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in); 
		MovieDTO dto = new MovieDTO();
		dto.setName("antman");
		dto.setProducerName("kemeroon");
		dto.setBudget(8888.99);
		MovieHqlDAO hqldao = new MovieHqlDAO();
		Integer inte = hqldao.saveAndReturnId(dto);
		System.out.println(inte);
		
		System.out.println("=========================================================");
		System.out.println("how many records you want to insert...");
		int no = s1.nextInt();
		List<MovieDTO> list = new ArrayList<MovieDTO>();
		for (int i = 0; i < no; i++) 
		{
			System.out.println("enter movie name...");
			String moviename = s1.next();
			System.out.println("enter producerName...");
			String pname = s1.next();
			System.out.println("enter budget...");
			double budget = s1.nextDouble();
			dto = new MovieDTO();
			dto.setBudget(budget);
			dto.setName(moviename);
			dto.setProducerName(pname);
			list.add(dto);
		}
		System.out.println(list.size());
		hqldao.saveList(list);
		
		s1.close();
	}
}