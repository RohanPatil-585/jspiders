package militry.army.indianArmy.generator;

import java.io.Serializable;
import militry.army.indianArmy.dao.IndianArmyDAO;
import militry.army.indianArmy.dto.IndianArmyDTO;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.jspiders.hibernateSingleton.SessionFactoryUtil;

public class MyGenerator implements IdentifierGenerator 
{
	@Override
	public Serializable generate(SessionImplementor implementor, Object object)
			throws HibernateException 
	{
		System.out.println("calling generated method...");
		System.out.println("only testing, should not be hard coded...");
		int id = 111;
		IndianArmyDAO dao = new IndianArmyDAO();
		IndianArmyDTO dto = dao.retriveData(id);
		while(dto!=null)
		{
			dto = dao.retriveData(++id);
		}
		return id;
	}
}