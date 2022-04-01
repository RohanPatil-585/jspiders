package org.jspiders.util;

import java.util.List;

import org.jspiders.dao.MovieDao;
import org.jspiders.dto.MovieDto;

public class ReadTester 
{
	public static void main(String[] args) 
	{
		MovieDao dao = new MovieDao();
		List<MovieDto> list = dao.fatchAll();
		list.forEach(dto->{System.out.println(dto);});
		
		System.out.println();
		
		MovieDto dto = dao.fatchByMovieName("we");
		System.out.println(dto);
		
		System.out.println();
		
		List<MovieDto> list1 = dao.fatchMultipleByMovieName("tiger");
		System.out.println(list1);
		
		System.out.println();
		
		String producername = dao.fatchProducerNameByMovieName("we");
		System.out.println(producername);
		
		System.out.println();
		
		Long fatchcount = dao.fetchCount();
		System.out.println(fatchcount);
		
		System.out.println();
		
		double d = dao.fatchMaxBudget();
		System.out.println(d);
	}
}
