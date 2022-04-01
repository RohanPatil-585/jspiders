package militry.army.indianArmy.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import militry.army.indianArmy.dto.IndianArmyDTO;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.jspiders.hibernateSingleton.SessionFactoryUtil;
public class IndianArmyDAOHql 
{
	private SessionFactory factory = SessionFactoryUtil.getFactory();
	
	public IndianArmyDTO fetchByRegimentType(String type)
	{
		Session session = factory.openSession();
		String hqlSyntax = "select army from IndianArmyDTO army where army.regimentType='"+type+"'";
		try
		{			
			Query query = session.createQuery(hqlSyntax);
			IndianArmyDTO armyDTO = (IndianArmyDTO) query.uniqueResult();
			return armyDTO;
		}
		finally
		{
			session.close();
		}
	}
	
	public List<IndianArmyDTO> fatchAllData()
	{
		Session session = factory.openSession();
		String hqlSyntax = "from IndianArmyDTO";
		try
		{			
			Query query = session.createQuery(hqlSyntax);
			List<IndianArmyDTO> list = query.list();
			//IndianArmyDTO armyDTO = (IndianArmyDTO) query.uniqueResult();
			return list;
		}
		finally
		{
			session.close();
		}
	}
	
	public String fatchTypeById(int id)
	{
		String hqlsyntax="select army.regimentType from IndianArmyDTO army where army.regimentId=:id";
		Session session = factory.openSession();
		try
		{			
			Query query = session.createQuery(hqlsyntax);
			query.setParameter("id",id);
			String type = (String)query.uniqueResult();
			return type;
		}
		finally
		{
			session.close();
		}
	}
	
	public Object[] fatchregimentIdAndRegimentTypeByPlatun(int platun)
	{
		String hqlsyntax = "select army.regimentId , army.regimentType from IndianArmyDTO army where army.platuns=:plat";
		Session session = factory.openSession();
		Query query = session.createQuery(hqlsyntax);
		query.setParameter("plat",platun);
		Object object = query.uniqueResult();
		System.out.println("object from unique result = {} "+object);
		Object[] array = (Object[])object;
		System.out.println("size of array "+array.length);
		return array;
	}
	
	
	public IndianArmyDTO fatchDataByBattalian(String batalian)
	{
		String hqlsyntax="select army from IndianArmyDTO army where army.battalian=:batt";
		Session session = factory.openSession();
		Query query = session.createQuery(hqlsyntax);
		query.setParameter("batt",batalian);
		IndianArmyDTO dto =(IndianArmyDTO) query.uniqueResult();
		return dto;
	}
	
	public String fatchTypeByBattalian(String batalian)
	{
		String hqlsyntax="select army.regimentType from IndianArmyDTO army where army.battalian=:batt";
		Session session = factory.openSession();
		Query query = session.createQuery(hqlsyntax);
		query.setParameter("batt",batalian);
		String str =(String) query.uniqueResult();
		return str;
	}
	
	public void update(String type, int newplatuns)
	{
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		String hqlSyntax = "update IndianArmyDTO army set army.platuns=  :plat"
				+ " where army.regimentType='"+type+"'";
		Query query = session.createQuery(hqlSyntax);
		query.setParameter("plat", newplatuns);
		int result = query.executeUpdate();
		session.getTransaction();
		session.close();
	}
}