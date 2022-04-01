package org.jspiders.movieApp.util;

import org.jspiders.movieApp.dao.MovieHqlDAO;
import org.jspiders.movieApp.dto.MovieDTO;
public class UpdateTester 
{
	public static void main(String[] args) 
	{
		//MovieDTO dto = new MovieDTO();
		MovieHqlDAO hqldao = new MovieHqlDAO();
		hqldao.updateBudgetByName("expandebals", 7777.77);
	}
}