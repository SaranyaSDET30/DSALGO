package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class queuespage {
	
	WebDriver driver =null;
	
	By dropdown_btn_queue=By.xpath("//div[@class='dropdown-menu show']/a[4]");
	By queue_link1=(By.xpath("//body/div[2]/ul[1]/a"));
	By queue_link2=By.linkText("Practice Questions");
	
	
	public queuespage(WebDriver driver) {
		this.driver=driver;
	}
	
		
	public void selectqueue() {
		driver.findElement(dropdown_btn_queue).click();
	}
	public void queuelink1() {
		driver.findElement(queue_link1).click();
	}
	
	public void queueslinks() {
		
    int linksnumbers = driver.findElements(By.xpath("//div[@id='content']/li")).size();
    System.out.println("No.of.Links in Queues page:"+linksnumbers);
    for (int i = 1; i<=linksnumbers; i++) {
	
	WebElement singleLink = driver.findElement(By.xpath("//div[@id='content']/li["+i+"]"));
	singleLink.click();
	
	WebElement tryhereLink = driver.findElement(By.linkText("Try here>>>"));
	tryhereLink.click();
	
	WebElement txtbox = driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea"));
	txtbox.sendKeys("print 8");
	
	WebElement runbutton = driver.findElement(By.xpath("//button[text()='Run']"));
	
	runbutton.click();
	
	driver.navigate().back();
		
    }
//    driver.navigate().back();
//    driver.navigate().back();
    
	}

	public void queuelink2() {
		driver.findElement(queue_link2).click();
	}
	

}
