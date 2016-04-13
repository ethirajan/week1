package week4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xcel {
	public String[] excelInput(String excelPath, String sheetName, int rowNumber ) 
	{
		String[] output=new String[15];
		try {
			
			
			FileInputStream fis=new FileInputStream(new File(excelPath));
			
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			
			XSSFSheet sheet=workbook.getSheet(sheetName);
			int rowcount=sheet.getLastRowNum();
			
			XSSFRow currentrow=sheet.getRow(rowNumber);
				int columncount=currentrow.getLastCellNum();
				for (int i = 0; i < columncount; i++) 
				{
					output[i]=currentrow.getCell(i).getStringCellValue();
					System.out.println("Current cell Value is"+output[i]);
				}
				//output[columncount]=null;

			fis.close();
			workbook.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return output;
		
		
		
	}

}
