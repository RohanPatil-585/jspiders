package util;

import java.util.List;

import dao.StudentDAO;
import dto.studentDTO;

public class fatchTester 
{
	public static void main(String[] args) 
	{
		studentDTO dto = new studentDTO();
		StudentDAO dao = new StudentDAO();
		List<studentDTO> list = dao.fatchAll();
		System.out.println(list);
		dao.writeExcelFile(list);
	}
}
