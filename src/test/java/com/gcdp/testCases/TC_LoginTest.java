package com.gcdp.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.gcdp.pageObjects.LoginPage;

public class TC_LoginTest extends BaseClass {

	@Test
	public void loginTest() throws IOException {
		
 		logger.info("URL is opened");
 		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		logger.info("Entered UserName");
		
		lp.setPassword(password);
		logger.info("Entred Password");
		
		lp.clickSubmit();

		if (driver.getTitle().equals("Guru99 Bank Manager HomePage123"))
		{
			Assert.assertTrue(true);
			logger.info("Login Test Passed");
		} else 
		{
			 
			captureScreen(driver,"loginTest"); 
			Assert.assertTrue(false);
			logger.info("Login Test Failed");
		}
	}

}


