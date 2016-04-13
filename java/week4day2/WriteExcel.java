package week4day2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/*import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;*/

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		updateExcel();
	}

	public static void updateExcel() throws IOException {
		FileInputStream finput = new FileInputStream(new File("D:\\workspace\\week1\\Data\\WriteExcel.xls"));
		HSSFWorkbook wbook = new HSSFWorkbook(finput);
		HSSFSheet sheet = wbook.getSheet("TestOutput");
		HSSFRow row = sheet.getRow(1);
		HSSFCell cell = row.createCell(1);
		cell.setCellValue("Test Case");

		// create 2nd row
		sheet.getRow(2).createCell(1).setCellValue("Create Leadnm");

		try {
			// Create this when you need to write / update
			FileOutputStream fileOutput = new FileOutputStream(new File("D:\\workspace\\week1\\Data\\WriteExcel.xls"));
			wbook.write(fileOutput);

			wbook.close();
			fileOutput.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
	}

	public static void writeExcel() {
		HSSFWorkbook wbook = new HSSFWorkbook();
		HSSFSheet sheet = wbook.createSheet("TestOutput");
		HSSFRow row = sheet.createRow(1);
		HSSFCell cell = row.createCell(0);
		cell.setCellValue("Serial No");

		// create 2nd row
		sheet.createRow(2).createCell(0).setCellValue("1");

		try {
			// Create this when you need to write / update
			FileOutputStream fileOutput = new FileOutputStream(new File("D:\\workspace\\week1\\Data\\WriteExcel.xls"));
			wbook.write(fileOutput);

			wbook.close();
			fileOutput.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
