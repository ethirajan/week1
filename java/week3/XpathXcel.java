package week3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.firefox.FirefoxDriver;


public class XpathXcel {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException, InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.amazon.com/");
		Thread.sleep(3000);
		FileInputStream FIS = new FileInputStream(new File("./data/input.xls"));
		
		@SuppressWarnings("resource")
		HSSFWorkbook workbook	=	new	HSSFWorkbook(FIS); //pick Excel worksheet
		HSSFSheet sheet = workbook.getSheet("PASSVALUE"); //pick sheet from Excel worksheet
		
		for (int i=1 ; i <= sheet.getLastRowNum(); i++)
		{
			
		HSSFRow currentRow = sheet.getRow(i); //From sheet moving to Row
		//System.out.println("Item : " + currentRow.getCell(0).getStringCellValue());
		//System.out.println("link :" + currentRow.getCell(1).getNumericCellValue());
		
		//driver.findElementByXPath(".//*[@id='redir-overlay']/div[2]/div[1]/a");
		//driver.findElementByClassName("redir-a-button-sec-center").click();
		/*//driver.findElementById("twotabsearchtextbox").sendKeys(currentRow.getCell(0).getStringCellValue());
*/		driver.findElementByName("field-keywords").sendKeys(currentRow.getCell(0).getStringCellValue());
		driver.findElementByClassName("nav-input").click();		
		driver.findElementByXPath("//*[@id='result_" + currentRow.getCell(1).getStringCellValue() + "']/div/div[3]/div[1]/a/h2").click();
		
		break;
		
		
		}
		
		}	

	}


	
