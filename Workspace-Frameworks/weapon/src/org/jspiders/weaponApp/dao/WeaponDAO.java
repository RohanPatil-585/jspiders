package org.jspiders.weaponApp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.jspiders.weaponApp.dto.WeaponDTO;

public class WeaponDAO 
{
	public void save(WeaponDTO dto)
	{
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(WeaponDTO.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(dto);
		transaction.commit();
		session.close();
		factory.close();
	}
}