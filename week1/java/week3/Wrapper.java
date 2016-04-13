package week3;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Wrapper {
	RemoteWebDriver driver;
				
	public void launchapp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			}
			else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
				}

			// "http://demo1.opentaps.org/opentaps/control/main"
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (WebDriverException e) {
			System.out.println("Application could not be launched");
		}
				
		}
		
	
	public void enterTextById(String id, String value) {				//enterTextById
	
		try {
			driver.findElement(By.id(id)).clear();
				driver.findElement(By.id(id)).sendKeys(value);
		
		
			} catch (NoSuchElementException e) {
		
			System.out.println("The element with id :" + "id" + "could not be found");
		}
			
		}

			
	public void clickByClassName(String className) {					//clickByClassName

		try {

			driver.findElement(By.className(className)).click();
		} catch (NoSuchElementException e) {
		
			System.out.println("The element with className : " + className + " could not be found !!");
		}
		}

	
	public void enterByName(String name, String texttoEnter )	{			//enterByName
		try {
			driver.findElement(By.name(name)).clear();
			driver.findElement(By.name(name)).sendKeys("texttoEnter");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("The element with name " + name + "could not found");
		}
		}
	
	
	public void clickByXpath(String Xpath) {							//clickByXpath
		try {
			driver.findElement(By.xpath(Xpath)).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (NoSuchElementException e) {
			System.out.println("The elemnt with Xpath:" + Xpath + "Could not be found");
		}
		
		}
	
	
	public void verifytitle(String title) {								//verifytitle
		try {
			/*WebElement element = driver.findElement(By.tagName("a"));
			String title1 = element.getAttribute("title");*/
			List<WebElement> elements = driver.findElements(By.tagName("a"));
			for (WebElement element : elements) {
			    if (title.equals(element)) {
			        System.out.println("The titele name " + title);
			       }
			}
			
			} catch (NoSuchElementException e) {
			System.out.println("The elemnt with title:" + title + "Could not be found");
		}
		
		}
	
	
	public void verifyText(String text) {								//verifyText
		//System.out.println("The text name is " + text);
		/*try {
			List<WebElement> elements = driver.findElementsByTagName("a");
			for (WebElement element: elements){
					if (text.equals(element)) {
						System.out.println("The text name is " + text);*/
						driver.findElement(By.linkText(text)).click();
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					/*}
				}
		} catch (NoSuchElementException e) {
			System.out.println("The element with Text" + text + "is not found");
		}	*/
		}
	
	public void verifyURl(String url) {										//verifyURl
		try {
		driver.get(url);
			if (url.equalsIgnoreCase("http://demo1.opentaps.org/crmsfa/control/createContactForm")) {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		}
		} catch (NoSuchElementException e) {
		System.out.println("The element with Text" + url + "is not found");
		}
	
		}
	
	
	public void acceptAlert(String value) {									//acceptAlert
		try {
			Alert a = driver.switchTo().alert();
			
			if (value.equalsIgnoreCase("accept")){
			a.accept();
			}
			else if (value.equalsIgnoreCase("dismiss")){
			a.dismiss();
			}
		} catch (NoAlertPresentException e) {
			System.out.println("no alert open" + value );
		}
			
		}
		
	
	public void switchToFirstFrame(String tagname, int FrameNo) {			//switchToFirstFrame
		try {
			List <WebElement> Frames = driver.findElements(By.tagName("tagname"));
			int i,count = Frames.size();
			for (i=0; i<count; i++){
				driver.switchTo().frame(i);
				if(i == FrameNo){
					driver.switchTo().defaultContent();
					System.out.println("Frame switchTo FirstFrame" + FrameNo );
				}
			}
			} catch (NoSuchFrameException e) {
			System.out.println("NoSuchFrame");
			}
		}
	
	
	public void switchToFrameByElement(String ClassName) {					//switchToFrameByElement
		
		try {
			driver.switchTo().frame(driver.findElementByClassName(ClassName));
			System.out.println(driver.findElementById("draggable").isDisplayed());
			driver.switchTo().defaultContent();
		} catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
			System.out.println("NoSuchFrame");
		}
		}
	
	
	public void switchToLastwindow (int value) {					//switchToLastwindow
		try {
			Set<String> allwindows =driver.getWindowHandles();

			int i=value, count = allwindows.size();
			for (String eachWindow : allwindows) {
				driver.switchTo().window(eachWindow);
				driver.close();
				if (i == count){
					System.out.println("This is last window");
					break;
				}
				i++;
				}
		} catch (NoSuchWindowException e) {
			System.out.println("No Such Window");
		}
		}
	
	
	
	public void switchToPrimaryWindow(String Primary) {				//switchToPrimaryWindow
		try {
			String parentWindowHandle = driver.getWindowHandle();
			Set<String> Allwindows = driver.getWindowHandles();
			for (String Temp:Allwindows) 			{
				
				if(Primary.equalsIgnoreCase("parent"))
				{
					if 	(parentWindowHandle.equals(Temp))
			
				{
			driver.switchTo().window(parentWindowHandle);
			
				}
				}
			}
		} catch (NoSuchWindowException e) {
			System.out.println("No Such Window");
		}
		
		}
	
	
	
	public void selectbyIndex(String id, int indexnum) {				//selectbyIndex
		try {

			{
				Select dropdown = new Select(driver.findElement(By.id(id)));
				dropdown.selectByIndex(indexnum);

			}
		} catch (NoSuchElementException e) {
			System.out.println("List doesn't Related with Index value: " + indexnum);
		}

	}
}
	
