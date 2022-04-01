package org.jspiders.hibernateSingleton;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public final class SessionFactoryUtil 
{
	private static SessionFactory factory;
	
	public static SessionFactory getFactory()
	{
		System.out.println("calling get factory method from util jar...");
		return factory;
	}
	
	static
	{
		System.out.println("startiting to initialize session factory through util jar");
		Configuration configuration = new Configuration().configure();
		factory = configuration.buildSessionFactory();
		System.out.println("session factory created using util jar...");
	}
}