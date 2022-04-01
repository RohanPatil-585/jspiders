package org.servletprogram.hibernateProIntegrate.service;

import java.io.*;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.servletprogram.hibernateProIntegrate.dto.ArmyDTO;
import org.servletprogram.hibernateProIntegrated.dao.ArmyDAO;

public class ArmyService {

	public void fetchFromXls(String fname) throws IOException {

		// HSSFWorkbook wb = new HSSFWorkbook(new FileInputStream(fname));
		/*
		 * FileReader fr=new FileReader(fname); BufferedReader bf=new
		 * BufferedReader(fr); String s1=""; System.out.println(bf.toString());
		 * System.out.println((char)bf.read()); while(bf.lines()!=null) {
		 * System.out.println((char)bf.read()); }
		 */
		
		XSSFWorkbook xb = new XSSFWorkbook(new FileInputStream(fname));
		ArmyDAO dao = new ArmyDAO();
		Sheet st = xb.getSheetAt(0);
		Iterator<Row> row_iterator = st.iterator();
		while (row_iterator.hasNext()) {
			Row nextRow = row_iterator.next();
			Iterator<Cell> cell_iterator = nextRow.iterator();
			ArmyDTO dto = new ArmyDTO();

			while (cell_iterator.hasNext()) {
				Cell cell = cell_iterator.next();
				int cellIndex = cell.getColumnIndex();
				// System.out.println(cellIndex);
				switch (cellIndex) {
				case 0:
					System.out.print(cell.getRichStringCellValue());
					dto.setCountry_name(cell.getStringCellValue());
					break;
				case 1:
					System.out.print(cell.getStringCellValue());
					dto.setArmy_type(cell.getStringCellValue());
					break;
				case 2:
					System.out.print(cell.getStringCellValue());
					dto.setType(cell.getStringCellValue());
					break;
				case 3:
					System.out.print(cell.getNumericCellValue());
					dto.setNo_of_recruitment((int) cell.getNumericCellValue());
					break;
				}
			}
			System.out.println();
			dao.save(dto);
		}
		System.out.println("Save Successfully........");
	}

	public static void main(String[] args) {
		ArmyService as = new ArmyService();
		try {
			as.fetchFromXls("FetchFileExcel.xlsx");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
