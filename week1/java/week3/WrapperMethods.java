package week3;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class WrapperMethods extends Wrapper {

	@Test
	public void login(){
		launchapp("chrome","https://www.irctc.co.in/eticketing/loginHome.jsf");
		//enterTextById("", "");
		driver.findElement(By.id("loginbutton")).click();
		Alert a = driver.switchTo().alert();
		a.dismiss();//cancel
		acceptAlert("accept");
		
		
		
	}
	
	
}
