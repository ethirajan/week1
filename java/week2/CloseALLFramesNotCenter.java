package week2;


import org.openqa.selenium.chrome.ChromeDriver;

public class CloseALLFramesNotCenter {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
		
		driver.findElementByXPath("html/body/div[1]/p[1]/button").click();
		driver.findElementByXPath("html/body/div[2]/p/button").click();
		driver.switchTo().frame(driver.findElementById("childIframe"));
		driver.findElementByXPath("html/body/div[2]/p/button").click();
		driver.findElementByXPath("html/body/div[3]/p/button").click();
		
	}


	}

	


