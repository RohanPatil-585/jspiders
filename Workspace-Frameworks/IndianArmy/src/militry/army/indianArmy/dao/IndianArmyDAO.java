package militry.army.indianArmy.dao;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.jspiders.hibernateSingleton.SessionFactoryUtil;

import militry.army.indianArmy.dto.IndianArmyDTO;
public class IndianArmyDAO 
{
	private SessionFactory factory = SessionFactoryUtil.getFactory();
	
	public void save(IndianArmyDTO dto)
	{
//		Configuration config = new Configuration();
//		config.configure();
//		config.addAnnotatedClass(IndianArmyDTO .class);
//		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		try
		{
			session.save(dto);
			transaction.commit();
		}
		catch(HibernateException he)
		{
			he.printStackTrace();
			transaction.rollback();
		}
		finally
		{			
			session.close();
			//	factory.close();
		}
	}
	
	public IndianArmyDTO retriveData(int id)
	{
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		IndianArmyDTO dto = session.get(IndianArmyDTO.class,id);
		session.close();
		//factory.close();
		return dto;
	}
	public void update(int id,String newregimenttype)
	{
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		//two steps, read and update...
		IndianArmyDTO armyDTO = session.get(IndianArmyDTO.class, id);
		try
		{
			if(armyDTO!=null)
			{
				System.out.println("entity exists can update....");
				armyDTO.setRegimentType(newregimenttype);				
					session.update(armyDTO);
					transaction.commit();
			}
			else
			{
				System.out.println("entity not found...");
			}
		}
		catch(HibernateException he)
		{
			he.printStackTrace();
			//transaction.commit();
			transaction.rollback();
		}
		finally
		{
			session.close();
			//factory.close();
		}
	}
	
	public void delete(int id)
	{
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		IndianArmyDTO armyDTO = session.get(IndianArmyDTO.class, id);
		try
		{
			if(armyDTO!=null)
			{
				System.out.println("entity exists and update...");
				
					session.delete(armyDTO);
					transaction.commit();
			}
			else
			{
				System.out.println("entity not found...");
			}
		}
		catch(HibernateException he)
		{
			he.printStackTrace();
			transaction.rollback();
		}
		finally
		{
			session.close();
			//factory.close();
		}
	}
}