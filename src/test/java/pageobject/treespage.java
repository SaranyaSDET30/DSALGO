	package pageobject;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	
	public class treespage {
		
		
	    WebDriver driver =null;
		
	By dropdown_btn_trees=By.xpath("//div[@class='dropdown-menu show']/a[5]");
	By trees_link1=(By.xpath("//body/div[2]/ul[1]/a"));
	By trees_link14=By.linkText("Practice Questions");
	
	public treespage(WebDriver driver) {
	this.driver=driver;
	}
	
	public void selecttrees() {
	driver.findElement(dropdown_btn_trees).click();
	}
	public void treeslink1() {
	driver.findElement(trees_link1).click();
	}
	
	public void treeslinks() {
	
	int linksnumbers = driver.findElements(By.xpath("//div[@id='content']/li")).size();
	System.out.println("No.of.Links in Trees page:"+linksnumbers);
	 
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
	//driver.navigate().back();
	//driver.navigate().back();
	
	}
	
	public void treeslink14() {
	driver.findElement(trees_link14).click();
	}
	
	}
			
	
