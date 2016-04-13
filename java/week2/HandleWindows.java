package week2;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindows {

	public static void main(String[] args) {

		// Set the system properties
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Launch Browser - Google Chrome
		ChromeDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		// Navigate to URL
		driver.get("http://www.crystalcruises.com/");

		// Primary window handle
		String parentWindowHandle = driver.getWindowHandle();

		System.out.println("The parent window: "+parentWindowHandle);


		// Click on the Guest check in
		driver.findElementByLinkText("GUEST CHECK-IN").click();

		// Get all windows
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println("The number of windows are :"+allWindows.size());

		// loop through each
		for (String eachWindow : allWindows) {
			driver.switchTo().window(eachWindow);
			System.out.println("The window handle is "+driver.getWindowHandle());
			System.out.println(driver.getTitle());
		}

		// Where am I ?? First or Second??		
		driver.findElementByLinkText("click here").click();
		System.out.println("*****************************");

		allWindows = driver.getWindowHandles();
		System.out.println("The number of windows now are :"+allWindows.size());
		int i = 1;
		// loop through each
		for (String eachWindow : allWindows) {
			driver.switchTo().window(eachWindow);
			System.out.println("The window handle is "+driver.getWindowHandle());
			System.out.println(driver.getTitle());

			if(i==2){
				//driver.quit();
				System.out.println("Come out of the  when am at the second window");
				break;
			}
			i++;
		}

		driver.switchTo().window(parentWindowHandle);














	}

}

