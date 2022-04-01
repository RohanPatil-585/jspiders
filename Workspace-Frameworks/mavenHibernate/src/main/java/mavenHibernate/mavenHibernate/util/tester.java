package mavenHibernate.mavenHibernate.util;

import mavenHibernate.mavenHibernate.dao.loginDao;
import mavenHibernate.mavenHibernate.dto.LoginDto;

public class tester 
{
	public static void main(String[] args)
	{
		LoginDto dto = new LoginDto();
		dto.setName("rohan");
		dto.setPassword("rohan619");
		dto.setCity("navsari");
		
		loginDao dao = new loginDao();
		dao.save(dto);
	}
}
