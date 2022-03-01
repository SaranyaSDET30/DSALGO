package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowser {
	
	WebDriver driver=null;
	
	@Parameters("browserName")
	@BeforeTest
	
	public void setup(String browserName) {
		
		System.out.println("Browser name is:"+browserName);
		System.out.println("Thread count:"+Thread.currentThread().getId());
		if(browserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
	         driver= new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("edge")) {
			
			System.setProperty("webdriver.edge.driver","C:\\Selenium\\Microsoft Edge\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
	}

	@Test
	public void corssbrowsertest() throws InterruptedException {
		
		   driver.get("https://dsportalapp.herokuapp.com/");	
		  Thread.sleep(2000);
		  System.out.println("Tested Successfully");
		
	}
	
	
}
