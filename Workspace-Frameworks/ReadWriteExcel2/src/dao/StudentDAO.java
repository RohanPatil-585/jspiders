package dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.format.CellFormatType;
import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.jspiders.hibernateSingleton.SessionFactoryUtil;

import dto.studentDTO;

public class StudentDAO 
{
	private SessionFactory factory = SessionFactoryUtil.getFactory();
	String array[];
	int k=0;
	public List<studentDTO> fatchAll()
	{
		Session session = factory.openSession();
		try
		{
			Query query = session.getNamedQuery("rohan");
			List<studentDTO> list = query.list();
			return list;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return null;
	}
	
	//method to write the data from database to excel file..
	public void writeExcelFile(List<studentDTO> list)
	{
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();
		Iterator<studentDTO> i1 = list.iterator();
		int rownumber=0;
		if(rownumber==0)
		{
			Row row = sheet.createRow(rownumber++);
			Cell cell = row.createCell(0);
			cell.setCellValue("id");
			cell=row.createCell(1);
			cell.setCellValue("name");
			cell=row.createCell(2);
			cell.setCellValue("branch");
		}
		
		while(i1.hasNext())
		{
			studentDTO dto = (studentDTO)i1.next();
			Row row = sheet.createRow(rownumber++);
			String array[]={dto.getName(),dto.getBranch()};
			
			int cellnumber=0;
			for (Object object: array) 
			{
				Cell cell = row.createCell(cellnumber++);
				if(object instanceof String)
				{
					cell.setCellValue((String)object);
				}
				else if(object instanceof Integer)
				{
					cell.setCellValue((Integer)object);
				}
			}
		}
		try
		{
			FileOutputStream fileOutputStream = new FileOutputStream(new File("E:\\student.xlsx"));
			workbook.write(fileOutputStream);
			fileOutputStream.close();
			System.out.println("written successfully on the disk...");
		}
		catch(Exception h)
		{
			h.printStackTrace();
		}
	}

	//method to write data to database from excel...
	public List<studentDTO> readDataFromExcel() throws IOException
	{
		List<studentDTO> list = new ArrayList<studentDTO>();
		InputStream excelFileToRead = new FileInputStream("E:\\jobseeker.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(excelFileToRead);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row;
		XSSFCell cell;
		
		Iterator rows = sheet.rowIterator();
		row=(XSSFRow)rows.next();
		String str="";
		
		while(rows.hasNext())
		{
			
			row=(XSSFRow) rows.next();
			Iterator cells = row.cellIterator();
			while(cells.hasNext())
			{
				
				cell=(XSSFCell) cells.next();
				if(cell.getCellTypeEnum()==CellType.STRING)
				{
				//	s1[k++]=cell.getStringCellValue();
					str=str+cell.getStringCellValue()+",";
				}
				else if(cell.getCellTypeEnum()==CellType.NUMERIC)
				{
				//	s1[k++]=String.valueOf(cell.getNumericCellValue());
				//	s1[k++]=String.valueOf(cell.getNumericCellValue());
					str=str+cell.getNumericCellValue()+",";
				}
			}
			
			String[] s1 = split(str);
			System.out.println(str);
			studentDTO dto = new studentDTO();
			dto.setName(s1[1]);
			list.add(dto);
			str="";
		}
		return list;

	
	}
	
	public static String[] split(String str)
	{
		char[] ch = str.toCharArray();
		str = "";
		int k=0;
		int count = 1;
		for (int i = 0; i < ch.length-1; i++)
		{
			if(ch[i]==',' && ch[i+1]!=',')
			{
				count++;
			}
		}
		
		System.out.println("number of count in a string = "+count);
		
		String[] array = new String[count];
		for (int i = 0; i < ch.length-1; i++)
		{
			if(ch[i]!=',')
			{
				str = str + ch[i];
			}
			else if(ch[i]==','&&ch[i+1]!=',')
			{
				array[k++]=str;
				str="";
			}
			if(i==ch.length-2)
			{
				array[k]=str;
			}
		}
		return array;
	}
	
	public void save(List<studentDTO> dto)
	{
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		try 
		{
			Iterator<studentDTO> i1 = dto.iterator();
			while(i1.hasNext())
			{
				session.save(i1.next());
			}
			transaction.commit();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			transaction.rollback();
		}
		finally
		{
			session.close();
		}
	}
}