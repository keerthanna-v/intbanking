package com.inetbanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.inetbanking.pageObjects.*;

public class TC_LoginTest_001 extends BaseClass

{
   @Test
   public void LoginTest()
   {
	   driver.get(BaseURL);
	   LoginPage lp = new LoginPage(driver);
	   lp.setUsername(username);
	   lp.setPassword(password);
	   lp.clickSubmit();
	  if (driver.getTitle().equalsIgnoreCase("Guru99 Bank Manager HomePage"))
	  {
		  Assert.assertTrue(true);
	  }
			  
	  else
	  {
		  Assert.assertTrue(false);
	  }
	   
   }
}
