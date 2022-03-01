package testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Config.config;
import Utils.Excelread;
import pageobject.loginpage;
import pageobject.mainpagerepo;

public class testngtest {
	
	static WebDriver driver=null;

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
    //    loginpageobj.username(config.USERNAME);
     //   loginpageobj.password(config.PASSWORD);
      //   loginpageobj.login(); 
      
	}     
//
//@DataProvider(name="loginfunction")
//
//public Object[][] logindp() throws IOException{
//
//	Excelread excelread=new Excelread(".\\ExcelData\\Exceltestdata.xlsx","Sheet1");
//	Object object[][]=excelread.getData(".\\ExcelData\\Exceltestdata.xlsx","Sheet1");
//	return object;
//}


	@Test   //(dataProvider="loginfunction")
	
	public void loginTest() throws IOException, InterruptedException {
		
		logincheck();
	
		loginpage loginpageobj = new loginpage(driver);
		
		
		    
		Excelread excelread=new Excelread(".\\ExcelData\\Exceltestdata.xlsx","Sheet1");
		String[][] loginData= new String[2][2];
			loginData=	excelread.getData(".\\ExcelData\\Exceltestdata.xlsx","Sheet1");
		String result;
//		for(int i=0;i<loginData.length;i++) {
//			
//			for(int j=0;j<loginData[i].length;j++) {	
//				
//				loginpageobj.username(loginData[i][j]);
//				loginpageobj.password(loginData[i][j+1]);
//				result=loginData[i][j+2];
//				j++;
//			}}

		System.out.println("Inside for loop"+loginData.length);
		for(int i=0;i< loginData.length;i++) {
		for(int j=0;j<loginData[i].length;j++) {
			System.out.println(i+""+j);
			loginpageobj.username(loginData[i][j]);
			loginpageobj.password(loginData[i][j+1]);
			//j++;
		}
	}
		loginpageobj.login();
			
		//	driver.findElement(By.linkText("Sign out")).click();
		
		}
	
		
	//	if(result.equals("Valid")) {
//	     		driver.findElement(By.linkText("Sign out")).click();
//				Assert.assertTrue(true);
//				for(int i=1;i<=n;i++) {
//					
//					switch(i) {
//					case 1:{
//						System.out.println("Starting of Arrays");
//						arrayscheck();
//						System.out.println("Ending of Arrays");
//					}
//		
//					}
//				}
//						
//			}
//		else if(result.equals("Invalid")){
//			driver.findElement(By.linkText("Sign out")).click();
//			Assert.assertTrue(false);
//			}
//	}
//	
	
}
