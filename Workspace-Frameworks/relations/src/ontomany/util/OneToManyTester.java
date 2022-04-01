package ontomany.util;

import java.util.ArrayList;
import java.util.Collection;

import onetoone.dao.OneToOneDAO;
import ontomany.dao.OneToManyDAO;
import ontomany.dto.ApplicationDTO;
import ontomany.dto.ComputerDTO;

public class OneToManyTester 
{
	public static void main(String[] args) 
	{
		ComputerDTO computerDTO = new ComputerDTO();
		computerDTO.setBrand("dell");
		computerDTO.setGraphics(true);
		computerDTO.setModel("notebook");
		
		ApplicationDTO applicationDTO1 = new ApplicationDTO();
		applicationDTO1.setApp_name("nfs");
		applicationDTO1.setApp_plateform("android");
		applicationDTO1.setApp_version("3.9.0");
		
		ApplicationDTO applicationDTO2 = new ApplicationDTO();
		applicationDTO2.setApp_name("sanandres");
		applicationDTO2.setApp_plateform("ios");
		applicationDTO2.setApp_version("4.9.0");
		
		Collection<ApplicationDTO> collection = new ArrayList<ApplicationDTO>();
		collection.add(applicationDTO1);
		collection.add(applicationDTO2);
		computerDTO.setApplicationDTOs(collection);
		
		OneToManyDAO dao = new OneToManyDAO();
		dao.save(computerDTO);
	}
}