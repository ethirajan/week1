package week2;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class MyNameInGoogle {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://google.com/");
	Thread.sleep(3000);
	driver.findElementByClassName("gsfi").sendKeys("Facebook");
	driver.findElementByClassName("sbico").click();
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Thread.sleep(3000);
		
	List<WebElement> linkCount = driver.findElements(By.tagName("a"));
	//List<WebElement> linkCount = driver.findElementsByTagName("a");
	//System.out.println("Total Count " + linkCount.size());
	System.out.println();
	
	for (int i=0;i<linkCount.size();i++){
		 //System.out.println("Link Text is " + linkCount.get(i).getText());
		 if ((linkCount.get(i).getText().equalsIgnoreCase("Facebook")) 
				    && (linkCount.get(i).getSize().getWidth()>20)
				    && (linkCount.get(i).getLocation().getX()>100))
		  {
			  System.out.println("Link Text is " + linkCount.get(i).getText());
			   
			  break;
			  }
			 }
	}
	

	}
	
