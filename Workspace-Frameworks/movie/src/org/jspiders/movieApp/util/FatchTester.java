package org.jspiders.movieApp.util;

import java.util.List;
import org.jspiders.movieApp.dao.MovieHqlDAO;
import org.jspiders.movieApp.dto.MovieDTO;

public class FatchTester 
{
	public static void main(String[] args) 
	{
		MovieHqlDAO hqldao = new MovieHqlDAO();
		List<MovieDTO> list = hqldao.fetchAll();
		list.forEach(dto->{System.out.println(dto);});
		
		System.out.println();
		String str = hqldao.fetchProducerNameByMovieName("tiger");
		System.out.println(str);
		
		System.out.println();
		long lon = hqldao.fetchCount();
		System.out.println(lon);
		
		System.out.println();
		double d = hqldao.fetchMaxBudget();
		System.out.println(d);
	}
}