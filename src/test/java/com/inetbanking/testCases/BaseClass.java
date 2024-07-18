package com.inetbanking.testCases;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {

	public String BaseURL = "https://demo.guru99.com/v3/index.php";
	public String username = "mngr578389";
	public String password  = "yzAgavu";
	public static  WebDriver driver; 
	public static int newvariabkle=132;
	//public static Logger logger;
	
	///In Baseclass will have the common things for the testcase
	
	//adding comments
	
	@BeforeClass
	public void setup()
	{
		//Launching Chrome
		driver=new ChromeDriver();
		//logger=(Logger) LogManager.getLogger("ebanking");
	
		
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
}
