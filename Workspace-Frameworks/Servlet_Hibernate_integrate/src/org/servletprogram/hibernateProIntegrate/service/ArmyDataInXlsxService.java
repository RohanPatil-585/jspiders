package org.servletprogram.hibernateProIntegrate.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.servletprogram.hibernateProIntegrate.dto.ArmyDTO;
import org.servletprogram.hibernateProIntegrated.dao.ArmyDAO;


public class ArmyDataInXlsxService 
{
	public void writeInXlsx(List<ArmyDTO> list) throws IOException
	{
		
		File file=new File("C:\\temp\\ix.xlsx");
		System.out.println(file.isFile()+".......................");
		if(file.isFile()==false)
		{
			System.out.println(".......................");
			System.out.println(file.createNewFile());
			System.out.println(file.isFile()+".......................");
			System.out.println(file.canWrite());
		}
		FileOutputStream fos=new FileOutputStream(file);
		Workbook wb=new XSSFWorkbook();
		Sheet sheet=wb.createSheet();
		int rowCount=0;
		for(ArmyDTO dto:list)
		{
			Row row=sheet.createRow(++rowCount);
			writeXlsx(dto,row);
		}
		try
		{
			wb.write(fos);
		}
		finally
		{
			fos.close();
			System.out.println("Finish.............................");
		}
	}
	
	private static void writeXlsx(ArmyDTO dto,Row row)
	{
		Cell cell=row.createCell(1);
		cell.setCellValue(dto.getId());
		
		cell=row.createCell(2);
		cell.setCellValue(dto.getCountry_name());
		
		cell=row.createCell(3);
		cell.setCellValue(dto.getArmy_type());
		
		cell=row.createCell(4);
		cell.setCellValue(dto.getType());
		
		cell=row.createCell(5);
		cell.setCellValue(dto.getNo_of_recruitment());
	}
	
	
	public static void main(String[] args) 
	{
		ArmyDAO dao=new ArmyDAO();
		List<ArmyDTO> list=dao.setArmy();
		try {
			new ArmyDataInXlsxService().writeInXlsx(list);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done......");
		
	}
}
