package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class stackspage {
	
				WebDriver driver =null;
		
		By dropdown_btn_stack=By.xpath("//div[@class='dropdown-menu show']/a[3]");
		By stack_link1=(By.xpath("//body/div[2]/ul[1]/a"));
		By stack_link2=By.linkText("Practice Questions");
		
		
		public stackspage(WebDriver driver) {
			this.driver=driver;
		}
		
			
		public void selectstack() {
			driver.findElement(dropdown_btn_stack).click();
		}
		public void stacklink1() {
			driver.findElement(stack_link1).click();
		}
		
		public void stacklinks() {
			
	    int linksnumbers = driver.findElements(By.xpath("//div[@id='content']/li")).size();
	    System.out.println("No.of.Links in Stacks page:"+linksnumbers);
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
//	    driver.navigate().back();
//	    driver.navigate().back();
	    
		}
	
		public void stacklink2() {
			driver.findElement(stack_link2).click();
		}
		
	}
