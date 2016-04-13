package week2;

import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickCloseMultiplePopup {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://popuptest.com/");
		driver.findElementByLinkText("Multi-PopUp Test #2").click();
		Thread.sleep(3000);
		
		String parentHandle = driver.getWindowHandle();
					
		Set<String> Count = driver.getWindowHandles();
		
		System.out.println("Total windows that are currently opened = " + Count.size());
		
		for (String Temp:Count) 			{
			
			if(!parentHandle.equals(Temp))
		
			{
		driver.switchTo().window(Temp).close();
		
			}
			
		}
		
	
		System.out.println(driver.switchTo().window(parentHandle).getTitle()); 
					
	}

	
}