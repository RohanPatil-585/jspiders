package org.jspidders.computerApp.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.jspidders.computerApp.dto.ComputerDTO;

public class computerDAO 
{
	public void save(ComputerDTO std)
	{
		Configuration configuration = new Configuration();
		System.out.println("configuration object created and configuring hibernate.cfg.xml....");
		configuration.configure();
		System.out.println("parsing hibernate.cfg.xml...");
		configuration.addAnnotatedClass(ComputerDTO.class);
		System.out.println("adding annotatin class...");
		SessionFactory factory = configuration.buildSessionFactory();
		System.out.println("building session factory...");
		Session session = factory.openSession();
		System.out.println("opening session...");
		Transaction transection = session.beginTransaction();
		System.out.println("begining transection...");
		session.save(std);
		System.out.println("transfering data using save mathod...");
		transection.commit();
		System.out.println("saving all the trasection...");
		session.close();
		factory.close();
	}
	
	public ComputerDTO fatchById(int id)
	{
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(ComputerDTO.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transection = session.beginTransaction();
		ComputerDTO dto = session.get(ComputerDTO.class, id);
		session.close();
		factory.close();
		return dto;
	}
}