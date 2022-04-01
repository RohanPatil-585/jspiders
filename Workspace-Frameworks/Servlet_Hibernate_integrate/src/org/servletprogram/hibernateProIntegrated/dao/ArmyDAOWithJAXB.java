package org.servletprogram.hibernateProIntegrated.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.Cache;
import javax.persistence.EntityGraph;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnitUtil;
import javax.persistence.SynchronizationType;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.metamodel.Metamodel;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.xmlbeans.ObjectFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.servletprogram.hibernateProIntegrate.dto.ArmyDTO;

import com.hibernate.SessionFactory.util.SessionFactoryUtil;

public class ArmyDAOWithJAXB 
{
	private SessionFactory factory=SessionFactoryUtil.getFactory();
	
	public HashMap<ArmyDTO,ArmyDTO> getArmy()
	{
		Session session=factory.openSession();
		Query query=session.createQuery("from ArmyDTO");
		List<ArmyDTO> list=query.list();

		HashMap hashMap=new HashMap(); 
		for(ArmyDTO dto:list)
		{
			hashMap.put(dto.getId(), dto);
		}
		return hashMap;
	}
	public static void main(String[] args) throws JAXBException, FileNotFoundException 
	{
		ArmyDAOWithJAXB armyDAOWithJAXB=new ArmyDAOWithJAXB();
		HashMap<ArmyDTO,ArmyDTO> hashMap= armyDAOWithJAXB.getArmy();
		Set<ArmyDTO> set = hashMap.keySet();
		Iterator<ArmyDTO> iterator=set.iterator();
		/*while(iterator.hasNext())
		{
			Object object=iterator.next();
			ArmyDTO armyDTO=(ArmyDTO)hashMap.get(object);
			System.out.println(armyDTO.getId()+"/t"+armyDTO.getNo_of_recruitment());
		}*/
//		 EntityManager entityManager = new EntityManagerFactory().createEntityManager(); 
				 JAXBContext jaxbContext=JAXBContext.newInstance(ArmyDTO.class);
				 Marshaller marshaller=jaxbContext.createMarshaller();
				 FileOutputStream fileOutputStream=new FileOutputStream(new File("ArmyDTO.xml"));
				 while(iterator.hasNext())
					{
					 	Object object=iterator.next();
					 	ArmyDTO armyDTO=(ArmyDTO)hashMap.get(object);
					 	marshaller.marshal(armyDTO,fileOutputStream);
					}
		}
}
