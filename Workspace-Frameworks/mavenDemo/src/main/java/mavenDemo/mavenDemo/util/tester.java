package mavenDemo.mavenDemo.util;

import mavenDemo.mavenDemo.dao.loginDao;
import mavenDemo.mavenDemo.dto.LoginDto;

public class tester 
{
	public static void main(String[] args)
	{
		LoginDto dto = new LoginDto();
		dto.setName("alen");
		dto.setPassword("alen619");
		dto.setCity("newyork");
		
		loginDao dao = new loginDao();
		dao.save(dto);
	}
}
