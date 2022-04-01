package org.servletprogram.hibernateProIntegrated.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.servletprogram.hibernateProIntegrate.dto.ArmyDTO;

import com.hibernate.SessionFactory.util.SessionFactoryUtil;

public class ArmyDAO {
	
	private SessionFactory factory=SessionFactoryUtil.getFactory();

	public void save(ArmyDTO dto)
	{
		
		Session ssn=factory.openSession();
		Transaction trns=ssn.beginTransaction();
		try 
		{
			ssn.save(dto);
			trns.commit();
		}catch(HibernateException he)
		{
			he.printStackTrace();
			trns.rollback();
		}
		finally {
			ssn.close();
//			sf.close();
				
		}
		
	}
	
	public List<ArmyDTO> setArmy()
	{
		Session session=factory.openSession();
		Query query=session.createQuery("from ArmyDTO");
		List<ArmyDTO> armyList=query.list();
		/*for(ArmyDTO aList:armyList)
		{
			System.out.println("Id: "+aList.getId()+" Army_type: "+aList.getArmy_type()+" Type: "
					+aList.getType()+" Country Name: "+aList.getCountry_name()+" No. Of Recruitment"
							+ aList.getNo_of_recruitment() );
		}*/
		
		return armyList;
	}
}
