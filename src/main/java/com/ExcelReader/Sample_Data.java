package com.ExcelReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample_Data {
	public static void particular_Data() throws Throwable {
		File f = new File("C:\\Users\\dell\\eclipse-workspace\\MavenProject\\Excel_File\\Sampledata.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(2);
		Cell cell = row.getCell(0);
		CellType cellType = cell.getCellType();
		if (cellType.equals(CellType.STRING)) {
			String string = cell.getStringCellValue();
			System.out.println(string);
		} else if (cellType.equals(CellType.NUMERIC)) {
			double value = cell.getNumericCellValue();
			System.out.println(value);
		}
	}

	public static void all_Data() throws Throwable {
		File f = new File("C:\\Users\\dell\\eclipse-workspace\\MavenProject\\Excel_File\\Sampledata.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < numberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			int numberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < numberOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if (cellType.equals(CellType.STRING)) {
					String string = cell.getStringCellValue();
					System.out.println(string);
				} else if (cellType.equals(CellType.NUMERIC)) {
					double value = cell.getNumericCellValue();
					System.out.println(value);
				}
			}
		}

	}

	public static void particular_Row_Data() throws Throwable {
		File f = new File("C:\\Users\\dell\\eclipse-workspace\\MavenProject\\Excel_File\\Sampledata.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(1);
		int numberOfCells = row.getPhysicalNumberOfCells();
		for (int j = 0; j < numberOfCells; j++) {
			Cell cell = row.getCell(j);
			CellType cellType = cell.getCellType();
			if (cellType.equals(CellType.STRING)) {
				String string = cell.getStringCellValue();
				System.out.println(string);
			} else if (cellType.equals(CellType.NUMERIC)) {
				double value = cell.getNumericCellValue();
				System.out.println(value);
			}

		}

	}

	public static void particular_Column_Data() throws Throwable {
		File f = new File("C:\\Users\\dell\\eclipse-workspace\\MavenProject\\Excel_File\\Sampledata.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < numberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			Cell cell = row.getCell(0);
			CellType cellType = cell.getCellType();
			if (cellType.equals(CellType.STRING)) {
				String string = cell.getStringCellValue();
				System.out.println(string);
			} else if (cellType.equals(CellType.NUMERIC)) {
				double value = cell.getNumericCellValue();
				System.out.println(value);
			}
		}

	}
	public static void write_Data() throws Throwable {
		File f=new File("C:\\Users\\dell\\Desktop\\\\Sampledata.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fis);
	    w.createSheet("A").createRow(0).createCell(0).setCellValue("Email");
	    w.getSheet("A").getRow(0).createCell(1).setCellValue("Password");
	    w.getSheet("A").createRow(1).createCell(0).setCellValue("Deeparajan");
	    w.getSheet("A").getRow(1).createCell(1).setCellValue("deepak@1");
	    w.getSheet("A").createRow(2).createCell(0).setCellValue("Deepak");
	    w.getSheet("A").getRow(2).createCell(1).setCellValue(12345);
	    FileOutputStream fos=new FileOutputStream(f);
	    w.write(fos);
	    w.close();
	    System.out.println("Write Successfully");
		
	}
	

	public static void main(String[] args) throws Throwable {
		System.out.println("***** Particular Data *****");
		particular_Data();
		System.out.println("***** All Data *****");
		all_Data();
		System.out.println("***** Particular Row Data *****");
		particular_Row_Data();
		System.out.println("***** Particular Column Data *****");
		particular_Column_Data();
		write_Data();

	}
}
