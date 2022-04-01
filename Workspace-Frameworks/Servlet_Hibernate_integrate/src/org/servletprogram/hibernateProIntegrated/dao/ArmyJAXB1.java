package org.servletprogram.hibernateProIntegrated.dao;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlElement;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.servletprogram.hibernateProIntegrate.dto.ArmyDTO;
import org.servletprogram.hibernateProIntegrate.dto.ArmyDTO1;

import com.hibernate.SessionFactory.util.SessionFactoryUtil;

public class ArmyJAXB1 {
	
private SessionFactory factory=SessionFactoryUtil.getFactory();
List<ArmyDTO> lists;

@XmlElement(name="product")
	public List<ArmyDTO> getArmy()
	{
		Session session=factory.openSession();
		Query query=session.createQuery("from ArmyDTO");
		this.lists=query.list();
		System.out.println(lists.size());
		return lists;
	}
	
	
	public static void main(String[] args) throws JAXBException 
	{
		ArmyJAXB1 armyJAXB1=new ArmyJAXB1();
		List<ArmyDTO> list=armyJAXB1.getArmy();
		JAXBContext jaxbContext=JAXBContext.newInstance(ArmyJAXB1.class);
		Marshaller marshaller=jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(list, new File("myxml.xml"));
		
		/*ArmyDAOWithJAXB armyJAXB1=new ArmyDAOWithJAXB();
		HashMap<ArmyDTO,ArmyDTO> hashMap=armyJAXB1.getArmy();
		Set<ArmyDTO> set = hashMap.keySet();
		Iterator<ArmyDTO> iterator=set.iterator();
		JAXBContext jaxbContext=JAXBContext.newInstance(ArmyDTO.class);
		Marshaller marshaller=jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		while(iterator.hasNext())
		{
		 	Object object=iterator.next();
		 	ArmyDTO armyDTO=(ArmyDTO)hashMap.get(object);
		 	marshaller.marshal(armyDTO, new File("myxml.xml"));
		}*/
	}
}
