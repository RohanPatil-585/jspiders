package org.jspiders.computerApp.services;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.jspiders.computerApp.dto.ComputerDTO;
public class InsertDataToDatabase 
{
	public Set<ComputerDTO> fatchDataFromFile(String location) throws Exception
	{
		FileReader freader = new FileReader(location);
		BufferedReader breader = new BufferedReader(freader);
		String data = breader.readLine();
		String[] array;
		Set<ComputerDTO> set = new HashSet<ComputerDTO>();
		while(data!=null)
		{
			array = data.split(",");
			ComputerDTO dto = new ComputerDTO();
			dto.setId(Integer.parseInt(array[0]));
			dto.setBrand(array[1]);
			dto.setProcessor(array[2]);
			dto.setModel(array[3]);
			dto.setRamsize(array[4]);
			set.add(dto);
			data = breader.readLine();
		}
		return set;
	}
}