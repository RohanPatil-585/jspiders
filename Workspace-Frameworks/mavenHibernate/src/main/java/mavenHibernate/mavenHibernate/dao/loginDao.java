package mavenHibernate.mavenHibernate.dao;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import mavenHibernate.mavenHibernate.dto.LoginDto;

public class loginDao {

	public loginDao() {

		System.out.println("doa created");
	}

	// SessionFactory factory;
	public Serializable save(LoginDto dto) {
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(LoginDto.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		System.out.println("opening session...");
		Transaction transection = session.beginTransaction();
		System.out.println("begining transection...");
		int i = 0;
		try {
			i = (Integer) session.save(dto);
			transection.commit();
			System.out.println("data saved to the database");
		} catch (HibernateException e) {
			System.out.println("can not configure hibernate.cfg.xml...............");
			e.printStackTrace();
		} finally {
			session.close();
		}
		return i;
	}
}
