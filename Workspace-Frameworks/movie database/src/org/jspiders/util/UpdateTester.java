package org.jspiders.util;

import org.jspiders.dao.MovieDao;
import org.jspiders.dto.MovieDto;

public class UpdateTester 
{
	public static void main(String[] args)
	{
		MovieDao dao = new MovieDao();
		MovieDto dto = new MovieDto();
		dao.updateBudgetByMovieName("tiger", 5555.66);
	}
}
