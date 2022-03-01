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

import Config.config;
import Utils.ExcelUtils;
import Utils.Excelread;
import pageobject.arrayspage;
import pageobject.datastructures;
import pageobject.graphspage;
import pageobject.linkedlistspage;
import pageobject.loginpage;
import pageobject.mainpagerepo;
import pageobject.queuespage;
import pageobject.stackspage;
import pageobject.treespage;

public class testchecks {
	
	static WebDriver driver=null;
	int n=1;    //dropdown values
		
	public static void logincheck() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
       driver.get("https://dsportalapp.herokuapp.com/");		
         
         mainpagerepo mainobj = new mainpagerepo(driver);
         loginpage loginpageobj = new loginpage(driver);
         loginpageobj.maximizewindow();
         loginpageobj.getstart();
         loginpageobj.signin();
        loginpageobj.username(config.USERNAME);
        loginpageobj.password(config.PASSWORD);
         loginpageobj.login(); 
      
	}     
  
	
	
   @Test
	public static void arrayscheck() throws InterruptedException {
		
		logincheck();
		mainpagerepo mainobj = new mainpagerepo(driver);
		arrayspage arraysobj=new arrayspage(driver);
		 mainobj.dropdownbtn();
    	 arraysobj.selectarray();
         arraysobj.arraylink1();
         arraysobj.arraylinks();
	    
	}
	
	
	@Test
	public static void datastructurescheck() throws InterruptedException {
		
		logincheck();
		 mainpagerepo mainobj = new mainpagerepo(driver);
		  
	    datastructures dspageobj=new datastructures(driver);
		dspageobj.getstartedbtn();
		dspageobj.timecomplink();
		mainobj.tryit();
		mainobj.editor();
		mainobj.navigatewindow();
        dspageobj.datastructureslink2();
	
	}

	@Test
	public static void linkedlistcheck() throws InterruptedException {
		
		logincheck();
		mainpagerepo mainobj = new mainpagerepo(driver);
		linkedlistspage linkedlistobj=new linkedlistspage(driver);
		 mainobj.dropdownbtn();
    	 linkedlistobj.selectlinkedlist();
    	 linkedlistobj.linkedlistlink1();
    	 linkedlistobj.linkedlistlinks();
    	 linkedlistobj.linkedlistlink8();
	 
	}
	
	@Test
	
		public static void treescheck() throws InterruptedException {
		
				logincheck();
				mainpagerepo mainobj = new mainpagerepo(driver);
				treespage treesobj=new treespage(driver);
				 mainobj.dropdownbtn();
		    	 treesobj.selecttrees();
		    	 treesobj.treeslink1();
		    	 treesobj.treeslinks();
		    	 treesobj.treeslink14();
			 
	}
	
		@Test
		
			public static void graphscheck() throws InterruptedException {
			
					logincheck();
					mainpagerepo mainobj = new mainpagerepo(driver);
					graphspage graphsobj=new graphspage(driver);
					 mainobj.dropdownbtn();
					 graphsobj.selectgraphs();
					 graphsobj.graphslink1();
					 graphsobj.graphslinks();
					 graphsobj.graphslink2();
				 
		}
	
	@Test
		public static void stackscheck() throws InterruptedException {
				
						logincheck();
						mainpagerepo mainobj = new mainpagerepo(driver);
						stackspage stacksobj=new stackspage(driver);
						 mainobj.dropdownbtn();
						 stacksobj.selectstack();
						 stacksobj.stacklink1();
						 stacksobj.stacklinks();
						 stacksobj.stacklink2();
					 
			}
				
	@Test
				
				public static void queuescheck() throws InterruptedException {
				
						logincheck();
						mainpagerepo mainobj = new mainpagerepo(driver);
						queuespage queuesobj=new queuespage(driver);
						 mainobj.dropdownbtn();
						 queuesobj.selectqueue();
						 queuesobj.queuelink1();
						 queuesobj.queueslinks();
						 queuesobj.queuelink2();
					 
			}

	

//	@AfterClass 
//	void tearDown() {
//		driver.close();
//	}

	
}
