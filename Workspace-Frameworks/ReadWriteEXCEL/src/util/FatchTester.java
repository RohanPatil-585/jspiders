package util;

import java.util.Iterator;
import java.util.List;

import dao.ExcelDAO;
import dto.ExcelDTO;

public class FatchTester 
{
	public static void main(String[] args) 
	{
		ExcelDTO dto = new ExcelDTO();
		ExcelDAO dao = new ExcelDAO();
		List<ExcelDTO> list = dao.fatchAll();
		for (ExcelDTO excelDTO : list) 
		{
			System.out.println(excelDTO);
		}
		dao.writeExcelFile(list);
	}
}