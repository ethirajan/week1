package week3;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class OverloadingPractice {
	public static void main(String[] args) {

	}

	public void doLogin() {

	}

	public void doLogin(String loginData, String password) {
		// Use either email id or username
	}

	public void doLogin(String email, String password, String OTP) {

	}

	public void doLogin(String password, int OTP) {

	}

	public void doLogin(int OTP, String password) {

	}

	public void test() {
		//FirefoxDriver driver = new FirefoxDriver();
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
