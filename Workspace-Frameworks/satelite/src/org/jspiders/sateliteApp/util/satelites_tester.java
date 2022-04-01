package org.jspiders.sateliteApp.util;

import org.jspiders.sateliteApp.dao.satelitesDAO;
import org.jspiders.sateliteApp.dto.satelitesDTO;

public class satelites_tester 
{
	public static void main(String[] args) 
	{
		satelitesDTO satelitesDTO = new satelitesDTO();
		satelitesDTO.setSatelite_type("militry");
		satelitesDTO.setOpertingCountry("india");
		satelitesDTO.setOperationalRange(999999.78);
		satelitesDTO.setSatelite_name("eagle@IndianArmy");
		satelitesDAO satelitesDAO = new satelitesDAO();
		satelitesDAO.save(satelitesDTO);
	}
}
