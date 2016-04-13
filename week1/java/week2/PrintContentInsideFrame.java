package week2;

import org.openqa.selenium.chrome.ChromeDriver;

public class PrintContentInsideFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/");
	driver.findElementByLinkText("Draggable").click();
	Thread.sleep(3000);
	driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
	String Text = driver.findElementById("draggable").getText();
	System.out.print("Text is : " + Text);
	driver.switchTo().defaultContent();
	driver.findElementByLinkText("Droppable").click();
		
	}
	
}
