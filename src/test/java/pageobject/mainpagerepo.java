package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class mainpagerepo {
	
	WebDriver driver=null;
	
	By dropdown_btn=By.xpath("//div[@class='nav-item dropdown']");
	By tryit_btn = By.linkText("Try here>>>");
	By editor_code= By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By run_btn=By.xpath("//button[@type='button']");
	
	public mainpagerepo(WebDriver driver) {
		this.driver=driver;
			}
	
	public void dropdownbtn() {
		driver.findElement(dropdown_btn).click();
		int d=1;
	}
	
	public void tryit() {
		   driver.findElement(tryit_btn).click();
	   }
	   
	   public void editor() {
		   driver.findElement(editor_code).sendKeys("print 'hello';");
	   }
		
	   public void runbtn() {
		   driver.findElement(run_btn).click();
	   }
	   
	   public void navigatewindow() {
		   driver.navigate().back(); 
		   	   }
	
	public void closewindow() {
		driver.close();
	}
	public void sleep() throws InterruptedException {
		Thread.sleep(2000);
	}
	

}
