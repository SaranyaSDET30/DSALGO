package testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import Utils.ExcelUtils;
import pageobject.loginpage;

public class logintest {
	
	WebDriver driver;
	
	
		@Test(dataProvider="LoginData")
	
	public void loginTest(String username,String password,String result) throws IOException {
		 
		String path="./ExcelData/Exceltestdata.xlsx";
		String sheetName="Sheet1";
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
         driver= new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
         driver.manage().window().maximize();
         driver.get("https://dsportalapp.herokuapp.com/");	
		
	
		 loginpage loginpageobj = new loginpage(driver);
		
		 
//		WebElement getstarted =  driver.findElement(By.className("btn"));
//		getstarted.click();
//		WebElement signinlink= driver.findElement(By.xpath("//ul/a[@href='/login']"));
//		signinlink.click();
	    
		  loginpageobj.getstart();
		  loginpageobj.signin();
		
					loginpageobj.username(username);
					loginpageobj.password(password);
					loginpageobj.login();
				
			
			
			
			if(result.equals("Valid")) {
				
					driver.findElement(By.linkText("Sign out")).click();
					Assert.assertTrue(true);
					driver.quit();
				}
			else if(result.equals("InValid")){
		//		driver.findElement(By.linkText("Sign out")).click();
				Assert.assertTrue(true);
				}
			
			
		}
//		WebElement usertextbox=driver.findElement(By.name("username"));
//		usertextbox.clear();
//		usertextbox.sendKeys(username);
//		WebElement pwdtextbox=driver.findElement(By.name("password"));
//		pwdtextbox.clear();
//		pwdtextbox.sendKeys(password);	
//		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		
		@DataProvider(name="LoginData")
		public String[][] getData() throws IOException{
			
			//String[][] loginData= {{"saranya88","M@durai2022","Valid"},{"saranya88","pwd","INValid"}};
			
			String path=".\\ExcelData\\Exceltestdata.xlsx";
			String sheetName="Sheet1";
			
			ExcelUtils excelutils=new ExcelUtils(path,sheetName);
			
		  int totalrows=excelutils.getRowCount();
		  int totalcell=excelutils.getCellCount(totalrows);
						
		String loginData1[][]= new String[totalrows][totalcell];
		
		for(int i=1;i<=totalrows;i++) {
			for(int j=0;j<totalcell;j++) {
				
			loginData1[i-1][j]=excelutils.workbook.getSheet(sheetName).getRow(i).getCell(j).toString();
			}
		}
		 return loginData1;
		
		}

	
	}

	
	
