package org.jspiders.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.jspiders.dao.MovieDao;
import org.jspiders.dto.MovieDto;

public class SaveTester
{
	public static void main(String[] args) 
	{
		MovieDao dao = new MovieDao();
		MovieDto dto = new MovieDto();
		dto.setName("the ring");
		dto.setProducerName("john king");
		dto.setBudget(9999.99);
		int id = dao.saveAndReturnId(dto);
		System.out.println(id);
		
		System.out.println();
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("how many records you want to enter = ");
		int number = s1.nextInt();
		
		List<MovieDto> list = new ArrayList<MovieDto>();
		for (int i = 0; i < number; i++) 
		{
			System.out.println("enter movie name...");
			String moviename = s1.next();
			System.out.println("enter producerName...");
			String pname = s1.next();
			System.out.println("enter budget...");
			double budget = s1.nextDouble();
			dto = new MovieDto();
			dto.setBudget(budget);
			dto.setName(moviename);
			dto.setProducerName(pname);
			list.add(dto);
		}
		System.out.println(list.size());
		dao.saveList(list);
		s1.close();
	}
}
