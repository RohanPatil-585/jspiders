package util;

import java.io.IOException;
import java.util.List;

import dao.StudentDAO;
import dto.studentDTO;

public class readTester 
{
	public static void main(String[] args) throws Exception 
	{
		StudentDAO dao = new StudentDAO();
		List<studentDTO> list = dao.readDataFromExcel();
		dao.save(list);
	}
}
