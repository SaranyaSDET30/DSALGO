package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class datastructures {
	
	WebDriver driver=null;
	
	By datastructures_btn = By.xpath("//a[contains(text(),'Get Started')]");
	By timecomplexity_link=By.linkText("Time Complexity");
	By datastructures_link2=By.linkText("Practice Questions");
	
   public datastructures(WebDriver driver) {
	   this.driver=driver;
   }
   
   public void getstartedbtn() {
	   driver.findElement(datastructures_btn).click();
   }
   
   public void timecomplink() {
	   driver.findElement(timecomplexity_link).click();
   }
   
   public void datastructureslink2() {
	   driver.findElement(datastructures_link2).click();
   }
   
}
