package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class linkedlistspage {

                 WebDriver driver =null;
	
	By dropdown_btn_linkedlist=By.xpath("//div[@class='dropdown-menu show']/a[2]");
	By linkedlist_link1=(By.xpath("//body/div[2]/ul[1]/a"));
	By linkedlist_link8=By.linkText("Practice Questions");
	
	public linkedlistspage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void selectlinkedlist() {
		driver.findElement(dropdown_btn_linkedlist).click();
	}
	public void linkedlistlink1() {
		driver.findElement(linkedlist_link1).click();
	}
	
	public void linkedlistlinks() {
		
    int linksnumbers = driver.findElements(By.xpath("//div[@id='content']/li")).size();
    System.out.println("No.of.Links in LinkedList page:"+linksnumbers);
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
	
	public void linkedlistlink8() {
		driver.findElement(linkedlist_link8).click();
	}
	
}
