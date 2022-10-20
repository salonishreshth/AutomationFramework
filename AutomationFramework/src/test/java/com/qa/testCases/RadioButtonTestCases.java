package com.qa.testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.CheckBoxPage;
import com.qa.pages.RadioButtonPage;

public class RadioButtonTestCases extends BaseClass{

	RadioButtonPage objRadioButtonPage;

	@BeforeClass
	public void startBrowser() throws Exception, IOException, InterruptedException {
		driver =initializeDriver();
		objRadioButtonPage = new RadioButtonPage(driver);
}
	@Test
	public void VerifyRadioButtonSelection() throws InterruptedException, NumberFormatException, IOException  {

		
		System.out.println("Selenium Code for this test case");
		objRadioButtonPage.launchRadioButtonPage();
		
		objRadioButtonPage.RadioButton1Selection();
		
		Assert.assertTrue(objRadioButtonPage.RadioSelected().contains("Yes"));
		
        objRadioButtonPage.RadioButton2Selection();
		
		Assert.assertTrue(objRadioButtonPage.RadioSelected().contains("Impressive"));
		
		Thread.sleep(5000);
		
	}

	@AfterClass
	public void closeBrowser() {
		closeAllDriver();
	}

	
}
