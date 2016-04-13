package week2;

import org.openqa.selenium.chrome.ChromeDriver;

public class FindclassnameinsideFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/draggable/");
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		System.out.println(driver.findElementById("draggable").isDisplayed());
		driver.switchTo().defaultContent();
		driver.findElementByLinkText("Droppable").click();
		driver.quit();
		
	}

}
