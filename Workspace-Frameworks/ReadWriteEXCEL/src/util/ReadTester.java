package util;

import java.util.List;

import dao.ExcelDAO;
import dto.ExcelDTO;

public class ReadTester 
{
	public static void main(String[] args) throws Exception 
	{
		ExcelDAO dao = new ExcelDAO();
		List<ExcelDTO> list = dao.readDataFromExcel();
	//	System.out.println(list);
		dao.save(list);
	}
}
