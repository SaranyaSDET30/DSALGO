package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	
	WebDriver driver=null;
	
	By getstartbtn=By.className("btn");
	By signinlink= By.linkText("Sign in");
	By usernametxtbox=By.name("username");
	By passwordtxtbox=By.name("password");
	By loginbtn=By.xpath("//input[@value=\"Login\"]");
	
	public loginpage(WebDriver driver) {
		
		this.driver=driver;
	}

 public void getstart() {
	 driver.findElement(getstartbtn).click();
	 }
  
 public void signin() {
	 driver.findElement(signinlink).click();
	 }

 public void username(String username) {
		driver.findElement(usernametxtbox).sendKeys(username);
		 }
 public void password(String password) {
	 driver.findElement(passwordtxtbox).sendKeys(password);
	 }

 public void login() {
	 driver.findElement(loginbtn).click();
	 }
 public void maximizewindow() {
		driver.manage().window().maximize();
	}
}
