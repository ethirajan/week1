package week2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {
	
		public static void main(String[] args) {
			
			//Set the system properties
					System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
					
					// Launch Browser - Google Chrome
					ChromeDriver driver = new ChromeDriver();
					
					// Maximize the browser
					driver.manage().window().maximize();

					// Navigate to URL
					driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
					
					driver.findElementById("loginbutton").click();
	 
			Alert a = driver.switchTo().alert();
					System.out.println(a.getText()); // Gives text of alert
					a.accept(); // OK
				//	a.dismiss(); // Cancel
				 //	a.sendKeys("bata");
					
					System.out.println(driver.getCurrentUrl());
					
			  
		}

	}



