package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class arrayspage {
	
	WebDriver driver =null;
	
	
	By dropdown_btn_array=By.xpath("//div[@class='dropdown-menu show']/a[1]");
	By array_link1=(By.xpath("//body/div[2]/ul[1]/a"));
	
	public arrayspage(WebDriver driver) {
		this.driver=driver;
	}
	
		
	public void selectarray() {
		driver.findElement(dropdown_btn_array).click();
	}
	public void arraylink1() {
		driver.findElement(array_link1).click();
	}
	
	public void arraylinks() {
		
		mainpagerepo mainobj = new mainpagerepo(driver);
		
    int linksnumbers = driver.findElements(By.xpath("//div[@id='content']/li")).size();
    System.out.println("No.of.Links in arrays page:"+linksnumbers);
    for (int i = 1; i<=linksnumbers; i++) {
    	
      WebElement singleLink = driver.findElement(By.xpath("//div[@id='content']/li["+i+"]"));
	   singleLink.click();
//	
//	WebElement tryhereLink = driver.findElement(By.linkText("Try here>>>"));
//	tryhereLink.click();
	
    mainobj.tryit();
    mainobj.editor();
    
	WebElement txtbox = driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea"));
	txtbox.sendKeys("print 8");
	
	WebElement runbutton = driver.findElement(By.xpath("//button[text()='Run']"));
	
	runbutton.click();
	
	driver.navigate().back();
		
    }
    driver.navigate().back();
    driver.navigate().back();
    
	}
}



