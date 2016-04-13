package week3;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//import com.sun.xml.internal.bind.v2.runtime.unmarshaller.TagName;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginOpenTaps extends Wrapper{
	@Test
	public void login () throws InterruptedException {
		
		/*FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://demo1.opentaps.org/opentaps/control/main");
		driver.manage().window().maximize();*/
		
//		launchapp("firefox", "http://demo1.opentaps.org/opentaps/control/main");
		launchapp("Chrome", "http://demo1.opentaps.org/opentaps/control/main");
		enterTextById("username", "DemoSalesManager");
		enterTextById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByXpath("//*[@id='label']/a");
		verifytitle("Shortcuts");
		verifyText("Create Lead");
		
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Test");
		WebElement Sur = driver.findElementById("createLeadForm_dataSourceId");
		Select dropdown = new Select(Sur);
		dropdown.selectByValue("LEAD_DIRECTMAIL");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("LocalTest");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("SaluteTest");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("TestTitle");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("12345788");
		WebElement ind = driver.findElementById("createLeadForm_industryEnumId");
		Select dropdown1 = new Select(ind);
		dropdown1.selectByVisibleText("Computer Software");
		WebElement Own = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dropdown2 = new Select(Own);
		dropdown2.selectByIndex(5);
		driver.findElementById("createLeadForm_sicCode").sendKeys("SIC1234");
		driver.findElementById("createLeadForm_description").sendKeys("About Desctription");
		driver.findElementById("createLeadForm_importantNote").sendKeys("About Important Note");
		
		//ParentAccount
		driver.findElementById("createLeadForm_parentPartyId").sendKeys("DemoAccount1");
		
		driver.findElementById("createLeadForm_lastName").sendKeys("Leaf");
		WebElement Mar = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropdown3 = new Select(Mar);
		dropdown3.selectByValue("DEMO_MKTG_CAMP");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("LocalLeaf");
		WebElement BOD = driver.findElementById("createLeadForm_birthDate");
		BOD.sendKeys("8/11/1990");
		driver.findElementById("createLeadForm_departmentName").sendKeys("TestDept");
		WebElement Pre = driver.findElementById("createLeadForm_currencyUomId");
		Select dropdown4 = new Select (Pre);
		dropdown4.selectByVisibleText("SGD - Singapore Dollar");
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("5");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("TSymbol");
		
		//Contact INformation
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("1");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("Area001");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("123456");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("Test@test.com");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("6789");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Test");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.test.com");
		
		//Primary Address
		driver.findElementById("createLeadForm_generalToName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("collegeroad");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600100");
		driver.findElementById("createLeadForm_vatId").sendKeys("12");
		driver.findElementById("createLeadForm_vatId2").sendKeys("13");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("124");
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("Attname");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Address2");
		
		WebElement Cou = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select dropdown6 = new Select(Cou);
		dropdown6.selectByValue("USA");
		WebElement Stp = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select dropdown5 = new Select(Stp);
		dropdown5.selectByVisibleText("California");
		driver.findElementByName("submitButton").click();
		
		//Create Contact
		driver.findElement(By.linkText("My Home")).click();;
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElementById("firstNameField").sendKeys("Test");
		driver.findElementById("createContactForm_firstNameLocal").sendKeys("LocalTest");
		driver.findElementById("createContactForm_personalTitle").sendKeys("SaluteTest");
		driver.findElementById("createContactForm_generalProfTitle").sendKeys("TestTitle");
		WebElement Pre1 = driver.findElementById("createContactForm_preferredCurrencyUomId");
		Select dropdown7 = new Select (Pre1);
		dropdown7.selectByVisibleText("SGD - Singapore Dollar");
		driver.findElementById("createContactForm_accountPartyId").sendKeys("DemoAccount1");
		driver.findElementById("createContactForm_description").sendKeys("About Desctription");
		driver.findElementById("createContactForm_importantNote").sendKeys("About Important Note");
		driver.findElementById("lastNameField").sendKeys("Leaf");
		driver.findElementById("createContactForm_lastNameLocal").sendKeys("LocalLeaf");
		WebElement BOD1 = driver.findElementById("createContactForm_birthDate");
		BOD1.sendKeys("8/11/1990");
		driver.findElementById("createContactForm_departmentName").sendKeys("TestDept");
		
		//Contact INformation
				driver.findElementById("createContactForm_primaryPhoneCountryCode").sendKeys("1");
				driver.findElementById("createContactForm_primaryPhoneAreaCode").sendKeys("Area001");
				driver.findElementById("createContactForm_primaryPhoneExtension").sendKeys("123456");
				driver.findElementById("createContactForm_primaryEmail").sendKeys("Test@test.com");
				driver.findElementById("createContactForm_primaryPhoneNumber").sendKeys("6789");
				driver.findElementById("createContactForm_primaryPhoneAskForName").sendKeys("Test");
				
				
		//Primary Address
				driver.findElementById("generalToNameField").sendKeys("TestLeaf");
				driver.findElementById("createContactForm_generalAddress1").sendKeys("collegeroad");
				driver.findElementById("createContactForm_generalCity").sendKeys("Chennai");
				driver.findElementById("createContactForm_generalPostalCode").sendKeys("600100");
				driver.findElementById("createContactForm_generalPostalCodeExt").sendKeys("124");
				driver.findElementById("createContactForm_generalAttnName").sendKeys("Attname");
				driver.findElementById("createContactForm_generalAddress2").sendKeys("Address2");
				WebElement Coun = driver.findElementById("createContactForm_generalCountryGeoId");
				Select dropdown8 = new Select(Coun);
				dropdown8.selectByValue("USA");
				WebElement Stpr = driver.findElementById("createContactForm_generalStateProvinceGeoId");
				Select dropdown9 = new Select(Stpr);
				dropdown9.selectByVisibleText("California");
				driver.findElementByName("submitButton").click();
		//verifyURl("http://demo1.opentaps.org/crmsfa/control/createContactForm");
		//switchToFirstFrame("iframe", 2);
		//driver.close();

		}

}




	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	

