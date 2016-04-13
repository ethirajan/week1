package week2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DropDownCount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		List<WebElement> Count = driver.findElements(By.tagName("select"));
		Thread.sleep(3000);
		System.out.println("No of Dropdown is = " + Count.size());
		
	}

}
